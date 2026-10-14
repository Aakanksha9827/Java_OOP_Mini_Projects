package com.Employee;

public class Manager extends Employee{
private int teamSize;

public Manager(String employeeName,double salary,int teamSize) {
	super(employeeName,salary);
	this.teamSize=teamSize;
}
public int getTeamSize() {
	return teamSize;
}
public double calculateBonus() {
	return getSalary()*15/100;
}
public void displayManager() {
	System.out.println("Manager");
	displayEmployee();
	System.out.println("team size is:"+teamSize);
	System.out.println("Bonus is:"+calculateBonus());
}
}
