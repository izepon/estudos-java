package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio5AreaTriangulo {
	public static void main(String[] args) {
		//Criar um programa que leia o valor da base e da altura de um tri?ngulo 
		//e calcule a ?rea.
		
		
		Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite a Base:");
		double base = scanner.nextDouble();
		
		System.out.println("Digite a Altura:");
		double altura = scanner.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A ?rea do Tri?ngulo ?: " + area);
		
		scanner.close();
		
	}
}
