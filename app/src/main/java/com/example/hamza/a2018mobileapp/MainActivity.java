package com.example.hamza.a2018mobileapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private View orgButton;
    private View picButton;


    private android.widget.Button workButton;
    private android.widget.Button demoButton;

    public void onBack(View v) {
        android.widget.Toast.makeText(MainActivity.this, "Orange_Back!", android.widget.Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orgButton = findViewById(R.id.main_title_button_org);
        picButton = findViewById(R.id.main_title_pic);
        demoButton = findViewById(R.id.main_tool_demo);
        demoButton.setTextColor(android.graphics.Color.RED);
        workButton = findViewById(R.id.main_tool_work);


        orgButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                android.widget.Toast.makeText(MainActivity.this, "OrangeButton!", android.widget.Toast.LENGTH_SHORT).show();
            }

        });
        picButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                android.widget.Toast.makeText(MainActivity.this, "PictureButton!", android.widget.Toast.LENGTH_SHORT).show();
            }

        });

        demoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ;
                demoButton.setTextColor(android.graphics.Color.RED);
                workButton.setTextColor(android.graphics.Color.BLACK);
            }

        });
        workButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ;
                demoButton.setTextColor(android.graphics.Color.RED);
                workButton.setTextColor(android.graphics.Color.BLACK);
            }
        });

    }
}

