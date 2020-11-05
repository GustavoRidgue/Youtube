package com.youtube.controller;

import com.youtube.service.User;

public interface VideoActions {
    public abstract void play();
    public abstract void pause();
    public abstract void like(User user);
    public abstract void dislike(User user);
}
