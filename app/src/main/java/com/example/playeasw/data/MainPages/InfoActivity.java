package com.example.playeasw.data.MainPages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.playeasw.R;
import com.example.playeasw.data.projectUtils.InfoAdapter;
import com.example.playeasw.data.projectUtils.InfoItems;

import java.util.ArrayList;
import java.util.List;

public class InfoActivity extends AppCompatActivity {
    private TextView btn_chat;
    private TextView btn_shop;
    private TextView btn_core;
    private TextView btn_info;
    private TextView btn_account;

    private List<InfoItems> projectList= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initBtns();

        initProjects();

        InfoAdapter Myadapter=new InfoAdapter(InfoActivity.this,R.layout.info_item,projectList);

        ListView listView=(ListView) findViewById(R.id.list_Main);

        listView.setAdapter(Myadapter);

    }

    //TODO:在内存中读取数据并导入
    private void initProjects(){
        for (int i=0;i<2;i++){
            projectList.add(new InfoItems(R.drawable.mmexport1607529318338,"这是一条咨询"));
            projectList.add(new InfoItems(R.drawable.mmexport1607874227525,"这是一条咨询"));
            projectList.add(new InfoItems(R.drawable.mmexport1607874227525,"这是一条咨询"));
            projectList.add(new InfoItems(R.drawable.mmexport1607874229573,"这是一条咨询"));
            projectList.add(new InfoItems(R.drawable.mmexport1607529331593,"这是一条咨询"));


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
                Intent intent =new Intent(InfoActivity.this, ShopMallActivity.class);
                startActivity(intent);
            }
        });

        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(InfoActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });

        btn_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(InfoActivity.this, ChattingActivity.class);
                startActivity(intent);
            }
        });

        btn_core.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(InfoActivity.this, CoreActivity.class);
                startActivity(intent);
            }
        });

        btn_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(InfoActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });
    }
}