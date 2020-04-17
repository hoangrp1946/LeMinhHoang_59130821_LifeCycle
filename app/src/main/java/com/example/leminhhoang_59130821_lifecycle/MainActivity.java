package com.example.leminhhoang_59130821_lifecycle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {
    String tag,mgs;
    TextView texTime;
    private static final String TIME_FORMAT_12 = "hh:mm:ss";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag="LifeCycle",mgs="onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag="LifeCycle",mgs="onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag="LifeCycle",mgs="onRestart");
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag = "LifeCycle", mgs = " onResume");
        texTime = (TextView) findViewById(R.id.time);
        DateFormat dateFormatter = new SimpleDateFormat("hh:mm:ss");
        Date today = new Date();
        String s = dateFormatter.format(today);
        texTime.setText(s);
        Toast.makeText(MainActivity.this, "LifeCycle_Le Minh Hoang_ 59130821", Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag="LifeCycle",mgs="onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag="LifeCycle",mgs="onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag="LifeCycle",mgs="onDestroy");
    }

}