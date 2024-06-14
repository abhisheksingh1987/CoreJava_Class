package com.abhi.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap to store employee ID and employee details
        HashMap<Integer, Employee> employees = new HashMap<>();

        // Add employees to the HashMap
        employees.put(1, new Employee("John Doe", 35000));
        employees.put(2, new Employee("Jane Smith", 25000));
        employees.put(3, new Employee("Emily Johnson", 40000));
        employees.put(4, new Employee("Michael Brown", 30000));
        employees.put(5, new Employee("Chris Davis", 50000));

        // Find and print employees with a salary above 30,000
        System.out.println("Employees with salary above 30,000:");
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            Employee emp = entry.getValue();
            if (emp.getSalary() > 30000) {
                System.out.println(emp);
            }
        }
    }
}