package com.xworkz.internal;

public class Task {
    protected String description;

    public Task(String description) {
        this.description = description;
    }

    public void execute() {
        System.out.println("Executing task: " + description + ".");
    }

    @Override
    public String toString() {
        return "Task [description=" + description + "]";
    }
}