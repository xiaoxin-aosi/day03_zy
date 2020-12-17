package com.example.day03_zy.constart;

import com.example.day03_zy.Utils.MCallBack;
import com.example.day03_zy.bean.Bean;

import javax.security.auth.callback.Callback;

public class MainConstart {
    public interface IModel{
        <T> void getShow(String url, MCallBack<T> callback);
        void getData();
    }
    public interface IMainPresenter{

    }
    public interface IMainView{
        void getData(Bean string);

    }
}
