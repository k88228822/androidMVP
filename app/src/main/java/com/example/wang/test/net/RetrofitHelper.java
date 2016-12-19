package com.example.wang.test.net;

import com.example.wang.test.entity.TblUser;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by wangzhen on 2016/12/19.
 */

public class RetrofitHelper implements ApiService{
    public static final String BASE_URL="http://192.168.0.10:8080/JavaWebEE_20161209/";


    public  static ApiService getApi (String baseuRL){
        OkHttpClient okHttpClient =new OkHttpClient.Builder().connectTimeout(5, TimeUnit.SECONDS).build();
        Retrofit.Builder builder = new Retrofit.Builder();

        return  builder.client(okHttpClient)
                .baseUrl(baseuRL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
                .create(ApiService.class);
    }


    @Override
    public Observable<TblUser> getUserInfo(@Query("method") String method, @Query("userId") String userId) {
        return getApi(BASE_URL).getUserInfo(method,userId);
    }



}
