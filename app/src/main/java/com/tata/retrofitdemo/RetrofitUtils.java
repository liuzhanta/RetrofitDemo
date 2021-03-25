package com.tata.retrofitdemo;

import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @Description:
 * @Author: Terry
 * @Date: 3/24/21 7:07 PM
 */
public class RetrofitUtils {

    public static final String BASE_URL = "http://v.juhe.cn/";

    private RetrofitUtils() {
        //no instance
    }

    public static <T> T create(Class<T> service){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(service);
    }

}
