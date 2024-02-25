package com.example.login;

import static com.example.login.R.id.log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.et1);
        password = findViewById(R.id.et2);
        Login = findViewById(R.id.log);

        username.addTextChangedListener(LoginText);
        password.addTextChangedListener(LoginText);

    }

    private TextWatcher LoginText = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            if (!username.equals("") && !password.equals("")) {
                Login.setEnabled(true);
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {
//            if(username.getText().toString().equals("manishsj289@gmail.com")&& password.getText().toString().equals("2809")){
//                Login.setEnabled(true);
//            }
        }
    };


    public void Login(View view) {
        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
    }
}