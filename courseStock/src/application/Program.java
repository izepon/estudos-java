package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");

		System.out.println("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price);

		System.out.println("\nProduct data: " + product);

		product.setName("Computer");
		System.out.println("Update name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice());

		System.out.println("\nEnter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println("\nUpdated data: " + product);

		System.out.println("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println("\nUpdated data: " + product);

		sc.close();
	}
}
