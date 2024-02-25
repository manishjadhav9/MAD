package com.example.samp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("message","onCreate() is called");
    }
    protected void onStart(){
        super.onStart();
        Log.d("message","onStart() is called");
    }
    protected void onResume(){
        super.onResume();
        Log.d("message","onResume() is called");
    }
    protected void onPause(){
        super.onPause();
        Log.d("message","onPause() is called");
    }
    protected void onStop(){
        super.onStop();
        Log.d("message","onStop() is called");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("message","onRestart() is called");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("message","onDestroy() is called");
    }
}
