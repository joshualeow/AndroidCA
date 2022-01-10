package com.example.ca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ListFragment;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Chronometer;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class SecondActivity extends AppCompatActivity {

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

        for (Bitmap img : images) {
            newBit.add(img);
        }

        images.addAll(newBit);


        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 12; i++)
        {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        for(int j = 0; j < 12; j++){
            Bitmap b1 = images.get(numbers.get(j));
            ImageView iv = null;
            switch (j) {
                case 0:
                    iv = findViewById(R.id.imgs1);
                    iv.setImageBitmap(b1);
                    break;
                case 1:
                    iv = findViewById(R.id.imgs2);
                    iv.setImageBitmap(b1);
                    break;
                case 2:
                    iv = findViewById(R.id.imgs3);
                    iv.setImageBitmap(b1);
                    break;
                case 3:
                    iv = findViewById(R.id.imgs4);
                    iv.setImageBitmap(b1);
                    break;
                case 4:
                    iv = findViewById(R.id.imgs5);
                    iv.setImageBitmap(b1);
                    break;
                case 5:
                    iv = findViewById(R.id.imgs6);
                    iv.setImageBitmap(b1);
                    break;
                case 6:
                    iv = findViewById(R.id.imgs7);
                    iv.setImageBitmap(b1);
                    break;
                case 7:
                    iv = findViewById(R.id.imgs8);
                    iv.setImageBitmap(b1);
                    break;
                case 8:
                    iv = findViewById(R.id.imgs9);
                    iv.setImageBitmap(b1);
                    break;
                case 9:
                    iv = findViewById(R.id.imgs10);
                    iv.setImageBitmap(b1);
                    break;
                case 10:
                    iv = findViewById(R.id.imgs11);
                    iv.setImageBitmap(b1);
                    break;
                case 11:
                    iv = findViewById(R.id.imgs12);
                    iv.setImageBitmap(b1);
                    break;
            }

        }
    }
}
