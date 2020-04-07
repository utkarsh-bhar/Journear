package com.journear.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText email, password;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        email = findViewById(R.id.edit_email);
        password = findViewById(R.id.edit_password);
        login = findViewById(R.id.btn_login);




//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String usernameValue = email.getText().toString();
//                String passwordValue = password.getText().toString();
//
//
////                if (registerDatabaseHelper.isLoginValid(usernameValue, passwordValue)) {
////
////                    Intent intent = new Intent(LoginActivity.this, JourneyViewActivity.class);
////                    startActivity(intent);
////                    Toast.makeText(LoginActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
////
////
////                } else {
////                    Toast.makeText(LoginActivity.this, "Invalid Username or Password!", Toast.LENGTH_SHORT).show();
////                }
//
//
//            }
//        });


    }
}
