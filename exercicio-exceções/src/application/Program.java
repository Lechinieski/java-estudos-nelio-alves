package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Holder: ");
		String holder=sc.nextLine();
		
		System.out.print("Initial balance: ");
		double deposit=sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		double withdraw=sc.nextDouble();
		
		
		Account acc=new Account(number, holder, deposit, withdraw);
		
		System.out.println();
		
		System.out.print("Enter amount for withdraw: ");
	
		
		
		
		sc.close();
	}

}
