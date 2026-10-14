package com.Vehicle;

public class Car extends Vehicle {
private int numberOfSeats;
private double price;


public Car(String brand, int speed, int numberOfSeats, double price) {
	super(brand, speed);
	this.numberOfSeats = numberOfSeats;
	this.price = price;
}
public int getNumberOfSeats() {
	return numberOfSeats;
}
public void setNumberOfSeats(int numberOfSeats) {
	this.numberOfSeats = numberOfSeats;
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
public void displayCar(int days) {
	System.out.println("Car Details");
	displayVehicle();
	System.out.println("number of seats are:"+numberOfSeats);
	System.out.println("price is:"+price);
	System.out.println("car rentall for "+days+" days:"+calculateRent(days));
	System.out.println("************************************");
}
}
