package fundamentos.operadores;

public class Aritmeticos {
	public static void main(String[] args) {
		
		System.out.println("Calculando com somas: 2 + 3 = " + (2 + 3));
		
		//Double
		var x = 34.56;
		double y = 2.2;
		
		System.out.println("\nValores declarados com tipo Double, onde x = 34.56 e y = 2.2");
		System.out.println("Calculando n�meros declarados Double, soma: " + (x + y));
		System.out.println("Calculando n�meros declarados Double, subtra��o: " + (x - y));
		System.out.println("Calculando n�meros declarados Double, multiplica��o: " + (x * y));
		System.out.println("Calculando n�meros declarados Double, divis�o: " + (x / y));
		
		
		//Int
		
		int a = 8;
		int b = 3;
		
		System.out.println("\nValores declarados com tipo Int, onde a = 8 e b = 3");
		System.out.println("Calculando n�meros declarados Int, soma: " + (a + b));
		System.out.println("Calculando n�meros declarados Int, subtra��o: " + (a - b));
		System.out.println("Calculando n�meros declarados Int, multiplica��o: " + (a * b));
		System.out.println("Calculando n�meros declarados Int, divis�o: " + (a / b));
		System.out.println("Calculando n�meros declarados Int, divis�o: " + (a / (double) b));
		
		
	}
}
