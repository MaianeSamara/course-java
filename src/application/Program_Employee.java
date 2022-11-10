package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee_Exercicio_02;

public class Program_Employee {

	public static void main(String[] args) {

		Employee_Exercicio_02 emp = new Employee_Exercicio_02();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + emp);
		
		sc.close();
	}

}
