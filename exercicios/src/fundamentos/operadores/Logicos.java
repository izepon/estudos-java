package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		
		//Tabela verdade "E / And / &&" - Operador Bin�rio
		
		System.out.println("\nTabela verdade do E (And)");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && true);
		
		
		//Tabela verdade "OU / OR / ||" - Operador Bin�rio
		
		System.out.println("\nTabela verdade do OU (OR)");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || true);
		
		//Tabela verdade "OU exclusivo / XOR / ^" - Operador Bin�rio
		
		System.out.println("\nTabela verdade do OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ true);
		
		//Tabela verdade "Nega��o / NOT / !" - Operador Un�rio
		
		System.out.println("\nTabela verdade NOT - Nega��o");
		System.out.println(!true); //n�o true � false
		System.out.println(!false);//n�o false � true

	}
	
}
 