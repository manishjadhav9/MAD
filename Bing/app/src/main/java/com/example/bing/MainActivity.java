package com.example.bing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    Button log;
    String username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        log=findViewById(R.id.log);
    }

    public void click(View view) {
        username= et1.getText().toString();
        password= et2.getText().toString();
        if(username.equals("Manish Jadhav") && password.equals("2809")){
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.bing.com/"));
            startActivity(i);
        }
    }
}