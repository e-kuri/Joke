package com.example.admin.joke;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new Handler();
    }

    public void onClick(View view) {
        Intent service = new Intent(this, DelayedMessageService.class);
       // service.putExtra("TEXT", "ChupacaBROS!!");
        startService(service);
    }
}
