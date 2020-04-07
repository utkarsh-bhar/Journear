package com.journear.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.journear.app.core.PersistentStore;
import com.journear.app.core.entities.User;

public class UserRegisterActivity extends AppCompatActivity {
    EditText username, password, email, phone, dob;
    RadioGroup gender;
    Button register, cancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_register);
        username = findViewById(R.id.editName);
        password = findViewById(R.id.editPassword);
        email = findViewById(R.id.editEmail);

        gender = findViewById(R.id.editGender);
        phone = findViewById(R.id.editPhone);
        dob = findViewById(R.id.editDob);
        register = findViewById(R.id.btn_Register);





        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final User registeringUser = new User();

                registeringUser.setUserName( username.getText().toString());
                registeringUser.setPassword( password.getText().toString());
                registeringUser.setEmail(email.getText().toString());
                registeringUser.setPhoneValue(phone.getText().toString());
                registeringUser.setDobValue(dob.getText().toString());

                RadioButton checkedBtn = findViewById(gender.getCheckedRadioButtonId());
                registeringUser.setGender(checkedBtn.getText().toString());


                if (registeringUser.getUserName().length() > 1) {

                    PersistentStore.getInstance(UserRegisterActivity.this).setItem("registeredUser", registeringUser, true);
                    Toast.makeText(UserRegisterActivity.this, "User registered!", Toast.LENGTH_SHORT).show();


                }
                else {
                    Toast.makeText(UserRegisterActivity.this, "Enter the values!", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}
