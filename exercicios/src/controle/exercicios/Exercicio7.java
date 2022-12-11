package controle.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		/*
		 * Criar um programa que enquanto estiver recebendo n�meros positivos, imprime
		 * no console a soma dos n�meros inseridos, caso receba um n�mero negativo,
		 * encerre o programa. Tente utilizar a estrutura do while.
		 */

		Scanner entrada = new Scanner(System.in);

		int quantidadesDeNumeros = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.println("Digite um n�meros inteiro (zero ou negativo p/ sair): ");
			numero = entrada.nextInt();

			if (numero >= 0) {
				quantidadesDeNumeros += numero; // Isso � igual a quantidadesDeNumeros = quantidadesDeNumeros + numero;
				System.out.printf("\nSoma at� o momento: %d\n", quantidadesDeNumeros);
			}

		}

		System.out.println("Fim!");

		entrada.close();
	}
}
