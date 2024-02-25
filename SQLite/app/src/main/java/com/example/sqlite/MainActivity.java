package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText et1, et2, et3;
Button bt1, bt2, bt3;
String uid, uname, upass;
SQLiteDatabase db;
SQLiteOpenHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= findViewById(R.id.et1);
        et2= findViewById(R.id.et2);
        et3= findViewById(R.id.et3);
        bt1= findViewById(R.id.bt1);
        bt2= findViewById(R.id.bt2);
        bt3= findViewById(R.id.bt3);
        helper= new DbHelper(this);
    }


    public void InsertData(View view) {
        uid= et1.getText().toString();
        uname= et2.getText().toString();
        upass= et3.getText().toString();

        db= helper.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(DbHelper.COL_1, uid);
        values.put(DbHelper.COL_2, uname);
        values.put(DbHelper.COL_3, upass);

        double result= db.insert(DbHelper.TABLE_NAME, null, values);
        if(result==-1)
        {
            Toast.makeText(this, "Insertion failed", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Insertion successful", Toast.LENGTH_SHORT).show();
        }
    }

    public void DeleteData(View view) {
        uid= et1.getText().toString();
        uname= et2.getText().toString();
        upass= et3.getText().toString();

        db= helper.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(DbHelper.COL_1, uid);
        values.put(DbHelper.COL_2, uname);
        values.put(DbHelper.COL_3, upass);

        double result= db.delete(DbHelper.TABLE_NAME, DbHelper.COL_1+"=?",new String[]{uid});
        if(result==-1)
        {
            Toast.makeText(this, "Deletion failed", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Deletion successful", Toast.LENGTH_SHORT).show();
        }
    }

    public void UpdateData(View view) {
        uid= et1.getText().toString();
        uname= et2.getText().toString();
        upass= et3.getText().toString();

        db= helper.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(DbHelper.COL_1, uid);
        values.put(DbHelper.COL_2, uname);
        values.put(DbHelper.COL_3, upass);

        double result= db.update(DbHelper.TABLE_NAME, values, DbHelper.COL_1+"=?", new String[]{uid});
        if(result==-1)
        {
            Toast.makeText(this, "Updation failed", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Updation successful", Toast.LENGTH_SHORT).show();
        }
    }
}