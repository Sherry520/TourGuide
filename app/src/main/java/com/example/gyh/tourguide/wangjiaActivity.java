package com.example.gyh.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class wangjiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ArrayList<Information> informations = new ArrayList<Information>();
        informations.add(new Information(R.drawable.wangjiadayuan,getString(R.string.wangjiaJianJie)
                ,getString(R.string.wangjiaWorkTime),getString(R.string.qiaojiaRestaurant)));

        InformationAdapter informationAdapter = new InformationAdapter(this,informations);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(informationAdapter);
    }
}
