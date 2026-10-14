package com.Bank;

public class SavingsAccount extends BankAccount {
private double interestRate;


public SavingsAccount(String accountHolder, double balance, double interestRate) {
	super(accountHolder, balance);
	this.interestRate = interestRate;
}

public double getInterestRate() {
	return interestRate;
}

public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
}

public double calculateInterest() {
	return getBalance()*interestRate/100;
}
public void displaySaving() {
	System.out.println(" Display Saving");
	displayBankAccount();
	System.out.println("Interest rate:"+interestRate);
	
}
}
