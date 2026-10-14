package com.Shopping;

public class Test {
	public static void main(String[]args) {
	Electronics e=new Electronics("Laptop",60000,2);
	e.displayElectronics();
	e.calculateWarranty();
	Clothing c=new Clothing("Shirt",2000,"M",10);
	c.displayClothing();
	c.calculateDiscount();
	c.calculateFinalPrice();
	


}
}
