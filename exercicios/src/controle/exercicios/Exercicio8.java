package controle.exercicios;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		//Criar um programa que receba uma palavra e imprime no console letra por letra.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a palavra que será soletrada: ");
		String palavra = entrada.nextLine();
		
		char letras[] = palavra.toCharArray();
		
		for(int i = 0; i < palavra.length(); i++) {
			
			System.out.println(letras[i]);
		}
		
		System.out.println("\nFim!");
		entrada.close();
	}
}
