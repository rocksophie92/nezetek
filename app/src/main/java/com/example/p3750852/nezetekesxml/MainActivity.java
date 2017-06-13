package com.example.p3750852.nezetekesxml;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    LinearLayout layout;
    Random r = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gomb = (Button) findViewById(R.id.kilepes);
        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Gomb megnyomva");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finish();
            }
        });

        Button szinez = (Button) findViewById(R.id.szinez);
        szinez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "Szinezes");
                int veletlenSzin = Color.rgb(r.nextInt(255), r.nextInt(255), r.nextInt(255) );
                layout = (LinearLayout) findViewById(R.id.activity_main);
                layout.setBackgroundColor(veletlenSzin);
                startActivity(new Intent(getApplicationContext(), HelloActivity.class));
            }
        });
    }
}
