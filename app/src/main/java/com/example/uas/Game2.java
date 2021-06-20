package com.example.uas;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Locale;
import java.util.Random;

public class Game2 extends AppCompatActivity {
    TextView input;
    Button speak;
    TextToSpeech tts;

    // button pilgan
    Button button12, button22, button32, button42 ;
    //
    private int angka1, angka2, angka3, angka4;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        soal();
        start();
    }

    private void soal() {
        angka1 = 8;// jawaban kunci
        Random rnd = new Random();//random angka untuk jawaban

        angka2 = rnd.nextInt(10);//rnd
        angka3 = rnd.nextInt(10);
        angka4 = rnd.nextInt(10);

        // cek jawaban agar tidak sama dengan kunci
        if(angka2 == angka1){

            angka2 = angka2 -1;
        }
        else{
            angka2 =angka2 ;
        }

        if(angka3 == angka1){
            angka3 = angka3 -3;
        }
        else{
            angka3 =angka3 ;
        }

        if(angka4 == angka1){
            angka4 = angka4 +10;
        }
        else{
            angka4 =angka4 ;
        }

        button12 =(Button) findViewById(R.id.button12);//inisialisasi button
        button22 =(Button) findViewById(R.id.button22);
        button32 = (Button) findViewById(R.id.button32);
        button42 = (Button) findViewById(R.id.button42);

        //text untuk menampilkan jawaban
        TextView jwb1 = (TextView) findViewById(R.id.button12);
        jwb1.setText(""+angka2);

        TextView jwb2 = (TextView) findViewById(R.id.button22);
        jwb2.setText(""+angka3);

        TextView jwb3 = (TextView) findViewById(R.id.button32);
        jwb3.setText(""+angka1);

        TextView jwb4 = (TextView) findViewById(R.id.button42);
        jwb4.setText(""+angka4);

    }

    void start() {
        input = (TextView) findViewById(R.id.input2);
        speak = (Button) findViewById(R.id.speak2);
        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    // Inisialisasi bahasa yang digunakan disini menggunakan bahasa Indonesia
                    int result = tts.setLanguage(new Locale("id", "ID"));
                    // Logika untuk mengecek bahasa data bahasa hilang atau tidak dan mengecek apakah bahasa didukung atau tidak
                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "This language is not supported");
                    } else {
                        speak.setEnabled(true);
                    }
                } else {
                    Log.e("TTS", "initialization failed");
                }
            }
        });
        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                say();
            }
        });
    }
    void say() {
        String text = input.getText().toString();
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }
    @Override
    protected void onDestroy() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    public void Button12Clicked(View view) {
        Intent intent = new Intent(this,hasil22.class);
        startActivity(intent);//ketika button di klik menusju hasi22
    }
    public void Button22Clicked(View view) {
        Intent intent = new Intent(this,hasil22.class);
        startActivity(intent);//ketika button di klik menusju hasil22
    }
    public void Button32Clicked(View view) {
        Intent intent = new Intent(this,hasil2.class);
        startActivity(intent);//ketika button di klik menusju hasil2
    }
    public void Button42Clicked(View view) {
        Intent intent = new Intent(this,hasil22.class);
        startActivity(intent);//ketika button di klik menusju hasil22
    }


}