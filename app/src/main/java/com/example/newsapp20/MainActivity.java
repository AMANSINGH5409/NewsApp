package com.example.newsapp20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.newsapp20.Adapter.NewsAdapter;
import com.example.newsapp20.Interfaces.ApiInterface;
import com.example.newsapp20.MODELS.ApiUtilies;
import com.example.newsapp20.MODELS.NewsData;
import com.example.newsapp20.MODELS.NewsModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    //968f52a549e64ba896cadf1fd25b8962
    ArrayList<NewsData> dataarraylist;
    RecyclerView recyclerView;
    String apikey = "968f52a549e64ba896cadf1fd25b8962";
    String country = "in";
    NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataarraylist = new ArrayList<>();
        recyclerView = findViewById(R.id.feedRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        newsAdapter = new NewsAdapter(dataarraylist,this);
        recyclerView.setAdapter(newsAdapter);

        fetchNewData();
    }

    private void fetchNewData() {

        ApiUtilies.getApiInterface().getNews(country,100,apikey).enqueue(new Callback<NewsModel>() {
            @Override
            public void onResponse(Call<NewsModel> call, Response<NewsModel> response) {
                if(response.isSuccessful()){
                    dataarraylist.addAll(response.body().getArticles());
                    newsAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<NewsModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong !", Toast.LENGTH_SHORT).show();
            }
        });


    }
}