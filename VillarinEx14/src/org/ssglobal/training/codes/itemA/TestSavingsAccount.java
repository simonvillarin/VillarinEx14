package org.ssglobal.training.codes.itemA;

public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(1000, 0.10);
		System.out.println("Balance after deposit: %.2f".formatted(sa.deposit(500)));	
		System.out.println("Balance after widthdraw: %.2f".formatted(sa.withdraw(300)));
		System.out.println("Balance after interest added: %.2f".formatted(sa.addInterest(0.20)));
		
		SavingsAccount sa1 = new SavingsAccount();
		System.out.println("Balance: %.2f".formatted(sa1.getBalance()));
		System.out.println("Balance: %.2f".formatted(sa1.getInterestRate()));
	}

}
