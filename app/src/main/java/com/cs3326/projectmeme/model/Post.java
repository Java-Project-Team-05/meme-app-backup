package com.cs3326.projectmeme.model;

import java.util.ArrayList;
import java.util.List;

public class Post {

    public static final String FIELD_TITLE = "title";
    public static final String FIELD_IMAGE = "image";
    public static final String FIELD_TEXT = "text";

    private String title;
    private String image;
    private List<String> likedBy;
    private String text;
    private static String postedBy;

    public Post(){}

    public Post(String title, String image, List<String> likedBy, String text, String postedBy) {
        this.title = title;
        this.image = image;
        this.likedBy = likedBy;
        this.text = text;
        this.postedBy = postedBy;
    }

    //Getter's and Setter's
    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public List<String> getLikedBy() { return likedBy; }

    public void setLikedBy(List<String> likedBy) { this.likedBy = likedBy; }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public String getPostedBy() { return postedBy; }

    public void setPostedBy(String postedBy) { Post.postedBy = postedBy; }

}

