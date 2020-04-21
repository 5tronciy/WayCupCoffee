package com.e.waycupcoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton btnAbout;
    ImageView ivHome;
    TextView tvHome;
    ImageView ivCard;
    TextView tvCard;
    ImageView ivOrders;
    TextView tvOrders;
    ImageView ivContacts;
    TextView tvContacts;
    ImageView ivCoupons;
    TextView tvCoupons;
    ImageView ivNews;
    TextView tvNews;
    ImageView ivFeedback;
    TextView tvFeedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnAbout = (ImageButton) findViewById(R.id.ibtn_waycup_menu);
        btnAbout.setOnClickListener(this);
        ivHome = (ImageView) findViewById(R.id.iv_home);
        ivHome.setOnClickListener(this);
        tvHome = (TextView) findViewById(R.id.tv_home);
        tvHome.setOnClickListener(this);
        ivCard = (ImageView) findViewById(R.id.iv_card);
        ivCard.setOnClickListener(this);
        tvCard = (TextView) findViewById(R.id.tv_card);
        tvCard.setOnClickListener(this);
        ivOrders = (ImageView) findViewById(R.id.iv_orders);
        ivOrders.setOnClickListener(this);
        tvOrders = (TextView) findViewById(R.id.tv_orders);
        tvOrders.setOnClickListener(this);
        ivContacts = (ImageView) findViewById(R.id.iv_contact);
        ivContacts.setOnClickListener(this);
        tvContacts = (TextView) findViewById(R.id.tv_contact);
        tvContacts.setOnClickListener(this);
        ivCoupons = (ImageView) findViewById(R.id.iv_coupons);
        ivCoupons.setOnClickListener(this);
        tvCoupons = (TextView) findViewById(R.id.tv_coupons);
        tvCoupons.setOnClickListener(this);
        ivNews = (ImageView) findViewById(R.id.iv_news);
        ivNews.setOnClickListener(this);
        tvNews = (TextView) findViewById(R.id.tv_news);
        tvNews.setOnClickListener(this);
        ivFeedback = (ImageView) findViewById(R.id.iv_feedback);
        ivFeedback.setOnClickListener(this);
        tvFeedback = (TextView) findViewById(R.id.tv_feedback);
        tvFeedback.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
//            case R.id.btn_menu:
//                Intent intent = new Intent(MenuActivity.this, MenuActivity.class);
//                startActivity(intent);
//                break;
            case R.id.ibtn_waycup_menu:
                Intent intent2 = new Intent(MenuActivity.this, AboutActivity.class);
                startActivity(intent2);
                this.overridePendingTransition(0, 0);
                break;
            case R.id.iv_home:
                Intent intent3 = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent3);
                this.overridePendingTransition(0, 0);
                break;
            case R.id.tv_home:
                Intent intent4 = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent4);
                this.overridePendingTransition(0, 0);
                break;
            case R.id.iv_card:
                Intent intent5 = new Intent(MenuActivity.this, UserCard.class);
                startActivity(intent5);
                this.overridePendingTransition(0, 0);
                break;
            case R.id.tv_card:
                Intent intent6 = new Intent(MenuActivity.this, UserCard.class);
                startActivity(intent6);
                this.overridePendingTransition(0, 0);
                break;
            case R.id.iv_orders:
                Intent intent7 = new Intent(MenuActivity.this, Orders.class);
                startActivity(intent7);
                this.overridePendingTransition(0, 0);
                break;
            case R.id.tv_orders:
                Intent intent8 = new Intent(MenuActivity.this, Orders.class);
                startActivity(intent8);
                this.overridePendingTransition(0, 0);
                break;
            case R.id.iv_contact:
                Intent intent9 = new Intent(MenuActivity.this, Contacts.class);
                startActivity(intent9);
                this.overridePendingTransition(0, 0);
                break;
            case R.id.tv_contact:
                Intent intent10 = new Intent(MenuActivity.this, Contacts.class);
                startActivity(intent10);
                this.overridePendingTransition(0, 0);
                break;
            case R.id.iv_coupons:
                Intent intent11 = new Intent(MenuActivity.this, Coupons.class);
                startActivity(intent11);
                this.overridePendingTransition(0, 0);
                break;
            case R.id.tv_coupons:
                Intent intent12 = new Intent(MenuActivity.this, Coupons.class);
                startActivity(intent12);
                this.overridePendingTransition(0, 0);
                break;
            case R.id.iv_news:
                Intent intent13 = new Intent(MenuActivity.this, News.class);
                startActivity(intent13);
                this.overridePendingTransition(0, 0);
                break;
            case R.id.tv_news:
                Intent intent14 = new Intent(MenuActivity.this, News.class);
                startActivity(intent14);
                this.overridePendingTransition(0, 0);
                break;
            case R.id.iv_feedback:
                Intent intent15 = new Intent(MenuActivity.this, Feedback.class);
                startActivity(intent15);
                this.overridePendingTransition(0, 0);
                break;
            case R.id.tv_feedback:
                Intent intent16 = new Intent(MenuActivity.this, Feedback.class);
                startActivity(intent16);
                this.overridePendingTransition(0, 0);
                break;
            default:
                break;
        }
    }
    @Override protected void onPause() { super.onPause(); overridePendingTransition(0, 0); }
}
