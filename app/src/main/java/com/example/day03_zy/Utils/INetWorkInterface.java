package com.example.day03_zy.Utils;

public interface INetWorkInterface {
    public <T> void get(String url,MCallBack<T> callBack);
}
