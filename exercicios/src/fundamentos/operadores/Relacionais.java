package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(3 > 4); 
		System.out.println(3 >= 3);
		System.out.println(5 < 4);
		System.out.println(5 <= 4);
		System.out.println(3 != 4);
		
		//Exemplo comparando nota do aluno mais o bom comportamento para ter desconto de bolsa
		//na mensalidade.
		
		double nota = 7.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean descontoMensalidade = bomComportamento && passouPorMedia;
		
		System.out.println("\nO aluno tem direito a desconto? " + descontoMensalidade);
		
	}
}
 