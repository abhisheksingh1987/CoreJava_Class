package com.java8.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program1 {
	
	public static void main (String[] args) {
	
	List<Employee> employee = new ArrayList<Employee>();
	employee.add(new Employee("Anjana",20,"Female","HR"));
	employee.add(new Employee("Shiva",30,"Female","HR"));
	employee.add(new Employee("Kiran",20,"Female","CEO"));
	employee.add(new Employee("Deepti",40,"Female","Developer"));
	employee.add(new Employee("Anjana",25,"Female","HR"));
	
	employee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	
	//Map<String,long> employeeCount = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
	//System.out.println(employeeCount);
	
	//Map<String,Double> avgAge = employee.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee:: getAge)));
	
	//System.out.println(avgAge);
	
	}
	

}
