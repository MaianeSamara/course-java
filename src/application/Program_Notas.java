package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Program_Notas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas student = new Notas();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		
		System.out.print("Grade 1: ");
		student.grade1 = sc.nextDouble();
		
		System.out.print("Grade 2: ");
		student.grade2 = sc.nextDouble();
		
		System.out.print("Grade 3: ");
		student.grade3 = sc.nextDouble();

		System.out.printf("TOTAL GRADE: %.2f%n", student.totalGrade());
		
		if (student.totalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}

}