package com.example.day03_zy.presenter;

import com.example.day03_zy.Utils.MCallBack;
import com.example.day03_zy.base.BasePresenter;
import com.example.day03_zy.bean.Bean;
import com.example.day03_zy.constart.MainConstart;
import com.example.day03_zy.model.MainModel;
import com.example.day03_zy.view.MainActivity;

public class MainPresenter implements MainConstart.IMainPresenter{
    private final MainModel mainModel;
    private MainConstart.IMainView mainView;

    public MainPresenter(MainConstart.IMainView mainView) {

        this.mainView = mainView;
        mainModel = new MainModel();
    }


    public void news() {

    }

    @Override
    public void getData() {
        mainModel.getData(new MCallBack<Bean>() {
            @Override
            public void onSuccess(Bean bean) {
                mainView.getData(bean);
            }

            @Override
            public void onFail(String string) {

            }
        });
    }
}
