package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");//ser� verdadeiro.
		
		String s1 = new String("2");
		System.out.println("2" == s1); // ser� falso pois n�o est� comparando valor da string 
		//atribuida.
		System.out.println("2".equals(s1)); //para comparar os valores de strigs usa-se ".equals"
		
		/*Explica��o do equals()
		 
		 Todo esse problema acontece pelo fato do == do Java comparar refer�ncias de mem�ria 
		 ao inv�s de comparar o texto armazenado no objeto String.
		 Ent�o a grande pergunta �: ser� que existe uma forma de comparar o texto da String, 
		 ao inv�s de comparar refer�ncias de mem�ria? E a resposta � SIM, EXISTE!
         A partir de agora, TODAS as vezes que voc� precisar comparar strings no Java voc� vai 
         usar o m�todo equals().
		 O m�todo equals() � definido na classe Object do Java. 
		 Como todas as classes do Java herdam diretamente ou indiretamente e de Object, 
		 significa que todas as classes do Java t�m este m�todo.
		 O fato do equals() comparar os textos, faz com que o resultado seja verdadeiro sempre,
		 independentemente de como est�o os objetos na mem�ria.
		 
		 */
		
		//Exemplo com entrada no console
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2));
		
		entrada.close();
	}
}
