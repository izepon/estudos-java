package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[4];

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 7;
		notasAlunoA[3] = 7.5;

		System.out.println("Todas as notas do aluno A: " + Arrays.toString(notasAlunoA));

		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println("Média do aluno A: " + totalAlunoA / notasAlunoA.length);

		double[] notasAlunoB = { 6.9, 5.5, 7.8, 10 };
		System.out.println("\nTodas as notas do aluno B: " + Arrays.toString(notasAlunoB));

		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println("Média do aluno A: " + totalAlunoB / notasAlunoB.length);
	}
}
