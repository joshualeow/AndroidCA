package com.example.ca;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    static Bitmap[] fetched;
    static ArrayList<Bitmap> selected = new ArrayList<>();

    private  ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetched = new Bitmap[20];
        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(20);

        Button btn = findViewById(R.id.btnSubmitUrl);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = v.getRootView().findViewById(R.id.txtUrl);
                String url = et.getText().toString();

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        //get the html page as String
                        String html = getHtml(url);
                        //get the image urls as a list of String
                        ArrayList<String> pics = (ArrayList<String>) getImgSrc(html);
                        //get the first 20 images (in bgThread) to store in fetched:Bitmap[]
                        //meanwhile render the UI (in mainThread)
                        for(Bitmap bm: fetched){
                            bm = null;
                        }
                        int num = 0;
                        for(String pic: pics){
                            Bitmap bitmap = getBitmapFromURL(pic);
                            if(bitmap != null){
                                fetched[num] = bitmap;
                                num++;
                                runOnUiThread(new myRunnable(num, v, fetched, progressBar));
                                if(num == 20){
                                    break;
                                }
                            }
                        }
                    }
                }).start();

            }
        });
    }

    public static List<String> getImgSrc(String htmlStr) {
        if( htmlStr == null ){
            return null;
        }
        String img = "";
        Pattern p_image;
        Matcher m_image;
        List<String> pics = new ArrayList<String>();
        String regEx_img = "<img.* src=\\s*(.*?)[^>]*?>";
        p_image = Pattern.compile(regEx_img, Pattern.CASE_INSENSITIVE);
        m_image = p_image.matcher(htmlStr);
        while (m_image.find()) {
            img = m_image.group();
            Matcher m = Pattern.compile(" src\\s*=\\s*\"?(.*?)(\"|>|\\s+)").matcher(img);
            while (m.find()) {
                pics.add(m.group(1));
            }
        }
        return pics;
    }

    public String getHtml(String urlString){
        String html = "";
        try {
            URL url = new URL(urlString);
            try {
                InputStream is = url.openStream();
                InputStreamReader isr = new InputStreamReader(is,"utf-8");

                BufferedReader br = new BufferedReader(isr);
                String data = br.readLine();
                while (data != null){
                    html = html + data;
                    data = br.readLine();
                }
                br.close();
                isr.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return html;
    }

    public Bitmap getBitmapFromURL(String src) {
        try {
            URL url = new URL(src);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            return myBitmap;
        } catch (IOException e) {
            return null;
        }
    }

}