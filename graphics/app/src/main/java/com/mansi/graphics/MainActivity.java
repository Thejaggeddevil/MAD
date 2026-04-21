package com.mansi.graphics;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnGraphics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnGraphics = findViewById(R.id.btnGraphics);

        btnGraphics.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GraphicsActivity.class);
            startActivity(intent);
        });
    }
}