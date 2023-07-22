package com.example.pestgon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    private Button Home;
    private Button Home1;
    private Button Home2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Home = findViewById(R.id.next);
        Home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, DashBoadTutor.class);
                startActivity(intent);

            }
        });

        Home1 = findViewById(R.id.next2);
        Home1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(Home.this, DashBoardTutor1.class);
                startActivity(intent1);
            }
        });


        Home1 = findViewById(R.id.next3);
        Home1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Home.this, DashBoardtutor2.class);
                startActivity(intent2);

            }
        });
    }
     @Override
        public void onBackPressed() {
         AlertDialog.Builder alertmessage=new AlertDialog.Builder(Home.this);
         alertmessage.setMessage("Are you sure you want exit?");
         alertmessage.setCancelable(true);
         alertmessage.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {

                 finishAffinity();
             }
         });
         alertmessage.setNegativeButton("No", new DialogInterface.OnClickListener() {

             @Override
             public void onClick(DialogInterface dialog, int which) {
                 dialog.dismiss();
             }

});
         alertmessage.show();

    }}