package com.tata.retrofitdemo;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.Query;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * @Description:
 * @Author: Terry
 * @Date: 3/24/21 6:50 PM
 */
public interface NewsService {
    @GET("toutiao/index")
    Call<Result<NewsResult>> getNewsByGet(@Query("type") String type, @Query("page") int page,
                                          @Query("page_size") int page_size, @Query("key") String key);

    @POST("toutiao/index")
    Call<Result<NewsResult>> getNewsByPost(@QueryMap HashMap<String, Object> params);
}
