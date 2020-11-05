package com.youtube.service;

import com.youtube.controller.VideoActions;

public class Video implements VideoActions {
    private String title;
    private float evaluation;
    private int views;
    private int likes;
    private boolean reproducing;


    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }

    @Override
    public void dislike() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(float evaluation) {
        this.evaluation = evaluation;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isReproducing() {
        return reproducing;
    }

    public void setReproducing(boolean reproducing) {
        this.reproducing = reproducing;
    }
}
