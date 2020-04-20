package com.e.waycupcoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Feedback extends AppCompatActivity implements View.OnClickListener{
    Button btnMenu;
    ImageButton btnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        //кнопки хедера
        btnMenu = (Button) findViewById(R.id.btn_menu);
        btnMenu.setOnClickListener(this);
        btnAbout = (ImageButton) findViewById(R.id.ibtn_waycup_header);
        btnAbout.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_menu:
                Intent intent = new Intent(Feedback.this, MenuActivity.class);
                startActivity(intent);
                break;
            case R.id.ibtn_waycup_header:
                Intent intent2 = new Intent(Feedback.this, AboutActivity.class);
                startActivity(intent2);
                break;
                default:
                break;
        }
    }
}
