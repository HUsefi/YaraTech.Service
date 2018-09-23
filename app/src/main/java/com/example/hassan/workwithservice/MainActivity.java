package com.example.hassan.workwithservice;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView textView  = findViewById(R.id.text_view_sum);

        final Handler handler = new Handler();
        final int delay = 10000; //milliseconds
        final Random random = new Random();
        final int[] sum = {0};

        handler.postDelayed(new Runnable(){
            public void run(){
                //do something
                sum[0] += 10;
                Toast.makeText(MainActivity.this,sum[0]+"",Toast.LENGTH_SHORT).show();
                textView.setText("Helo world!!");
                handler.postDelayed(this, delay);
            }
        }, delay);


    }
    // Method to start the service
    public void startService(View view) {
        startService(new Intent(getBaseContext(), MyService.class));
    }

    // Method to stop the service
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), MyService.class));
    }
}
