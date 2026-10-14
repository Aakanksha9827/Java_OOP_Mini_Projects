package com.Bank;

public class CurrentAccount extends BankAccount{
	
private double overdraftLimit;

public CurrentAccount(String accountHolder, double balance, double overdraftLimit) {
	super(accountHolder, balance);
	this.overdraftLimit = overdraftLimit;
}

public double getOverdraftLimit() {
	return overdraftLimit;
}

public void setOverdraftLimit(double overdraftLimit) {
	this.overdraftLimit = overdraftLimit;
}
boolean checkOverdraftLimit(double withdrawlAmount){
	return withdrawlAmount>0 && withdrawlAmount<=getBalance()+overdraftLimit;	
	}

public void displayCurrentAccount(){
	System.out.println("Display Current Account");
	displayBankAccount();
	System.out.println("Over Draft Limit:"+overdraftLimit);
	
}

}
