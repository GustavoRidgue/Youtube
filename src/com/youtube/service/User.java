package com.youtube.service;

import com.youtube.progenitor.Person;

import java.util.Arrays;

public class User extends Person {
    private boolean logged;
    private int watchedVideos;
    private int experience;
    private String libraryWatchedVideos[];
    private String returnList[];
    private String email;
    private String password;

    public void watchVideo(Video video) {
        if (this.isLogged()) {
            video.views++;
            this.watchedVideos++;
            this.gainExpr();
            //libraryWatchedVideos[watchedVideos] = video.getTitle();
        }
    }

    public void login(String email, String password) {
        this.email = email;
        this.password = password;
        this.setLogged(true);
    }

    public String[] getLibraryWatchedVideos(String email, String password) {
        if (email.equals(this.getEmail()) && password.equals(this.getPassword(email))) {
            return libraryWatchedVideos;
        } else {
            System.out.println("Invalid credentials");
            return returnList;
        }
    }

    @Override
    protected void gainExpr() {
        this.experience += 100;
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

    public int getExperience() {
        return experience;
    }

    private void setExperience(int experience) {
        this.experience = experience;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword(String email) {
        if (this.getEmail().equals(email)) {
            return password;
        } else {
            System.out.println("Invalid credentials");
            return "";
        }
    }

    public void setPassword(String email, String password) {
        if (this.getEmail().equals(email)) {
            this.password = password;
        } else {
            System.out.println("Invalid credentials");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "logged=" + logged +
                ", watchedVideos=" + watchedVideos +
                ", experience=" + experience +
                ", libraryWatchedVideos=" + Arrays.toString(libraryWatchedVideos) +
                ", returnList=" + Arrays.toString(returnList) +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
