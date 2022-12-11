package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// Informa��es do funcion�rio
		
		// Tipos n�mericos inteiros:
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 524;
		int id = 56789;
		long pontosAcumulados = 3_234_854_223L;
		
		// Tipos n�mericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_997_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // ou true
		
		// Tipos caractere
		
		char status = 'A'; //ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�meros de Voos
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
	    System.out.println(pontosAcumulados / vendasAcumuladas);
		
	    System.out.println("O funcion�rio do ID " + id + " recebe um sal�rio de -> R$ " + salario);
	    System.out.println("F�rias? " + estaDeFerias);
	    System.out.println("Status: " + status);
	}
}
