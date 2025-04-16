// com.xworkz.main.MediaRunner.java
package com.xworkz.main;

import com.xworkz.internal.Media;
import com.xworkz.internal.Video;

public class MediaRunner {
    public static void main(String[] args) {
        Media genericMedia = new Media("Generic Content");
        genericMedia.play();
        System.out.println(genericMedia);

        Video movie = new Video("Action Movie", 7200);
        movie.play();
        movie.rewind(60);
        System.out.println(movie);

        Media upcastedVideo = new Video("Documentary", 3600);
        upcastedVideo.play();
        System.out.println(upcastedVideo);
    }
}