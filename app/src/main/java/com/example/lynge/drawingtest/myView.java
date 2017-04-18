package com.example.lynge.drawingtest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;


public class myView  extends View {
    Paint myPaint;
    Rect Myrect;


    public myView(Context context) {
        super(context);
        myPaint = new Paint();
        myPaint.setColor(Color.BLUE);
        Myrect = new Rect();

        myPaint.setStyle(Paint.Style.FILL);


    }
@Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Myrect.set(100,100,200,200);
        canvas.drawRect(Myrect, myPaint);


    }
}

