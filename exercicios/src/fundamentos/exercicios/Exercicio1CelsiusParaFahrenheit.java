package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio1CelsiusParaFahrenheit {
	
	public static void main(String[] args) {
		//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		//(0 °C × 9/5) + 32 = 32 °F

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		String celsius = entrada.next().replace(",", ".");
		
		double conversao = Double.parseDouble(celsius);
		
		double converteFahrenheit = (conversao * 9/5) + 32;
		
		System.out.println("A temperatura em Fahrenheit é: " + converteFahrenheit + "°F"); 		
		 
		entrada.close();

	}
}
