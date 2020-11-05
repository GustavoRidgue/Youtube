package com.youtube.service;

import com.youtube.controller.VideoActions;

public class Video implements VideoActions {
    protected String title;
    protected float evaluation;
    protected int views;
    protected int likes;
    protected int dislikes;
    protected boolean reproducing;

    public Video(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        this.setReproducing(true);
    }

    @Override
    public void pause() {
        this.setReproducing(false);
    }
    
    @Override
    public void like(User user) {
        if (user.isLogged()) {
            this.likes++;
        }
    }

    @Override
    public void dislike(User user) {
        if (user.isLogged()) {
            this.dislikes++;
        }
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
