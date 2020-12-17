package com.example.day03_zy.Utils;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class RetrofitUtils implements INetWorkInterface{

    private static RetrofitUtils retrofitUtils;

    private RetrofitUtils(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        Retrofit build = new Retrofit.Builder()
                .baseUrl(URLConstart.BASEURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
    public static RetrofitUtils getInstance(){
        if (retrofitUtils==null){
            synchronized (RetrofitUtils.class) {
                retrofitUtils = new RetrofitUtils();
            }
        }
        return retrofitUtils;
    }
    @Override
    public <T> void get(String url, MCallBack<T> callBack) {

    }
}
