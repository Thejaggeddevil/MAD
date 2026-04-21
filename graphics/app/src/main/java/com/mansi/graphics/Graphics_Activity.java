package com.mansi.login;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class GraphicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.mansi.login.MyView view = new com.mansi.login.MyView(this);
        setContentView(view);
    }
}