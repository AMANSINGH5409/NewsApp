package com.example.newsapp20.MODELS;

import java.util.SplittableRandom;

public class NewsData {

    String title;
    String urlToImage;
    String description;
    String content;

    public NewsData(String title, String urlToImage, String description, String content) {
        this.title = title;
        this.urlToImage = urlToImage;
        this.description = description;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
