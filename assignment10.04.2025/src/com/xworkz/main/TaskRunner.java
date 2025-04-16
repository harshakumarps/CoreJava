package com.xworkz.main;

import com.xworkz.internal.ScheduledTask;
import com.xworkz.internal.Task;

public class TaskRunner {
    public static void main(String[] args) {
        Task genericTask = new Task("Generic Task");
        genericTask.execute();
        System.out.println(genericTask);

        ScheduledTask dailyReport = new ScheduledTask("Generate Daily Report", "9:00 AM");
        dailyReport.execute();
        System.out.println(dailyReport);

        Task upcastedScheduledTask = new ScheduledTask("Backup Database", "Midnight");
        upcastedScheduledTask.execute();
        System.out.println(upcastedScheduledTask);
    }
}