package com.xworkz.internal;

public class ScheduledTask extends Task {
    protected String schedule;

    public ScheduledTask(String description, String schedule) {
        super(description);
        this.schedule = schedule;
    }

    public void executeOnSchedule() {
        System.out.println("Executing scheduled task: " + description + " at " + schedule + ".");
    }

    @Override
    public void execute() {
        executeOnSchedule();
    }

    @Override
    public String toString() {
        return "ScheduledTask [description=" + description + ", schedule=" + schedule + "]";
    }
}