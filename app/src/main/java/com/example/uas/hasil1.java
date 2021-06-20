package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hasil1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil1);
    }
    public void next1(View view) {
        Intent intent = new Intent(hasil1.this,Game2.class);
        startActivity(intent);//ketika button di klik menusju hasil1
    }
}