package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class ModelClass {
    @SerializedName("name")
    private String title;
    @SerializedName("id")
    private int id;


    public ModelClass(String title, int id, String url) {
        this.title = title;
        this.id = id;

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ModelClass{" +
                "title='" + title + '\'' +
                ", id=" + id +
                '}';
    }
}
