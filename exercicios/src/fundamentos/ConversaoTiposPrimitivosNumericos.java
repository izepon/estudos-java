package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		//armazenando valor de um inteiro em um "double", n�o gera problemas
		//pois o valor de double armazena ponto flutuante e � maior que int;
		double a = 1; // convers�o implicita.
		System.out.println(a); // imprime o valor inteiro com ponto flutuante "1.0"
		
		float b = (float) 1.12345; //utilizando o float � preciso converter o numerico double
		//nesse caso a convers�o usada foi explicita, dando o tipo antes do n�mero, 
		//o nome dessa convers�o � explicita CAST.
		//Outra forma de convers�o para float � adicionando "F" no final do literal
		//Exemplo: float b = 1.12345F;
		//Nessa convers�o � importante saber que pode haver perda de valor.
		//O java vai truncar o valor no m�ximo suportado pelo tipo convertido.
		System.out.println(b);
		
		// O Java n�o analisa valores, somente tipos:
		//int � maior que byte, mesmo o valor nesse exemplo sendo suportado
		//ocorrer� erro ent� necess�rio converter o valor de int para byte
		//deve-se respeitar o valor m�ximo suportado pelo tipo, pois caso contr�rio,
		//o valor convertido ser� truncado no m�ximo suportado gerando resultados redundantes e negativos.
		
		int c = 4; 
		byte d = (byte) c; //explicita CAST
		System.out.println(d);
		
		
	}
}
