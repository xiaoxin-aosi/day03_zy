package com.example.day03_zy.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.day03_zy.R;
import com.example.day03_zy.adapter.MyRcyAdapter;
import com.example.day03_zy.bean.Bean;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcy;
    private ArrayList<Bean.DataDTO.DatasDTO> list;
    private MyRcyAdapter myRcyAdapter;

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
        myRcyAdapter = new MyRcyAdapter(this,list);
    }
}