package com.Shopping;

public class Electronics extends Product {

	private int warrantyYears;
	
	public Electronics(String productName,double price,int warrantyYears) {
		super(productName,price);
		this.warrantyYears=warrantyYears;
	}
	public int calculateWarranty() {
		return warrantyYears*12;
	}
	
	public void displayElectronics(){
		System.out.println("Display Electronics");
		displayProduct();
		System.out.println("Warrenty Years:"+warrantyYears);
		System.out.println("Warranty:"+calculateWarranty());
		System.out.println("*********************");
	}
}

