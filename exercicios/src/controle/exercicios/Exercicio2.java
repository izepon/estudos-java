package controle.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		// 2. Criar um programa informa se o ano atual é um ano bissexto;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();
		
		int bissexto = ano % 4;
		
		if(bissexto == 0) {
			System.out.println(ano + " é um ano bissexto.");
		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}
		
		System.out.println("Fim!");
		
		entrada.close();
	}
}
