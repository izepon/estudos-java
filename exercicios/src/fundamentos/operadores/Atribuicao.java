package fundamentos.operadores;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // equivale "c = c + b;" atribui��o aditiva.
		c -= a; // equivale "c = c - a;" atribui��o subtrativa.
		c *= b; // equivale "c = c * b;" atribui��o de multiplica��o.
		c /= a; // equivale "c = c / a;" atribui��o de divis�o.
		
		System.out.println(c);
		
		c %= 2; // equivale "c = c % 2; 0 ou 1" atribui��o do m�dulo.
		System.out.println(c); // opera��o com m�dulo.
		
		
		
	}
	
}
