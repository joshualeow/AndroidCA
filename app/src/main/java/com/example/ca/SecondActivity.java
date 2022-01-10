package com.example.ca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ListFragment;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Chronometer;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Second activity - also has a grid but it is now 3x4
        //
        Chronometer simpleChronometer = (Chronometer) findViewById(R.id.timer); // initiate a chronometer
        simpleChronometer.start(); // start a chronometer

        //Only 6 images passed to 2nd activity, allow users to choose
        //Show that image has been selected.
        //
        ArrayList<Bitmap> images = MainActivity.selected;


        //if selected same, both will stay as it is
        //
        //When all of them matches, bring user back to main activity

    }
}