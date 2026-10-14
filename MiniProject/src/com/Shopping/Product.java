package com.Shopping;

public class Product {
private String productName;
private double price;

 Product(String productName,double price){
	 super();
	 this.productName=productName;
	 this.price=price;
 }
 public String getName() {
	 return productName;
 }
 public double getPrice() {
	 return price;
 }
 
 public void displayProduct() {
	 System.out.println("Product Name:"+productName);
	 System.out.println("Price Name:"+price);
	 
 }
 
}
