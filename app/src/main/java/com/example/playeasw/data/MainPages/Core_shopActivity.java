package com.example.playeasw.data.MainPages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.playeasw.R;

public class Core_shopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core_shop);

        Button button=findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Core_shopActivity.this,CoreActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "提交成功", Toast.LENGTH_LONG).show();
            }
        });
    }
}