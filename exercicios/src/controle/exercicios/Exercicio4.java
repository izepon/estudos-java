package controle.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		// Criar um programa que receba um número e diga se ele é um número primo.

		int contador = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número para verificar se é primo: ");
		int numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}

		if (contador == 0) {
			System.out.println("O número " + numero + " é primo.");
		} else {
			System.out.println("O número " + numero + " não é primo.");
		}

		System.out.println("Fim!");

		entrada.close();
	}
}
