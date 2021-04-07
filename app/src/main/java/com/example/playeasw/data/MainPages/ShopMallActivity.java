package com.example.playeasw.data.MainPages;


import android.content.Intent;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


import com.example.playeasw.R;
import com.example.playeasw.data.projectUtils.InfoAdapter;
import com.example.playeasw.data.projectUtils.InfoItems;
import com.example.playeasw.data.projectUtils.pictureAdapter;
import com.example.playeasw.data.projectUtils.pictureItem;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;


public class ShopMallActivity extends AppCompatActivity {
    private TextView btn_chat;
    private TextView btn_shop;
    private TextView btn_core;
    private TextView btn_info;
    private TextView btn_account;
    private List<pictureItem> projectList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_mall);
        initBtns();
        initProjects();

        pictureAdapter Myadapter=new pictureAdapter(ShopMallActivity.this,R.layout.picture_item,projectList);

        ListView listView=(ListView) findViewById(R.id.list_Main);


        listView.setAdapter(Myadapter);

    }
    private void initProjects() {
    for (int i=0;i<20;i++){

        projectList.add(new pictureItem(R.drawable.baibai));

        }
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
                Intent intent =new Intent(ShopMallActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });

        btn_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ShopMallActivity.this, ChattingActivity.class);
                startActivity(intent);
            }
        });

        btn_core.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ShopMallActivity.this, CoreActivity.class);
                startActivity(intent);
            }
        });

        btn_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ShopMallActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });
    }
}