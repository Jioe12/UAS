package com.example.uas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class faceview2 extends View {
    public faceview2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //gambar1
        Paint green = new Paint();
        green.setARGB(255,0,255,0);
        green.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(100,100,300,300),green);

        Paint blue = new Paint();
        blue.setARGB(255,0,0,255);
        blue.setStyle(Paint.Style.FILL_AND_STROKE);

        Paint black = new Paint();
        black.setARGB(255,0,0,0);
        black.setStyle(Paint.Style.FILL_AND_STROKE);

        Paint red = new Paint();
        red.setARGB(255,255,0,0);
        red.setStyle(Paint.Style.FILL_AND_STROKE);

        //gambar2
        Paint green1 = new Paint();
        green1.setARGB(255,0,255,0);
        green1.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(200,200,400,400),red);

        //gambar3
        canvas.drawOval(new RectF(300,300,500,500),black);

        //gambar4
        canvas.drawOval(new RectF(500,300,700,500),black);

        //gambar5
        canvas.drawOval(new RectF(600,200,800,400),red);

        //gambar6
        canvas.drawOval(new RectF(700,100,900,300),green);

        //gambar7
        green1.setARGB(255,0,255,0);
        green1.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(400,50,600,250),green);

        //gambar8
        green1.setARGB(255,0,255,0);
        green1.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(400,200,600,400),blue);


    }
}