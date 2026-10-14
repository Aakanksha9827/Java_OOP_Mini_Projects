package com.Bank;

public class Test {

	public static void main(String[] args) {
		
		SavingsAccount s=new SavingsAccount("Rama",5000,5);
		s.displaySaving();
		s.calculateInterest();
		System.out.println();
		CurrentAccount c=new CurrentAccount("Aakanksha",20000,10000);
		c.displayCurrentAccount();
		double withdrawal=30000;
		if(c.checkOverdraftLimit(withdrawal)) {
			System.out.println("withdrawal result permitted");
		}
			else{
				System.out.println("withdrawal result not permitted");
			}
		
	}
}
