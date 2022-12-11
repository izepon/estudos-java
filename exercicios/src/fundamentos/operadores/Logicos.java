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
		
		
		//Tabela verdade "E / And / &&" - Operador Binário
		
		System.out.println("\nTabela verdade do E (And)");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && true);
		
		
		//Tabela verdade "OU / OR / ||" - Operador Binário
		
		System.out.println("\nTabela verdade do OU (OR)");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || true);
		
		//Tabela verdade "OU exclusivo / XOR / ^" - Operador Binário
		
		System.out.println("\nTabela verdade do OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ true);
		
		//Tabela verdade "Negação / NOT / !" - Operador Unário
		
		System.out.println("\nTabela verdade NOT - Negação");
		System.out.println(!true); //não true é false
		System.out.println(!false);//não false é true

	}
	
}
 