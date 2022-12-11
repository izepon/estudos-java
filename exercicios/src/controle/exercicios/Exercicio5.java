package controle.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		// Refatorar o exercício 04, utilizando a estrutura switch.

		int contador = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número para verificar se é primo: ");
		int numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}

		switch (contador) {

		case 0:
			System.out.println("O número " + numero + " é primo.");
			break;

		default:
			System.out.println("O número " + numero + " não é primo.");
		}

		System.out.println("Fim!");

		entrada.close();

	}
}
