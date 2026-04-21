package com.mansi.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString().trim();
                String pass = password.getText().toString().trim();

                if (user.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Please enter username and password",
                            Toast.LENGTH_SHORT).show();
                }


                else if (user.equals("mansi") && pass.equals("1234")) {
                    Toast.makeText(MainActivity.this,
                            "Login Successful",
                            Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, Welcome.class);
                    startActivity(intent);
                }


                else {
                    Toast.makeText(MainActivity.this,
                            "Login Failed! Wrong username or password",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}