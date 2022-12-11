package arrays;

import java.util.Scanner;

//Fazer um array que receba quantidade de notas e fazer dois for para isso, um sendo foreach.

public class Desafio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas: ");

		int qtdNotas = entrada.nextInt();

		double[] notas = new double[qtdNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}

		double total = 0;
		for (double nota : notas) {
			total += nota;
		}

		double media = (total / notas.length);
		System.out.println("A m�dia �: " + media);
		entrada.close();
	}
}
