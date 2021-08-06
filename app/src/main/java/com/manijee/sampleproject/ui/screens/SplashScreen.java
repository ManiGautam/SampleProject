package com.manijee.sampleproject.ui.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.manijee.sampleproject.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Runnable task=new Runnable() {
            @Override
            public void run() {
                Intent callLogin=new Intent(SplashScreen.this,LoginActivity.class);
                startActivity(callLogin);
            }
        };
        new Handler().postDelayed(task,5000);

    }
}