package controle;

import java.util.Scanner;

public class DesafioDiasSemana {
	public static void main(String[] args) {
		
		/*Desafio escrever o dia da semana e mostrar um número correspondente:
		 * 
		 * Domingo = 1
		 * Segunda = 2
		 * Terça = 3
		 * Quarta = 4
		 * Quinta = 5
		 * Sexta = 6
		 * Sábado = 7
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		
		String diaSemana = entrada.next();
		
		if (diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if (diaSemana.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if (diaSemana.equalsIgnoreCase("terça") || diaSemana.equalsIgnoreCase("terca")) {
			System.out.println(3);
		} else if (diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if (diaSemana.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if (diaSemana.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else if (diaSemana.equalsIgnoreCase("sábado") || diaSemana.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia inválido!");
		}	
		
		System.out.println("Fim!");
		
		entrada.close();
		
	}
}
