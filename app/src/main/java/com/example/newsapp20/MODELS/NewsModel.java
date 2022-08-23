package com.example.newsapp20.MODELS;

import java.util.ArrayList;

public class NewsModel {

    ArrayList<NewsData> articles;

    public NewsModel(ArrayList<NewsData> articles) {
        this.articles = articles;
    }

    public ArrayList<NewsData> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<NewsData> articles) {
        this.articles = articles;
    }
}
