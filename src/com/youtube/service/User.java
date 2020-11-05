package com.youtube.service;

import com.youtube.progenitor.Person;

public class User extends Person {
    private boolean logged;
    private int watchedVideos;

    public void watchVideos() {

    }

    public void login() {

    }

    @Override
    public void gainExpr() {
        super.gainExpr();
    }

    public boolean isLogged() {
        return logged;
    }
    private void setLogged(boolean logged) {
        this.logged = logged;
    }

    public int getWatchedVideos() {
        return watchedVideos;
    }
    private void setWatchedVideos(int watchedVideos) {
        this.watchedVideos = watchedVideos;
    }
}
