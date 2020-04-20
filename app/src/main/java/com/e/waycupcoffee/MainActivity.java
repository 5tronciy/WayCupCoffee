package com.e.waycupcoffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMenu;
    Button btnAbout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMenu = (Button) findViewById(R.id.btn_menu);
        btnMenu.setOnClickListener(this);
        btnAbout = (Button) findViewById(R.id.btn_about);
        btnAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_menu:
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_about:
                Intent intent2 = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent2);
                break;
                default:
                break;
        }
    }
}