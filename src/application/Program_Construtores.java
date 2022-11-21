package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_Construtores;

public class Program_Construtores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Atributos "Vazios"
//		System.out.println(product.name);
//		System.out.println(product.price);
//		System.out.println(product.quantity);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.next();		
		System.out.print("Price: ");
		double price = sc.nextDouble();	
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product_Construtores product = new Product_Construtores(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number os products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: "+ product);
		
		System.out.println();
		System.out.print("Enter the number os products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.print("Update data: " + product);
		
		sc.close();
	}

}
