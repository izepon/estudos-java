package arrays;

public class Foreach {

	public static void main(String[] args) {

//		Como percorrer um array com foreach(para cada):
		double[] notas = { 9, 8, 7, 5 };

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i] + " ");
		}

		System.out.println();

		for (double nota : notas) {
			System.out.println(nota + " ");
		}
	}
}
