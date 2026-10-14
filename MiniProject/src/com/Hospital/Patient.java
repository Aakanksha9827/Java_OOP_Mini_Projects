package com.Hospital;

public class Patient extends Person {
private int patientId;
private String disease;

public Patient(String name,int age,int patientId,String disease) {
	super(name,age);
	setPatientId(patientId);
	setDisease(disease);
}
public int getPatientId() {
	return patientId;
}
public String getDisease() {
	return disease;
}
public void setPatientId(int patientId) {
	this.patientId=patientId;
}
public void setDisease(String disease) {
	this.disease=disease;
}
public void displayPatient() {
	System.out.println("Patient");
	displayPerson();
	System.out.println("Patient Id is:"+patientId);
	System.out.println("Disease name is:"+disease);
	System.out.println("****************************");

}
}
