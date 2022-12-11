package fundamentos.operadores;

public class DesafioAritmetico {
	public static void main(String[] args) {
		
		//Minha solução do desafio:
		
		int a = (6 * (3 + 2));
		int b = (int) Math.pow(a, 2);
		int c = b / (3 * 2);
		
		int d = ((1 - 5) * (2 - 7)) / 2;
		int e = (int) Math.pow(d, 2);
		int f = c - e;
		int g = (int) Math.pow(f, 3);
		
		int h = g / (int) Math.pow(10, 3);
		
		System.out.println("O resultado é " + h);
		
		//Resolução do professor:
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);
		
	}
}
