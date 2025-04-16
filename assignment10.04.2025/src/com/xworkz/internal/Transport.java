// com.xworkz.internal.Transport.java
package com.xworkz.internal;

public class Transport {
    protected String type;

    public Transport(String type) {
        this.type = type;
    }

    public void move() {
        System.out.println(type + " is moving.");
    }

    @Override
    public String toString() {
        return "Transport [type=" + type + "]";
    }
}