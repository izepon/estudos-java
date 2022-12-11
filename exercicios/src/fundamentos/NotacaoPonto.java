package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia! X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!!");
		
		
		System.out.println(s);
		
		String z = "Zyra".toUpperCase();
		System.out.println(z);
		
		String n = "Bom dia N".replace("N", "Nami").toUpperCase().concat("!!!");
		System.out.println(n);
		
		// Tipos primitivos não tem operador "."		
		int a = 3;
		System.out.println(a);
	}
}
