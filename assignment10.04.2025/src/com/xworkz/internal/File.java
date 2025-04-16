// com.xworkz.internal.File.java
package com.xworkz.internal;

public class File {
    protected String name;

    public File(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Opening file: " + name);
    }

    @Override
    public String toString() {
        return "File [name=" + name + "]";
    }
}