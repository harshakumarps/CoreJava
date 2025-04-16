package com.xworkz.internal;

public class Game {
    protected String title;
    protected String genre;

    public Game(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public void play() {
        System.out.println("Playing " + title + " (" + genre + " game).");
    }

    @Override
    public String toString() {
        return "Game [title=" + title + ", genre=" + genre + "]";
    }
}