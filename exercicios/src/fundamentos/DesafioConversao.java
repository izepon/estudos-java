package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro sal�rio: ");
		String salario1 = salario.next().replace(",", ".");
		
		System.out.println("Digite seu segundo sal�rio: ");
		String salario2 = salario.next().replace(",", ".");
		
		System.out.println("Digite seu terceiro sal�rio: ");
		String salario3 = salario.next().replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double soma = valor1 + valor2 + valor3;
		double media = soma / 3;
		
		System.out.println("O valor do primeiro sal�rio �: " + valor1);
		System.out.println("O valor do segundo sal�rio �: " + valor2);
		System.out.println("O valor do terceiro sal�rio �: " + valor3);
		
		System.out.println("A soma dos sal�rios �: " + soma);
		System.out.println("A m�dia dos sal�rios �: " + media);
		
		salario.close();
	}
	
}
