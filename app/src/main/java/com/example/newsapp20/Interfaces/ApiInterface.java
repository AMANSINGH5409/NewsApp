package com.example.newsapp20.Interfaces;

import com.example.newsapp20.MODELS.NewsModel;

import java.util.StringTokenizer;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ApiInterface {

    String BASE_URL = "https://newsapi.org/v2/";

    @GET("top-headlines")
    public abstract Call<NewsModel> getNews(
            @Query("country") String country,
            @Query("pageSize") int totalResults,
            @Query("apiKey") String apiKey
    );


    @GET("top-headlines")
    public abstract Call<NewsModel> getNews(
            @Query("country") String country,
            @Query("catogory") String catogory,
            @Query("pageSize") int totalResults,
            @Query("apiKey") String apiKey
    );

}
