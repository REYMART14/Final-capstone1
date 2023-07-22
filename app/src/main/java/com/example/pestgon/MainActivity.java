package com.example.pestgon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    TextView textView;
    int value;
    Handler handler= new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=findViewById(R.id.progressBarid);
        textView=findViewById(R.id.textviewid);


        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                startProgress();
                Intent intent=new Intent(MainActivity.this,Home.class);
                startActivity(intent);

            }
        });
        thread.start();

    }
    public void startProgress() {
        for (value=0;value<100;value=value+1) {
            try {
                Thread.sleep(60);
                progressBar.setProgress(value);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            handler.post(new Runnable() {
                @Override
                public void run() {
                    textView.setText(String.valueOf(value));

                }
            });

        }

    }}