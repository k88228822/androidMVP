package com.example.wang.test.net;

import com.example.wang.test.application.MyApplication;
import com.example.wang.test.entity.TblUser;
import com.example.wang.test.entity.TestResult;
import com.facebook.stetho.okhttp3.StethoInterceptor;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
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
    public static final String BASE_URL="http://192.168.0.10:8080/";

    public static final String TEST_URL="http://retrofit.devwiki.net/";

    private static OkHttpClient mOkHttpClient;

    static
    {
        initOkHttpClient();
    }

    /**
     * 初始化OKHttpClient
     */
    private static void initOkHttpClient()
    {
//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        if (mOkHttpClient == null)
        {
            synchronized (RetrofitHelper.class)
            {
                if (mOkHttpClient == null)
                {
                    //设置Http缓存
                    Cache cache = new Cache(new File(MyApplication.getContext().getCacheDir(), "HttpCache"), 1024 * 1024 * 100);

                    mOkHttpClient = new OkHttpClient.Builder()
                            .cache(cache)
                            .addInterceptor(new LoggingInterceptor())
                            .addNetworkInterceptor(new StethoInterceptor())
                            .retryOnConnectionFailure(true)
                            .connectTimeout(20, TimeUnit.SECONDS)
                            .build();
                }
            }
        }
    }

    public  static ApiService getApi (String baseuRL){

        Retrofit.Builder builder = new Retrofit.Builder();

        return  builder.client(mOkHttpClient)
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

    @Override
    public Observable<TestResult> getResult() {
        return getApi(TEST_URL).getResult();
    }

    @Override
    public Observable<TestResult> getParamTestResult(@Query("id") String id) {
        return getApi(TEST_URL).getParamTestResult(id);
    }


}
