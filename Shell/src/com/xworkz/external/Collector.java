package com.xworkz.external;

public class Collector {
    public Collector(){
        System.out.println("Running in Collector");
    }

    public void display() {
        Shell shell = new Shell();
        shell.collect();
        shell.crack();
    }
}
