package com.example.day03_zy.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<T> extends AppCompatActivity {
    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getViewId());
        presenter=getPresenter();
        initView();
        initData();
    }

    protected abstract int getViewId();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract T getPresenter();
}
