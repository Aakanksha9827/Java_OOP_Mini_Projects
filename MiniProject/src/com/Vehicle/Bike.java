package com.Vehicle;

public class Bike extends Vehicle{
private int engineCC;
private double price;
public int getEngineCC() {
	return engineCC;
}

public Bike(String brand, int speed, int engineCC, double price) {
	super(brand, speed);
	this.engineCC = engineCC;
	this.price = price;
}

public void setEngineCC(int engineCC) {
	this.engineCC = engineCC;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
double calculateRent(int days) {
	return price*days;
}
public void displayBike(int days) {
	System.out.println("Bike Details");
	displayVehicle();
	System.out.println("engine is:"+engineCC);
	System.out.println("price is:"+price);
	System.out.println("bike rental for "+days+" days:"+ calculateRent(days));
	System.out.println("*********************");
}
}
