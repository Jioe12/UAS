package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hasil3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil3);
    }
    public void next3(View view) {
        Intent intent = new Intent(hasil3.this,MainActivity.class);
        startActivity(intent);//ketika button di klik menusju hasil1
    }
}