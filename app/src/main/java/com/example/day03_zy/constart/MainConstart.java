package com.example.day03_zy.constart;

import com.example.day03_zy.Utils.MCallBack;
import com.example.day03_zy.bean.Bean;


public class MainConstart {
    public interface IModel<T>{
        void getdata(String url,MCallBack<T> callBack);
    }
    public interface IMainPresenter{
        void getData();
    }
    public interface IMainView{
        void getData(Bean bean);
    }
}
