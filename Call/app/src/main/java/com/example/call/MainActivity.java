package com.example.call;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    Button bt;
    String num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        bt=findViewById(R.id.bt);
    }

    public void call(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        num = et1.getText().toString();
        if(num.trim().isEmpty()){
            intent.setData(Uri.parse("8530037679"));
        }
        else{
            intent.setData(Uri.parse("tel: "+num));
        }
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this, "Please grant permission to call", Toast.LENGTH_SHORT).show();
            requestPermission();
        }
        else {
            startActivity(intent);
        }
    }

    private void requestPermission() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},1);
    }

}