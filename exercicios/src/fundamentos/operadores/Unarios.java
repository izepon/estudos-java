package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		//O conceito é simples, mas muita gente não sabe. 
		//A diferença básica entre os operadores de incremento pré-fixados e pós-fixados é 
		//o momento em que os valores são resolvidos. No caso dos pré-fixados a execução 
		//do incremento/decremento se dá antes da resolução do resultado; no pós-fixado o 
		//incremento/decremento se dá depois da resolução do resultado. 
		//Assim, o código abaixo:
		
		// int i = 1;
		// ++i; Pré-fixado.
		// i++; Pós-fixado.
		
		
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
