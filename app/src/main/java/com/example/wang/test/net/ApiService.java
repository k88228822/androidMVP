package com.example.wang.test.net;

import com.example.wang.test.entity.TblUser;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by wangzhen on 2016/12/19.
 */

public interface ApiService {

    @GET("/user/UserServlet/")
    Observable<TblUser> getUserInfo(@Query("method") String method,@Query("userId") String userId);

}
