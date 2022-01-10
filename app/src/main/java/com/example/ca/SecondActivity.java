package com.example.ca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ListFragment;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Chronometer;

import java.util.ArrayList;
import java.util.Random;

public class SecondActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //
        Chronometer simpleChronometer = (Chronometer) findViewById(R.id.timer); // initiate a chronometer
        simpleChronometer.start(); // start a chronometer

        //Second activity - also has a grid but it is now 3x4
        ArrayList<Bitmap> images = MainActivity.selected;

//        for(Bitmap img: images){
//            images.add(img);
//        }
//
//        Random rn = new Random();
//        int rand = rn.nextInt(12);



        //if selected same, both will stay as it is
        //
        //When all of them matches, bring user back to main activity

    }
}