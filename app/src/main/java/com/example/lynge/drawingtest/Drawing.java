package com.example.lynge.drawingtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Drawing extends AppCompatActivity {
    myView ScreenView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_drawing);
        ScreenView = new myView(Drawing.this);
        setContentView(ScreenView);

    }




}
