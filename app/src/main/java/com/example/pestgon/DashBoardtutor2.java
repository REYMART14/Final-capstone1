package com.example.pestgon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;

public class DashBoardtutor2 extends AppCompatActivity {
    private Button HomeMainact;
    Timer timer;
    VideoView vd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_boardtutor2);

        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(DashBoardtutor2.this, HomeMainActivity4.class);
                startActivity(intent);
                finish();

            }
        },10000);
        HomeMainact = findViewById(R.id.next);
        HomeMainact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardtutor2.this, HomeMainActivity4.class);
                startActivity(intent);

            }});

        vd=findViewById(R.id.v);
        vd.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.w);
        MediaController med=new MediaController(this);
        vd.setMediaController(med);
        med.setAnchorView(vd);
        vd.start();

        Animation anim = new AlphaAnimation(0.0f,1.0f);
        anim.setDuration(500);
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        HomeMainact.startAnimation(anim);

    }}