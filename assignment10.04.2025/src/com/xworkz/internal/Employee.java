// com.xworkz.internal.Employee.java
package com.xworkz.internal;

public class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void work() {
        System.out.println("Employee " + name + " is working.");
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", employeeId=" + employeeId + "]";
    }
}