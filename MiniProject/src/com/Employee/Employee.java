package com.Employee;

public class Employee {
private String employeeName;
private double salary;
public Employee(String employeeName,double salary) {
	super();
	this.employeeName=employeeName;
	this.salary=salary;
	
}
public double getSalary() {
	return salary;
}

public void displayEmployee() {
	System.out.println("Employee Name is:"+employeeName);
	System.out.println("Salary is:"+salary);
	
}


}
