package com.example.todolistactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Thread thread = new Thread(){
          public void run(){

              try {
                  sleep(4000);
                  Intent i = new Intent(getApplicationContext(),MainActivity.class);
                  startActivity(i);
                  finish();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }

        };
       thread.start();
    }
}
