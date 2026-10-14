package com.Bank;

public class BankAccount {
private String accountHolder;
private double balance;


public BankAccount(String accountHolder, double balance) {
	super();
	this.accountHolder = accountHolder;
	this.balance = balance;
}

public String getAccountHolder() {
	return accountHolder;
}
public void setAccountHolder(String accountHolder) {
	this.accountHolder = accountHolder;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void displayBankAccount(){
	System.out.println("Account Holder:"+accountHolder);
	System.out.println("Balance:"+balance);
}

}