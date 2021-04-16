package com.example.playeasw.data.MainPages;


import android.content.Intent;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


import com.example.playeasw.R;
import com.example.playeasw.data.projectUtils.InfoAdapter;
import com.example.playeasw.data.projectUtils.InfoItems;
import com.example.playeasw.data.projectUtils.pictureItem;

import java.util.ArrayList;
import java.util.List;


public class ShopMallActivity extends AppCompatActivity {
    private TextView btn_chat;
    private TextView btn_shop;
    private TextView btn_core;
    private TextView btn_info;
    private TextView btn_account;
    private List<InfoItems> projectList= new ArrayList<>();
/*    Banner banner=findViewById(R.id.banner);*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_mall);
        initBtns();
        initProjects();

        InfoAdapter Myadapter=new InfoAdapter(ShopMallActivity.this,R.layout.info_item,projectList);
        ListView listView=(ListView) findViewById(R.id.list_Main);
        listView.setAdapter(Myadapter);

  /*      BannerImageAdapter adapter = new BannerImageAdapter(DataBean.getTestData2()) {
            @Override
            public void onBindView(Object holder, Object data, int position, int size) {

            }
        };


        banner.setAdapter(adapter)
                .addBannerLifecycleObserver(this)//添加生命周期观察者
                .setIndicator(new CircleIndicator(this))//设置指示器
                .setOnBannerListener((data, position) -> {
                    Snackbar.make(banner, ((DataBean) data).title, Snackbar.LENGTH_SHORT).show();
                    LogUtils.d("position：" + position);
                });*/



    }

   /* public class BannerActivity extends AppCompatActivity {
        public void useBanner() {
            //--------------------------简单使用-------------------------------
            banner.addBannerLifecycleObserver(this)//添加生命周期观察者
                    .setAdapter(new BannerImageAdapter(DataBean.getTestData()) {
                        @Override
                        public void onBindView(Object holder, Object data, int position, int size) {

                        }
                    })
                    .setIndicator(new CircleIndicator(this));

            //—————————————————————————如果你想偷懒，而又只是图片轮播————————————————————————
            banner.setAdapter(new BannerImageAdapter<DataBean>(DataBean.getTestData3()) {
                @Override
                public void onBindView(BannerImageHolder holder, DataBean data, int position, int size) {
                    //图片加载自己实现
                    Glide.with(holder.itemView)
                            .load(data.imageUrl)
                            .apply(RequestOptions.bitmapTransform(new RoundedCorners(30)))
                            .into(holder.imageView);
                }
            })
                    .addBannerLifecycleObserver(this)//添加生命周期观察者
                    .setIndicator(new CircleIndicator(this));
        }
    }*/
    private void initProjects() {

        projectList.add(new InfoItems(R.drawable.img,"这件商品的描述"));
        projectList.add(new InfoItems(R.drawable.img2,"这件商品的描述"));
        projectList.add(new InfoItems(R.drawable.img3,"这件商品的描述"));
        projectList.add(new InfoItems(R.drawable.img4,"这件商品的描述"));
        projectList.add(new InfoItems(R.drawable.img5,"这件商品的描述"));
        projectList.add(new InfoItems(R.drawable.img6,"这件商品的描述"));
        projectList.add(new InfoItems(R.drawable.img7,"这件商品的描述"));
        projectList.add(new InfoItems(R.drawable.img8,"这件商品的描述"));
        projectList.add(new InfoItems(R.drawable.img9,"这件商品的描述"));

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