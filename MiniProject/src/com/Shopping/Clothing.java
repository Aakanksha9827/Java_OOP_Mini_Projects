package com.Shopping;

public class Clothing extends Product{
private String size;
private double discount;

public Clothing(String productName,double price,String size,double discount) {
	super(productName,price);
	this.size=size;
	this.discount=discount;
}
public double calculateDiscount() {
	return getPrice()*discount/100;
	
}
public double calculateFinalPrice() {
	return getPrice()-calculateDiscount();
	
}
public void displayClothing() {
	System.out.println("Clothing");
	displayProduct();
	System.out.println("Size is:"+size);
	System.out.println("discount is:"+discount);
	System.out.println("discount calculated is:"+calculateDiscount());
	System.out.println("final price is:"+calculateFinalPrice());
}
}
