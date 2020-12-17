package com.example.app2.utils;

public interface MCallBack<T> {
    void onSucess(T t);
    void onFail(String string);
}
