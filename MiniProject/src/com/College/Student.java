package com.College;

public class Student extends Person {
private int rollNo;
private String course;


public Student(String name,int age,int rollNo,String course) {
	super(name,age);
	setRollNo(rollNo);
	setCourse(course);
}
public int getRollNo() {
	return rollNo;
}
public String getCourse() {
	return course;
}

public void setRollNo(int rollNo) {
	this.rollNo=rollNo;
}
public void setCourse(String course) {
	this.course=course;
}
public void displayStudent() {
System.out.println("Student Details");
displayPerson();
System.out.println("Roll No is:"+rollNo);
System.out.println("Course is:"+course);
System.out.println("====================");
}
}
