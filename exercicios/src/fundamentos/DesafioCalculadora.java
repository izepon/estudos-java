package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		//Ler num1
		//Ler num2
		//Executar uma das operações: + - / %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("informe o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("informe a operação: ");
		String op = entrada.next();
		
		//lógica do calculo
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		entrada.close();
	}

}
