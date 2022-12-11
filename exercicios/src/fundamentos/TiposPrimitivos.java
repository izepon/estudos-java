package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// Informações do funcionário
		
		// Tipos númericos inteiros:
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 524;
		int id = 56789;
		long pontosAcumulados = 3_234_854_223L;
		
		// Tipos númericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_997_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // ou true
		
		// Tipos caractere
		
		char status = 'A'; //ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Números de Voos
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
	    System.out.println(pontosAcumulados / vendasAcumuladas);
		
	    System.out.println("O funcionário do ID " + id + " recebe um salário de -> R$ " + salario);
	    System.out.println("Férias? " + estaDeFerias);
	    System.out.println("Status: " + status);
	}
}
