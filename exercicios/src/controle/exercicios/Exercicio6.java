package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		/*
		 * Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
		 * numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar
		 * o número gerado. Ao final de cada tentativa, imprima a quantidade de
		 * tentativas restantes, e imprima se o número inserido é maior ou menor do que
		 * o número armazenado.
		 */

		Scanner entrada = new Scanner(System.in);

		int contador;
		int numeroSorteado;
		int tentativas;
		int numero;

		do {
			System.out.println("Sorteando numero entre 0 e 100...\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);

			System.out.println("Numeros sorteados! O Jogo começou! Será que consegue me vencer?!");
			tentativas = 0;

			do {
				tentativas++;
				System.out.printf("Tentativas %d: ", tentativas);
				numero = entrada.nextInt();

				if (numero > numeroSorteado) {
					System.out.printf("\nO número sorteado e menor que %d\n\n", numero);
				} else if (numero < numeroSorteado) {
					System.out.printf("\nO número sorteado e maior que %d\n\n", numero);
				} else {
					System.out.printf("\nParabéns! Você acertou o número em %d tentativas!\n\n", tentativas);
				}
			} while (numero != numeroSorteado);

			System.out.println("Digite 0 para sair, ou qualquer outro número para continuar: ");
			contador = entrada.nextInt();

		} while (contador != 0);
		
		System.out.println("Fim!");

		entrada.close();

	}
}
