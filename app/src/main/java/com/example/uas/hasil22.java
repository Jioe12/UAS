package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hasil22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil22);
    }
    public void next22(View view) {
        Intent intent = new Intent(hasil22.this,Game3.class);
        startActivity(intent);//ketika button di klik menusju hasil1
    }
}