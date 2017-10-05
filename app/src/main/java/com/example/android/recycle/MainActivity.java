package com.example.android.recycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RecyclerView re1;
    String se1[], se2[];
    Adapter adapt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        re1 = (RecyclerView) findViewById(R.id.List);
        se1 = getResources().getStringArray(R.array.nama);
        se2 = getResources().getStringArray(R.array.deskripsi);
        adapt = new Adapter(this, se1, se2);
        re1.setAdapter(adapt);
        re1.setLayoutManager(new LinearLayoutManager(this));
    }
}
