package com.youtube;

import com.youtube.service.User;
import com.youtube.service.Video;

public class Main {
    public static void main(String[] args) {
        Video video1 = new Video("Hello guys! This is my first video");
        User user1 = new User();

        System.out.println(user1.isLogged());

        user1.login("guferrari007@gmail.com", "ridgue");

        System.out.println(user1.getEmail());
        System.out.println(user1.getPassword("gustavo_ridgue@gmail.com"));

        System.out.println(video1.toString());
        System.out.println(user1.toString());

        //String libraryWatchedVideos[] = new String[8];
        //libraryWatchedVideos[0] = new String("fwrf");

        user1.watchVideo(video1);

        System.out.println(video1.toString());
        System.out.println(user1.toString());
    }
}
