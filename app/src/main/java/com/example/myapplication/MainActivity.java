package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate mssgg");
    }

    public void calcpg(View v){
        Intent i = new Intent(this, Calculator.class);
        startActivity(i);
    }

    public void convpg(View v){
        Intent i = new Intent(this, Convertor.class);
        startActivity(i);
    }


    public void onStart(){
        super.onStart();
        Log.d(TAG,"onstart mssgg");
    }

    public void onRestart(){
        super.onRestart();
        Log.d(TAG,"onrestart mssgg");
    }

    public void onResume(){
        super.onResume();
        Log.d(TAG,"onresume mssgg");
    }

    public void onPause(){
        super.onPause();
        Log.d(TAG,"onpause mssgg");
    }

    public void onStop(){
        super.onStop();
        Log.d(TAG,"onstop mssgg");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"ondestroy sgg");
    }
}