// com.xworkz.main.FileRunner.java
package com.xworkz.main;

import com.xworkz.internal.File;
import com.xworkz.internal.ImageFile;

public class FileRunner {
    public static void main(String[] args) {
        File genericFile = new File("document.txt");
        genericFile.open();
        System.out.println(genericFile);

        ImageFile photo = new ImageFile("vacation.jpg", "1920x1080");
        photo.open();
        photo.display();
        System.out.println(photo);

        File upcastedImage = new ImageFile("logo.png", "300x100");
        upcastedImage.open();
        System.out.println(upcastedImage);
    }
}