package com.example.playeasw.data.MainPages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.playeasw.R;

public class Core_doorActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core_door);

        button=findViewById(R.id.button_admit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Core_doorActivity.this,CoreActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "ζδΊ€ζε", Toast.LENGTH_LONG).show();
            }
        });
    }
}