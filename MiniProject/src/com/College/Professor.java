package com.College;

public class Professor extends Person {
private int professorId;
private String subject;

public Professor(String name,int age,int professorId,String subject) {
	super(name,age);
	setProfessorId(professorId);
	setSubject(subject);
}
public int getProfessorId() {
	return professorId;
}
public String getSubject() {
	return subject;
}
public void setProfessorId(int professorId) {
	this.professorId=professorId;
}
public void setSubject(String subject) {
	this.subject=subject;
}
public void displayProfessor() {
	System.out.println(" Professor Details");
	displayPerson();
	System.out.println("Professor id is:"+professorId);
	System.out.println("subject name is:"+subject);
}
}
