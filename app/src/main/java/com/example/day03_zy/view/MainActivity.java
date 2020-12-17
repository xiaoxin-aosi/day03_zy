package com.example.day03_zy.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.day03_zy.R;
import com.example.day03_zy.adapter.MyRcyAdapter;
import com.example.day03_zy.base.BaseActivity;
import com.example.day03_zy.bean.Bean;
import com.example.day03_zy.constart.MainConstart;
import com.example.day03_zy.presenter.MainPresenter;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<MainPresenter> implements MainConstart.IMainView {

    private RecyclerView rcy;
    private ArrayList<Bean.DataDTO.DatasDTO> list;
    private MyRcyAdapter myRcyAdapter;


    @Override
    protected int getViewId() {
        return 0;
    }

    @Override
    protected void initData() {
        presenter.news();
    }

    @Override
    protected void initView() {
        rcy = findViewById(R.id.rcy);
        rcy.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        myRcyAdapter = new MyRcyAdapter(this,list);
    }


    @Override
    protected MainPresenter getPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void getData(Bean bean) {

    }
}