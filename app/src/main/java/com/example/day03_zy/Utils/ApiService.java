package com.example.day03_zy.Utils;

import com.example.day03_zy.bean.Bean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiService {
    @GET
    Observable<Bean> getData(@Url String url);
}
