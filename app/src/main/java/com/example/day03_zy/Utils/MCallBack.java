package com.example.day03_zy.Utils;

public interface MCallBack<T> {
    public void onSuccess(T t);
    public void onFail(String string);
}
