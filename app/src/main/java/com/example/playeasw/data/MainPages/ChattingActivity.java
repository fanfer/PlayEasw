package com.example.playeasw.data.MainPages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.playeasw.R;

public class ChattingActivity extends AppCompatActivity {
    private TextView btn_chat;
    private TextView btn_shop;
    private TextView btn_core;
    private TextView btn_info;
    private TextView btn_account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting);
        initBtns();
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
                Intent intent =new Intent(ChattingActivity.this, ShopMallActivity.class);
                startActivity(intent);
            }
        });

        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ChattingActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });

        btn_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ChattingActivity.this, ChattingActivity.class);
                startActivity(intent);
            }
        });

        btn_core.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ChattingActivity.this, CoreActivity.class);
                startActivity(intent);
            }
        });

        btn_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ChattingActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });
    }
}