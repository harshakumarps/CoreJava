// com.xworkz.internal.Computer.java
package com.xworkz.internal;

public class Computer {
    protected String processor;

    public Computer(String processor) {
        this.processor = processor;
    }

    public void bootUp() {
        System.out.println("Computer is booting up.");
    }

    @Override
    public String toString() {
        return "Computer [processor=" + processor + "]";
    }
}