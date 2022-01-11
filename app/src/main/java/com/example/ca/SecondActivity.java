package com.example.ca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ListFragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    int winCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //
        Chronometer chronometer = (Chronometer) findViewById(R.id.timer); // initiate a chronometer
        chronometer.start(); // start a chronometer

        //Second activity - also has a grid but it is now 3x4


        //if selected same, both will stay as it is
        //
        //When all of them matches, bring user back to main activity

        ArrayList<Bitmap> images = MainActivity.selected;
        ArrayList<Bitmap> newBit = new ArrayList<Bitmap>();
        ArrayList<Bitmap> bitpos = new ArrayList<Bitmap>();
        ArrayList<Bitmap> bitcount = new ArrayList<Bitmap>();
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<ImageView> varray = new ArrayList<ImageView>();


        for (Bitmap img : images) {
            newBit.add(img);
        }

        images.addAll(newBit);


        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        for (int j = 0; j < 12; j++) {
            Bitmap b1 = images.get(numbers.get(j));
            bitpos.add(b1); //Add into new array for index use
            Bitmap b2 = bitpos.get(j);

        }



        ImageView show1 = findViewById(R.id.imgs1);
        show1.setImageBitmap(null);
        show1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(IsNullOrEmptyDrawable(show1)) {
                    Bitmap img = bitpos.get(0);
                    show1.setImageBitmap(img);
                    bitcount.add(img);
                    varray.add(show1);

                    checkSame(bitcount, varray);

                }
            }

        });

        ImageView show2 = findViewById(R.id.imgs2);
        show2.setImageBitmap(null);
        show2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(IsNullOrEmptyDrawable(show2)) {
                    Bitmap img = bitpos.get(1);
                    show2.setImageBitmap(img);
                    bitcount.add(img);
                    varray.add(show2);
                    checkSame(bitcount, varray);

                }
            }

        });

        ImageView show3 = findViewById(R.id.imgs3);
        show3.setImageBitmap(null);
        show3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(IsNullOrEmptyDrawable(show3)){
                    Bitmap img = bitpos.get(2);
                    show3.setImageBitmap(img);
                    bitcount.add(img);
                    varray.add(show3);
                    checkSame(bitcount, varray);


                }
            }

        });
        ImageView show4 = findViewById(R.id.imgs4);
        show4.setImageBitmap(null);
        show4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(IsNullOrEmptyDrawable(show4)){
                    Bitmap img = bitpos.get(3);
                    show4.setImageBitmap(img);
                    bitcount.add(img);
                    varray.add(show4);
                    checkSame(bitcount, varray);

                }
            }

        });
        ImageView show5 = findViewById(R.id.imgs5);
        show5.setImageBitmap(null);
        show5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(IsNullOrEmptyDrawable(show5)){
                    Bitmap img = bitpos.get(4);
                    show5.setImageBitmap(img);
                    bitcount.add(img);
                    varray.add(show5);
                    checkSame(bitcount, varray);


                }
            }

        });
        ImageView show6 = findViewById(R.id.imgs6);
        show6.setImageBitmap(null);
        show6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(IsNullOrEmptyDrawable(show6)){
                    Bitmap img = bitpos.get(5);
                    show6.setImageBitmap(img);
                    bitcount.add(img);
                    varray.add(show6);
                    checkSame(bitcount, varray);

                }
            }

        });

        ImageView show7 = findViewById(R.id.imgs7);
        show7.setImageBitmap(null);
        show7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(IsNullOrEmptyDrawable(show7)){
                    Bitmap img = bitpos.get(6);
                    show7.setImageBitmap(img);
                    bitcount.add(img);
                    varray.add(show7);
                    checkSame(bitcount, varray);

                }
            }

        });

        ImageView show8 = findViewById(R.id.imgs8);
        show8.setImageBitmap(null);
        show8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(IsNullOrEmptyDrawable(show8)){
                    Bitmap img = bitpos.get(7);
                    show8.setImageBitmap(img);
                    bitcount.add(img);
                    varray.add(show8);
                    checkSame(bitcount, varray);

                }
            }

        });

        ImageView show9 = findViewById(R.id.imgs9);
        show9.setImageBitmap(null);
        show9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(IsNullOrEmptyDrawable(show9)){
                    Bitmap img = bitpos.get(8);
                    show9.setImageBitmap(img);
                    bitcount.add(img);
                    varray.add(show9);
                    checkSame(bitcount, varray);

                }
            }

        });

        ImageView show10 = findViewById(R.id.imgs10);
        show10.setImageBitmap(null);
        show10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(IsNullOrEmptyDrawable(show10)){
                    Bitmap img = bitpos.get(9);
                    show10.setImageBitmap(img);
                    bitcount.add(img);
                    varray.add(show10);
                    checkSame(bitcount, varray);

                }
            }
        });

        ImageView show11 = findViewById(R.id.imgs11);
        show11.setImageBitmap(null);
        show11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(IsNullOrEmptyDrawable(show11)){
                    Bitmap img = bitpos.get(10);
                    show11.setImageBitmap(img);
                    bitcount.add(img);
                    varray.add(show11);
                    checkSame(bitcount, varray);

                }
            }
        });

        ImageView show12 = findViewById(R.id.imgs12);
        show12.setImageBitmap(null);
        show12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(IsNullOrEmptyDrawable(show12)){
                    Bitmap img = bitpos.get(11);
                    show12.setImageBitmap(img);
                    bitcount.add(img);
                    varray.add(show12);
                    checkSame(bitcount, varray);

                }
            }
        });

    }



        public void checkSame(ArrayList<Bitmap> bitcount, ArrayList<ImageView> varray){

                if (winCounter < 5) {
                    if(bitcount.size() == 3) {
                        Bitmap b1 = bitcount.get(0);
                        Bitmap b2 = bitcount.get(1);

                    if (!b1.sameAs(b2)) {
                        for (ImageView imgv : varray) {
                            imgv.setImageBitmap(null);
                        }
                        bitcount.clear();
                        varray.clear();

                    } else {
                        ImageView img1 = varray.get(0);
                        ImageView img2 = varray.get(1);
                        ImageView img3 = varray.get(2);
                        img1.setImageBitmap(b1);
                        img2.setImageBitmap(b2);
                        winCounter++;
                        img3.setImageBitmap(null);
                        bitcount.clear();
                        varray.clear();
                        System.out.println(winCounter);
                    }
                } else if(winCounter == 5){
                    if(bitcount.size() == 2) {
                        Bitmap b1 = bitcount.get(0);
                        Bitmap b2 = bitcount.get(1);

                        if (!b1.sameAs(b2)) {
                            for (ImageView imgv : varray) {
                                imgv.setImageBitmap(null);
                            }
                            bitcount.clear();
                            varray.clear();

                        } else {
                            ImageView img1 = varray.get(0);
                            ImageView img2 = varray.get(1);
                            img1.setImageBitmap(b1);
                            img2.setImageBitmap(b2);
                            winCounter++;
                            bitcount.clear();
                            varray.clear();
                            System.out.println(winCounter);
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                        }

                }
                ;
            }

        }
    }

        public boolean checkMatch(ArrayList<Bitmap> bitcount){
            if(bitcount.size() == 3){
                Bitmap b1 = bitcount.get(0);
                Bitmap b2 = bitcount.get(1);
                if (b1.sameAs(b2)) {
                   return true;
                }
            }
            return false;
        }

        public static boolean IsNullOrEmptyDrawable(ImageView iv)
        {
            Drawable drawable = iv.getDrawable();
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable)drawable : null;

            return bitmapDrawable == null || bitmapDrawable.getBitmap() == null;
        }
    }

