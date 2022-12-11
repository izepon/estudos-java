package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		System.out.println("Caracteres em forma de árvore com usando procedimento numérico:");
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor +="#";
		}
		
		
		System.out.println("\nDesafio fazer o mesmo desenho de cima sem usar números:");
		//Desafio
		//Não pode usar valor numérico para controlar o laço.
		

		for(String v = "#"; !v.equals("######") ; v += "#" ) {
			System.out.println(v);
			
		}
	}
}
