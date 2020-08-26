package com.example.myapplication;

public class ModelClass {
    private String title;
    private String description;
    private int id;
    private String url;
    private String author;

    public ModelClass(String title, String text, int id, String url, String author) {
        this.title = title;
        this.description = text;
        this.id = id;
        this.url = url;
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return description;
    }

    public void setText(String text) {
        this.description = text;
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
                ", description='" + description + '\'' +
                ", id=" + id +
                ", url='" + url + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
