package fundamentos.operadores;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // equivale "c = c + b;" atribuição aditiva.
		c -= a; // equivale "c = c - a;" atribuição subtrativa.
		c *= b; // equivale "c = c * b;" atribuição de multiplicação.
		c /= a; // equivale "c = c / a;" atribuição de divisão.
		
		System.out.println(c);
		
		c %= 2; // equivale "c = c % 2; 0 ou 1" atribuição do módulo.
		System.out.println(c); // operação com módulo.
		
		
		
	}
	
}
