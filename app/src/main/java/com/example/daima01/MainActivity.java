package com.example.daima01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView mainTv;
    private Button mainBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mainTv = (TextView) findViewById(R.id.main_tv);
        mainBt = (Button) findViewById(R.id.main_bt);
        mainBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = mainTv.getText().toString();
                mainBt.setText(s);
            }
        });
    }
}