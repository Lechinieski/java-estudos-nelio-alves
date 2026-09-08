package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount (1004, "Anna", 0.0, 0.01);
		
		//DOWCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		//SOBREPOSIÇÃO e uso do @Override
		Account abb1 = new Account(101,"joao", 1000.0);
		abb1.withdraw(200.0);
		System.out.println(abb1.getBalance());
		
		Account abb2 = new BusinessAccount(102, "pedro", 1000.0, 0.01);
		abb2.withdraw(200.0);
		System.out.println(abb2.getBalance());
		
		Account abb3 = new SavingsAccount(103, "nas", 1000.0, 500.0);
		abb3.withdraw(200.0);
		System.out.println(abb3.getBalance());
	}
}
