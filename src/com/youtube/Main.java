package com.youtube;

import com.youtube.service.User;
import com.youtube.service.Video;

public class Main {
    public static void main(String[] args) {
        Video video1 = new Video("Hello guys! This is my first video");
        User user1 = new User();

        System.out.println(user1.isLogged());

        user1.login("guferrari007@gmail.com", "ferrari0071");

        System.out.println(user1.getEmail());
        System.out.println(user1.getPassword("guferrari007@gmail.com"));

        System.out.println(video1.toString());
        System.out.println(user1.toString());

        user1.watchVideo(video1);

        System.out.println(video1.toString());
        System.out.println(user1.toString());
    }
}
