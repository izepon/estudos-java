package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(1));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!!!"));
		System.out.println(s + "!!!!!!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Jean";
		var sobrenome = "Izepon";
		var idade = 32;
		var salario = 00000.00;
		
		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + 
				" Idade: " + idade + " Salário: " + salario + "\n\n");
		
		System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\n\nNome: %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		/*
		 Método printf:
		 
		 %s representa strings
		 %d	representa números inteiros
		 %f	representa números floats
		 %2f	representa números doubles
		 %b	representa valores booleanos
		 %c	representa valores char

		 */
	}
}	
