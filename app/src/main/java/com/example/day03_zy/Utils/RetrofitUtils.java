package com.example.day03_zy.Utils;

import com.example.day03_zy.bean.Bean;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class RetrofitUtils implements INetWorkInterface {

    private static RetrofitUtils retrofitUtils;
    private final ApiService apiService;

    private RetrofitUtils() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        Retrofit build = new Retrofit.Builder()
                .baseUrl(URLConstart.BASEURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        apiService = build.create(ApiService.class);
    }

    public static RetrofitUtils getInstance() {
        if (retrofitUtils == null) {
            synchronized (RetrofitUtils.class) {
                retrofitUtils = new RetrofitUtils();
            }
        }
        return retrofitUtils;
    }

    @Override
    public <T> void get(String url, MCallBack<T> callBack) {
        apiService.getData(url)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new Observer<Bean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        new Observer<Bean>() {
                            @Override
                            public void onSubscribe(@NonNull Disposable d) {

                            }

                            @Override
                            public void onNext(@NonNull Bean bean) {
                                List<Bean.DataDTO.DatasDTO> datas = bean.getData().getDatas();
                                String s = datas.toString();
                            }

                            @Override
                            public void onError(@NonNull Throwable e) {

                            }

                            @Override
                            public void onComplete() {

                            }
                        };
                    }

                    @Override
                    public void onNext(@NonNull Bean bean) {

                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
