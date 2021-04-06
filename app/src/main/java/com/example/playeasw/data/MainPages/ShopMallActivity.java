package com.example.playeasw.data.MainPages;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

import com.example.playeasw.R;

public class ShopMallActivity extends AppCompatActivity {
    private TextView btn_chat;
    private TextView btn_shop;
    private TextView btn_core;
    private TextView btn_info;
    private TextView btn_account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_mall);
    }
    public void initBtns(){

        btn_account=findViewById(R.id.btn_account);
        btn_chat=findViewById(R.id.btn_chat);
        btn_core=findViewById(R.id.btn_core);
        btn_info=findViewById(R.id.btn_message);
        btn_shop=findViewById(R.id.btn_shop);

        btn_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ShopMallActivity.this, ShopMallActivity.class);
                startActivity(intent);
            }
        });

        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ShopMallActivity.this, ShopMallActivity.class);
                startActivity(intent);
            }
        });

        btn_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ShopMallActivity.this, ShopMallActivity.class);
                startActivity(intent);
            }
        });

        btn_core.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ShopMallActivity.this, ShopMallActivity.class);
                startActivity(intent);
            }
        });

        btn_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ShopMallActivity.this, ShopMallActivity.class);
                startActivity(intent);
            }
        });
    }
}