package controle.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		// Crie um programa que recebe 10 valores e ao final imprima o maior n�mero.

		Scanner entrada = new Scanner(System.in);

		int numeroMaior = 0;
		int contador = 0;

		do {
			System.out.println("Digite um n�mero: ");
			int numero = entrada.nextInt();

			if (numero > numeroMaior) {
				numeroMaior = numero;
			}

			contador++;
		} while (contador != 10);

		System.out.println("\nO maior n�mero foi: " + numeroMaior);

		System.out.println("\nFim!");
		entrada.close();
	}
}
