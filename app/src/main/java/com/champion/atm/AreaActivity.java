package com.champion.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.R.attr.data;
public class AreaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
                private String[] area1;
                private String[] area2;
                private String[] area3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        ListView area = (ListView) findViewById(R.id.area);
        Intent i = getIntent();
        String areas = i.getStringExtra("Area");
        if (areas.equals("新北市")) {
            area1 = new String[]{"永和區", "板橋區", "新莊區"};
            ArrayAdapter adapter = new ArrayAdapter(this,
                    android.R.layout.simple_list_item_1, area1);
            area.setAdapter(adapter);
        }
        if (areas.equals("基隆市")) {
            area2 = new String[]{"中正區", "暖暖區", "八堵區"};
            ArrayAdapter adapter = new ArrayAdapter(this,
                    android.R.layout.simple_list_item_1, area2);
            area.setAdapter(adapter);
        }
        if (areas.equals("台北市")) {
            area3 = new String[]{"信義區", "大安區", "士林區"};
            ArrayAdapter adapter = new ArrayAdapter(this,
                    android.R.layout.simple_list_item_1, area3);
            area.setAdapter(adapter);
        }
        area.setOnItemClickListener(this);

//        ArrayAdapter adapter1 = new ArrayAdapter(AreaActivity.this,
//                android.R.layout.simple_list_item_1, data);
//        area.setAdapter(adapter1);
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
    }

