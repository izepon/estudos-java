package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		System.out.println("Caracteres em forma de �rvore com usando procedimento num�rico:");
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor +="#";
		}
		
		
		System.out.println("\nDesafio fazer o mesmo desenho de cima sem usar n�meros:");
		//Desafio
		//N�o pode usar valor num�rico para controlar o la�o.
		

		for(String v = "#"; !v.equals("######") ; v += "#" ) {
			System.out.println(v);
			
		}
	}
}
