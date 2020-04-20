package com.e.waycupcoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class UserCard extends AppCompatActivity  implements View.OnClickListener{
    Button btnMenu;
    ImageButton btnAbout;
    ImageButton btnCard;
    ImageButton btnHome;
    ImageButton btnCoupons;
    ImageButton btnContacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_card);
        //кнопки хедера
        btnMenu = (Button) findViewById(R.id.btn_menu);
        btnMenu.setOnClickListener(this);
        btnAbout = (ImageButton) findViewById(R.id.ibtn_waycup_header);
        btnAbout.setOnClickListener(this);

        //кнопки футера
        btnHome = (ImageButton) findViewById(R.id.ibtn_home_footer);
        btnHome.setOnClickListener(this);
        btnCard = (ImageButton) findViewById(R.id.ibtn_card_footer);
        btnCard.setOnClickListener(this);
        btnCoupons = (ImageButton) findViewById(R.id.ibtn_coupons_footer);
        btnCoupons.setOnClickListener(this);
        btnContacts = (ImageButton) findViewById(R.id.ibtn_contact_footer);
        btnContacts.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_menu:
                Intent intent = new Intent(UserCard.this, MenuActivity.class);
                startActivity(intent);
                break;
            case R.id.ibtn_waycup_header:
                Intent intent2 = new Intent(UserCard.this, AboutActivity.class);
                startActivity(intent2);
                break;
            case R.id.ibtn_card_footer:
                Intent intent3 = new Intent(UserCard.this, UserCard.class);
                startActivity(intent3);
                break;
            case R.id.ibtn_home_footer:
                Intent intent4 = new Intent(UserCard.this, MainActivity.class);
                startActivity(intent4);
                break;
            case R.id.ibtn_coupons_footer:
                Intent intent5 = new Intent(UserCard.this, Coupons.class);
                startActivity(intent5);
                break;
            case R.id.ibtn_contact_footer:
                Intent intent6 = new Intent(UserCard.this, Contacts.class);
                startActivity(intent6);
                break;
            default:
                break;
        }
    }
}
