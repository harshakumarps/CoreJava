// com.xworkz.internal.Engineer.java
package com.xworkz.internal;

public class Engineer extends Employee {
    private String specialization;

    public Engineer(String name, int employeeId, String specialization) {
        super(name, employeeId);
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println("Engineer " + name + " is working on " + specialization + " projects.");
    }

    public void code() {
        System.out.println("Engineer " + name + " is writing code.");
    }

    @Override
    public String toString() {
        return "Engineer [name=" + name + ", employeeId=" + employeeId + ", specialization=" + specialization + "]";
    }
}