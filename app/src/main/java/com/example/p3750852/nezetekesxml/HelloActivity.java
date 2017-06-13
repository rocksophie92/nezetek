package com.example.p3750852.nezetekesxml;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by P3750852 on 2017.05.18..
 */

public class HelloActivity extends Activity {
    private static String TAG = "HelloActivity";
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }


    int countNumber = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        TextView tw = (TextView) findViewById(R.id.vissza);
        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

       final TextView countText = (TextView) findViewById(R.id.counterText);


        Button count = (Button) findViewById(R.id.counter);
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countNumber+=1;
                countText.setText(countNumber);
            }
        });
    }
}
