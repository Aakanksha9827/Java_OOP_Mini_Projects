package com.Vehicle;

public class Vehicle {
private String brand;
private int speed;

public Vehicle(String brand,int speed) {
	super();
	this.brand=brand;
	this.speed=speed;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public void displayVehicle(){
	System.out.println("Vehicle Brand is:"+brand);
	System.out.println("vehicle speed is:"+speed);
	
}
}
