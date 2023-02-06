package org.ssglobal.training.codes.itemA;

public class SavingsAccount {
	private double balance;
	private double interestRate;
	
	public SavingsAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public SavingsAccount() {
		this(0.0, 0.0);
	}
	
	public double deposit(double deposit) {
		balance += deposit;
		return balance;
	}
	
	public double withdraw(double widthdraw) {
		balance -= widthdraw;
		return balance;
	}
	
	public double addInterest(double interestRate) {
		this.interestRate = interestRate;
		balance +=  balance * (this.interestRate / 12);
		return balance ;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
