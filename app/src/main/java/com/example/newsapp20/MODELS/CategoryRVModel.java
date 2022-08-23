package com.example.newsapp20.MODELS;

public class CategoryRVModel {

    String category;
    String categoryImageUrl;


    public CategoryRVModel(String category, String categoryImageUrl) {
        this.category = category;
        this.categoryImageUrl = categoryImageUrl;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryImageUrl() {
        return categoryImageUrl;
    }

    public void setCategoryImageUrl(String categoryImageUrl) {
        this.categoryImageUrl = categoryImageUrl;
    }
}
