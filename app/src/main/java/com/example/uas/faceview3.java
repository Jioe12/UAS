package com.example.uas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class faceview3 extends View {
    public faceview3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //gambar1
        Paint green = new Paint();
        green.setARGB(255,0,255,0);
        green.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(new RectF(100,100,300,300),green);

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
        canvas.drawRect(new RectF(300,100,500,300),blue);

        //gambar3
        canvas.drawRect(new RectF(500,100,700,300),black);

        //gambar4
        canvas.drawRect(new RectF(700,100,900,300),red);




    }
}