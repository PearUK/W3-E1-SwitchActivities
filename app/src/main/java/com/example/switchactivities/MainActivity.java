package com.example.switchactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpen = findViewById(R.id.btn_next);
        btnOpen.setOnClickListener(view -> doOpenNewActivity());
    }

    public void doOpenNewActivity() {
        Intent myIntent = new Intent(this, NewActivity.class);
        startActivity(myIntent);
    }
}