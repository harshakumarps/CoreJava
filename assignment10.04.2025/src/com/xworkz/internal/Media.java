// com.xworkz.internal.Media.java
package com.xworkz.internal;

public class Media {
    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Playing media.");
    }

    @Override
    public String toString() {
        return "Media [title=" + title + "]";
    }
}