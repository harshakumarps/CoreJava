package com.xworkz.internal;

public class Mutant {
    private String name;
    private String power;
    private int strengthLevel;
    private boolean visible;
    private int age;


    void setName(String name) {
        this.name = name;
    }

    void setPower(String power) {
        this.power = power;
    }

    void setStrengthLevel(int strengthLevel) {
        this.strengthLevel = strengthLevel;
    }

    void setVisible(boolean visible) {
        this.visible = visible;
    }

    void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public int getStrengthLevel() {
        return strengthLevel;
    }

    public boolean isVisible() {
        return visible;
    }

    public int getAge() {
        return age;
    }
}