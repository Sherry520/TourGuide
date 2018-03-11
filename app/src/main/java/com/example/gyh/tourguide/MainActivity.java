package com.example.gyh.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView pingyao = (TextView) findViewById(R.id.pingyaoText);
        pingyao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openPingyao = new Intent(MainActivity.this, pingyaoActivity.class);
                startActivity(openPingyao);
            }
        });

        TextView mianshan = (TextView) findViewById(R.id.mianshanText);
        mianshan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openMianshan = new Intent(MainActivity.this, mianshanActivity.class);
                startActivity(openMianshan);
            }
        });

        TextView qiaojia = (TextView) findViewById(R.id.qiaojiaText);
        qiaojia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openQiaojia = new Intent(MainActivity.this, qiaojiaActivity.class);
                startActivity(openQiaojia);
            }
        });

        TextView wangjia = (TextView) findViewById(R.id.wangjiaText);
        wangjia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openWangjia = new Intent(MainActivity.this, wangjiaActivity.class);
                startActivity(openWangjia);
            }
        });

    }
}

