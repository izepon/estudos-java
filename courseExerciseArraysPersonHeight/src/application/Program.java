package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		int[] ages = new int[n];
		double[] heights = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			names[i] = sc.next();
			
			System.out.print("Idade: ");
			ages[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			heights[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum = sum + heights[i];
		}
		double averangeHeight = sum / n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", averangeHeight);
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if (ages[i] < 16) {
				count = count + 1;
			}
		}
		
		double percent = count * 100.0 / n;
		
		System.out.printf("Pessoas com menos 16 anos: %.1f%%%n", percent);
		
		for(int i = 0; i < n; i++) {
			if (ages[i] < 16) {
				System.out.println(names[i]);
			}
		}
		
		sc.close();

	}

}
