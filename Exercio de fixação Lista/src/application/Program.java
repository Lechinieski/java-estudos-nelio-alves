package application;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employe;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner (System.in);
		
		
		System.out.print("How many employees will be registered? ");
		int n=sc.nextInt();
		
		ArrayList<Employe>employees= new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			System.out.printf("Employee #%d:%n", i+1);
			System.out.print("Id: ");
			int id= sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String nome= sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new Employe(id,nome,salary));
		}
		System.out.print("Enter the employee id that will have salary increase: ");
		int idS= sc.nextInt();
		
		boolean found = false;
		
		for(Employe employee: employees) {
			if(employee.getId()== idS) {
				System.out.print("Enter the percentage: ");
				double porcent= sc.nextDouble();
				employee.setSalary(
						employee.getSalary()+employee.getSalary()* porcent/100);

			found=true;
			break;
			}
		}
		
		if(!found) {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employe employee: employees) {
			
		System.out.printf("%d - %s - %.2f%n",
				employee.getId(),
				employee.getNome(),
				employee.getSalary());
		}
		sc.close();
	}

}

