package com.Hospital;

public class Doctor extends Person {
private int doctorId;
private double salary;

public Doctor(String name,int age,int doctorId,double salary) {
	super(name,age);
	setDoctorId(doctorId);
	setSalary(salary);
}
public int getDoctorId() {
	return doctorId;
}
public double getSalary() {
	return salary;
}
public void setDoctorId(int doctorId) {
	this.doctorId=doctorId;
}
public void setSalary(double salary) {
	this.salary=salary;
}
public double calculateSalary() {
	return salary=salary+(salary*20/100);
}
public void displayDoctor() {
	System.out.println("Doctor");
	displayPerson();
	System.out.println("Doctor Id:"+doctorId);
	System.out.println("Doctor Salary:"+salary);
	System.out.println("******************************************");
	
	
}

}
