package controle.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		/*
		 * Criar um programa que enquanto estiver recebendo números positivos, imprime
		 * no console a soma dos números inseridos, caso receba um número negativo,
		 * encerre o programa. Tente utilizar a estrutura do while.
		 */

		Scanner entrada = new Scanner(System.in);

		int quantidadesDeNumeros = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.println("Digite um números inteiro (zero ou negativo p/ sair): ");
			numero = entrada.nextInt();

			if (numero >= 0) {
				quantidadesDeNumeros += numero; // Isso é igual a quantidadesDeNumeros = quantidadesDeNumeros + numero;
				System.out.printf("\nSoma até o momento: %d\n", quantidadesDeNumeros);
			}

		}

		System.out.println("Fim!");

		entrada.close();
	}
}
