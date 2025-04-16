package com.xworkz.internal;

public class VideoGame extends Game {
    protected String platform;

    public VideoGame(String title, String genre, String platform) {
        super(title, genre);
        this.platform = platform;
    }

    public void loadSave() {
        System.out.println("Loading save for " + title + " on " + platform + ".");
    }

    @Override
    public String toString() {
        return "VideoGame [title=" + title + ", genre=" + genre + ", platform=" + platform + "]";
    }
}