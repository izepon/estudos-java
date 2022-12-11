package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		//Ler num1
		//Ler num2
		//Executar uma das opera��es: + - / %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o n�mero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("informe o n�mero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("informe a opera��o: ");
		String op = entrada.next();
		
		//l�gica do calculo
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		entrada.close();
	}

}
