// com.xworkz.internal.Video.java
package com.xworkz.internal;

public class Video extends Media {
    private int duration;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title + " (" + duration + " seconds).");
    }

    public void rewind(int seconds) {
        System.out.println("Rewinding video by " + seconds + " seconds.");
    }

    @Override
    public String toString() {
        return "Video [title=" + title + ", duration=" + duration + "]";
    }
}