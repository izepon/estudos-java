package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio3CalculoIMC {

	public static void main(String[] args) {
		//Criar um programa que leia o peso e a altura do usu�rio e imprima no console o IMC.
		//IMC = peso/ (altura x altura)
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura = entrada.nextDouble();

		
		double imc = peso / (altura * altura);
		
		System.out.println("O seu IMC �: " + imc); 
		
		entrada.close();
	}
}
