package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		//armazenando valor de um inteiro em um "double", não gera problemas
		//pois o valor de double armazena ponto flutuante e é maior que int;
		double a = 1; // conversão implicita.
		System.out.println(a); // imprime o valor inteiro com ponto flutuante "1.0"
		
		float b = (float) 1.12345; //utilizando o float é preciso converter o numerico double
		//nesse caso a conversão usada foi explicita, dando o tipo antes do número, 
		//o nome dessa conversão é explicita CAST.
		//Outra forma de conversão para float é adicionando "F" no final do literal
		//Exemplo: float b = 1.12345F;
		//Nessa conversão é importante saber que pode haver perda de valor.
		//O java vai truncar o valor no máximo suportado pelo tipo convertido.
		System.out.println(b);
		
		// O Java não analisa valores, somente tipos:
		//int é maior que byte, mesmo o valor nesse exemplo sendo suportado
		//ocorrerá erro entá necessário converter o valor de int para byte
		//deve-se respeitar o valor máximo suportado pelo tipo, pois caso contrário,
		//o valor convertido será truncado no máximo suportado gerando resultados redundantes e negativos.
		
		int c = 4; 
		byte d = (byte) c; //explicita CAST
		System.out.println(d);
		
		
	}
}
