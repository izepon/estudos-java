package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		// 1 - Criar um programa que receba um número e verifique se ele está entre 0 e
		// 10 e é par;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o número: ");
		int numero = entrada.nextInt();

		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("O número " + numero + " está entre 0 e 10 e é um número par.");
			} else {
				System.out.println("O número " + numero + " está entre 0 e 10 mas não é um número par.");
			}
		} else {
			System.out.println("O número " + numero + " não está entre 0 e 10.");
		}

		entrada.close();

	}
}
