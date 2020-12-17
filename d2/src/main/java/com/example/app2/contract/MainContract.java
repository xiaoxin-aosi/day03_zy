package com.example.app2.contract;

import com.example.app2.utils.MCallBack;

public class MainContract {
    public interface IModel<T>{
        void getData(String url, MCallBack callBack);
    }
}
