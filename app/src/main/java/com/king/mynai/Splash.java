package com.king.mynai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Splash extends AppCompatActivity {

    WebView pageYetu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        pageYetu = findViewById(R.id.webYetu2);
        WebSettings settingsb = pageYetu.getSettings();
        settingsb.setJavaScriptEnabled(true);

       // pageYetu.loadUrl("file:///android_asset/splash.html");
        pageYetu.loadUrl("https://www.google.com/");



        Thread splash = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(3000);

                    Intent go = new Intent(Splash.this,MainActivity.class);
                    startActivity(go);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        splash.start();
    }
}

