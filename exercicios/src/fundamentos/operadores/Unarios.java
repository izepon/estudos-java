package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		//O conceito � simples, mas muita gente n�o sabe. 
		//A diferen�a b�sica entre os operadores de incremento pr�-fixados e p�s-fixados � 
		//o momento em que os valores s�o resolvidos. No caso dos pr�-fixados a execu��o 
		//do incremento/decremento se d� antes da resolu��o do resultado; no p�s-fixado o 
		//incremento/decremento se d� depois da resolu��o do resultado. 
		//Assim, o c�digo abaixo:
		
		// int i = 1;
		// ++i; Pr�-fixado.
		// i++; P�s-fixado.
		
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		a++; // equivalente "a = a + 1;" Incremento posfixado.
		b--; // equivalente "b = b - 1;" Decremento posfixado.
		
		++c; // equivalente "c = c + 1;" Incremento prefixado.
		--d; // equivalente "d = d - 1;" Decremento prefixado.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
