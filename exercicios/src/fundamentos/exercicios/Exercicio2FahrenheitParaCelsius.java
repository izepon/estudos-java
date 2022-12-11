package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio2FahrenheitParaCelsius {
	public static void main(String[] args) {
		//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		//(0 °F − 32) × 5/9 =  °C

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Fahrenheit: ");
		String fahrenheit = entrada.next().replace(",", ".");
		
		double conversao = Double.parseDouble(fahrenheit);
		
		double converteCelsius = (conversao - 32) * 5/9;
		
		System.out.println("A temperatura em Celsius é: " + converteCelsius + "°C"); 		
		 
		entrada.close();
	}
}
