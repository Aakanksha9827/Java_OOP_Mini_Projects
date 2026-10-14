package com.Hospital;

public class Test {
public static void main(String[]args) {
	Doctor d=new Doctor("Aakanksha",45,101,60000);
	d.displayDoctor();
	Patient p=new Patient("Ram",35,102,"Dengue");
	p.displayPatient();
	System.out.println();
	System.out.println("Expected salary:"+d.calculateSalary());
	
	
}
}
