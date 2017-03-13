package com.example.wang.test.net;

import com.example.wang.test.entity.TblUser;
import com.example.wang.test.entity.TestResult;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by wangzhen on 2016/12/19.
 */

public interface ApiService {

    @GET("/mywebproject/user/UserServlet")
    Observable<TblUser> getUserInfo(@Query("method") String method,@Query("userId") String userId);

    @GET("/ip")
    Observable<TestResult> getResult();

    @GET("param")
    Observable<TestResult> getParamTestResult(@Query("id")String id);

}
