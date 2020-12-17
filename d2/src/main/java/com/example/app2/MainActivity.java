package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.app2.adapter.MyAdapter;
import com.example.app2.bean.Bean;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcy;
    private ArrayList<Bean.DataDTO.DatasDTO> list;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        rcy = findViewById(R.id.rcy);
        rcy.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        myAdapter = new MyAdapter(list, this);
        rcy.setAdapter(myAdapter);
    }
}