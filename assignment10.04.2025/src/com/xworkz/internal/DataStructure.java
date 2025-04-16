package com.xworkz.internal;

public class DataStructure {
    protected String name;

    public DataStructure(String name) {
        this.name = name;
    }

    public void storeData() {
        System.out.println(name + " is used to store data.");
    }

    @Override
    public String toString() {
        return "DataStructure [name=" + name + "]";
    }
}