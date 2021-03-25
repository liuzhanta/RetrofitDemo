package com.tata.retrofitdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    TextView contentView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        contentView = findViewById(R.id.content);
        setSupportActionBar(toolbar);
        findViewById(R.id.btn_post).setOnClickListener(this);
        findViewById(R.id.btn_get).setOnClickListener(this);




    }

    private void testRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://v.juhe.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        NewsService service = retrofit.create(NewsService.class);
//        Call<Result<NewsResult>> call = servce.getNewsByGet("top", 10,30,"5b79baa8f9bc0169acf25329cdcf5001");
//        call.enqueue(new Callback<Result<NewsResult>>() {
//            @Override
//            public void onResponse(Call<Result<NewsResult>> call, Response<Result<NewsResult>> response) {
//                Log.d(TAG, "onResponse: "+response.toString());
//            }
//
//            @Override
//            public void onFailure(Call<Result<NewsResult>> call, Throwable t) {
//                Log.d(TAG, "onFailure: "+t.getMessage());
//
//            }
//        });



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_get:
                testGet();
                break;
            case R.id.btn_post:
                testPost();
                break;
        }
    }

    private void testPost() {
        // create params
        HashMap<String, Object> map = new HashMap<>();
        map.put("type", "top");
        map.put("page", 1);
        map.put("page_size", 10);
        map.put("key", "5b79baa8f9bc0169acf25329cdcf5001");

        NewsService service = RetrofitUtils.create(NewsService.class);

        Call<Result<NewsResult>> call = service.getNewsByPost(map);
        call.enqueue(new Callback<Result<NewsResult>>() {
            @Override
            public void onResponse(Call<Result<NewsResult>> call, Response<Result<NewsResult>> response) {
                updateResult(response);
            }

            @Override
            public void onFailure(Call<Result<NewsResult>> call, Throwable t) {

            }
        });
    }

    private void updateResult(Response<Result<NewsResult>> response) {
        if (response.isSuccessful()) {

            NewsResult result = response.body().getResult();
            List<NewsResult.DataBean> data = result.getData();
            StringBuilder sb = new StringBuilder();
            for (NewsResult.DataBean datum : data) {
                sb.append(datum);
            }
            contentView.setText(sb.toString());
        }
    }

    private void testGet() {

        NewsService service = RetrofitUtils.create(NewsService.class);
        Call<Result<NewsResult>> call =service.getNewsByGet("top", 10,30,"5b79baa8f9bc0169acf25329cdcf5001");
        call.enqueue(new Callback<Result<NewsResult>>() {
            @Override
            public void onResponse(Call<Result<NewsResult>> call, Response<Result<NewsResult>> response) {
                Log.d(TAG, "onResponse: "+response.toString());
                updateResult(response);
            }

            @Override
            public void onFailure(Call<Result<NewsResult>> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t.getMessage());

            }
        });
    }

}