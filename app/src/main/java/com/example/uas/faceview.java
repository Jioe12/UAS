package com.example.uas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class faceview extends View {
    public faceview(Context context, @Nullable AttributeSet attrs) {
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
        canvas.drawOval(new RectF(140,140,170,170),blue);
        canvas.drawOval(new RectF(230,140,260,170),blue);

        Paint black = new Paint();
        black.setARGB(255,0,0,0);
        black.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(190,180,210,200),black);

        Paint red = new Paint();
        red.setARGB(255,255,0,0);
        red.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(170,230,230,250),red);

        //gambar2
        Paint green1 = new Paint();
        green1.setARGB(255,0,255,0);
        green1.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(200,200,400,400),green);

        blue.setARGB(255,0,0,255);
        blue.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(240,240,270,270),blue);
        canvas.drawOval(new RectF(330,240,360,270),blue);

        black.setARGB(255,0,0,0);
        black.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(290,280,310,300),black);

        red.setARGB(255,255,0,0);
        red.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(270,330,330,350),red);


        //gambar3
        green1.setARGB(255,0,255,0);
        green1.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(300,300,500,500),green);

        blue.setARGB(255,0,0,255);
        blue.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(340,340,370,370),blue);
        canvas.drawOval(new RectF(430,340,460,370),blue);

        black.setARGB(255,0,0,0);
        black.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(390,380,410,400),black);

        red.setARGB(255,255,0,0);
        red.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(370,430,430,450),red);


        //gambar4
        green1.setARGB(255,0,255,0);
        green1.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(500,300,700,500),green);

        blue.setARGB(255,0,0,255);
        blue.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(540,340,570,370),blue);
        canvas.drawOval(new RectF(630,340,660,370),blue);

        black.setARGB(255,0,0,0);
        black.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(590,380,610,400),black);

        red.setARGB(255,255,0,0);
        red.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(570,430,630,450),red);


        //gambar5
        green1.setARGB(255,0,255,0);
        green1.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(600,200,800,400),green);

        blue.setARGB(255,0,0,255);
        blue.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(640,240,670,270),blue);
        canvas.drawOval(new RectF(730,240,760,270),blue);

        black.setARGB(255,0,0,0);
        black.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(690,280,710,300),black);

        red.setARGB(255,255,0,0);
        red.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(670,330,730,350),red);



    }
}