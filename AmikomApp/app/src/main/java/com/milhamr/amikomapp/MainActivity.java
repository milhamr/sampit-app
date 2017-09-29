package com.milhamr.amikomapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    String msg = "Amikom App :";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(msg, "The OnCreate () event");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "the onStart () event");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "the onResume() event");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "the onPause () event");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "the onStop () event");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(msg, "the onRestart () event");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg, "the onDestroy() event");
    }
}
