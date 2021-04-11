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

            projectList.add(new InfoItems(R.drawable.pic1,"日媒：日本拟最早4月13日开会探讨处置福岛核处理水"));
            projectList.add(new InfoItems(R.drawable.pic2,"净零峰会呼吁加强国际合作以减少温室气体排放"));
            projectList.add(new InfoItems(R.drawable.pic3,"蒙古国中戈壁省近期强沙尘暴天气致16万头牲畜死亡"));
            projectList.add(new InfoItems(R.drawable.pic4,"接力“地球一小时” 全球多个地标建筑熄灯响应活动"));
            projectList.add(new InfoItems(R.drawable.pic5,"科研人员破解豆科植物在“恐龙大灭绝”时期幸存“密码”"));
            projectList.add(new InfoItems(R.drawable.pic66,"研究表明：氮沉降极显著增加全球草地生态系统氧化亚氮排放速率"));
            projectList.add(new InfoItems(R.drawable.pic7,"新加坡南洋理工大学研发植物“通信”设备 未来可成为环境探测器"));
            projectList.add(new InfoItems(R.drawable.pic8,"海洋面临威胁前所未有 危害将持续数百年"));



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