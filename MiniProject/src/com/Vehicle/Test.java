package com.Vehicle;

public class Test {
public static void main(String[]args) {
	Car c=new Car("Toyota",180,5,2500);
	Bike b=new Bike("Honda",120,150,800);
	int days=4;
	c.displayCar(days);
	b.displayBike(days);
}
}
