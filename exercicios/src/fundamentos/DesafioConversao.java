package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro salário: ");
		String salario1 = salario.next().replace(",", ".");
		
		System.out.println("Digite seu segundo salário: ");
		String salario2 = salario.next().replace(",", ".");
		
		System.out.println("Digite seu terceiro salário: ");
		String salario3 = salario.next().replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double soma = valor1 + valor2 + valor3;
		double media = soma / 3;
		
		System.out.println("O valor do primeiro salário é: " + valor1);
		System.out.println("O valor do segundo salário é: " + valor2);
		System.out.println("O valor do terceiro salário é: " + valor3);
		
		System.out.println("A soma dos salários é: " + soma);
		System.out.println("A média dos salários é: " + media);
		
		salario.close();
	}
	
}
