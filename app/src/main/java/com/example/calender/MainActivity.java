package com.example.calender;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread welcomeThread = new Thread() {

            @Override
            public void run() {
                try {
                    super.run();
                    sleep(1000);  //Delay of 10 seconds
                } catch (Exception e) {

                } finally {

                    Intent i = new Intent(MainActivity.this,
                            cm.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        welcomeThread.start();
    }
}
