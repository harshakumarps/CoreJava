// com.xworkz.main.EmployeeRunner.java
package com.xworkz.main;

import com.xworkz.internal.Employee;
import com.xworkz.internal.Engineer;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee genericEmployee = new Employee("John Doe", 101);
        genericEmployee.work();
        System.out.println(genericEmployee);

        Engineer softwareEngineer = new Engineer("Alice Smith", 205, "Software Development");
        softwareEngineer.work();
        softwareEngineer.code();
        System.out.println(softwareEngineer);

        Employee upcastedEngineer = new Engineer("Bob Johnson", 210, "Mechanical Engineering");
        upcastedEngineer.work();
        System.out.println(upcastedEngineer);
    }
}