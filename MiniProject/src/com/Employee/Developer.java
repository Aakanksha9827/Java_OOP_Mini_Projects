package com.Employee;

public class Developer extends Employee {
private String programmingLanguage;

public Developer(String employeeName,double salary,String programmingLanguage) {
	super(employeeName,salary);
	this.programmingLanguage=programmingLanguage;
}
public String getProgrammingLanguage() {
	return programmingLanguage;
}
public double calculateBonus() {
	return getSalary()*10/100;
}

public void displayDeveloper() {
	System.out.println("Developer");
	displayEmployee();
	System.out.println("Programming Language:"+programmingLanguage);
	System.out.println("Bonus is:"+calculateBonus());
	System.out.println("********************");
}
}
