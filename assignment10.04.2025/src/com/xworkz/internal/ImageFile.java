// com.xworkz.internal.ImageFile.java
package com.xworkz.internal;

public class ImageFile extends File {
    private String resolution;

    public ImageFile(String name, String resolution) {
        super(name);
        this.resolution = resolution;
    }

    @Override
    public void open() {
        System.out.println("Opening image file: " + name + " (Resolution: " + resolution + ")");
    }

    public void display() {
        System.out.println("Displaying image: " + name);
    }

    @Override
    public String toString() {
        return "ImageFile [name=" + name + ", resolution=" + resolution + "]";
    }
}