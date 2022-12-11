package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");//será verdadeiro.
		
		String s1 = new String("2");
		System.out.println("2" == s1); // será falso pois não está comparando valor da string 
		//atribuida.
		System.out.println("2".equals(s1)); //para comparar os valores de strigs usa-se ".equals"
		
		/*Explicação do equals()
		 
		 Todo esse problema acontece pelo fato do == do Java comparar referências de memória 
		 ao invés de comparar o texto armazenado no objeto String.
		 Então a grande pergunta é: será que existe uma forma de comparar o texto da String, 
		 ao invés de comparar referências de memória? E a resposta é SIM, EXISTE!
         A partir de agora, TODAS as vezes que você precisar comparar strings no Java você vai 
         usar o método equals().
		 O método equals() é definido na classe Object do Java. 
		 Como todas as classes do Java herdam diretamente ou indiretamente e de Object, 
		 significa que todas as classes do Java têm este método.
		 O fato do equals() comparar os textos, faz com que o resultado seja verdadeiro sempre,
		 independentemente de como estão os objetos na memória.
		 
		 */
		
		//Exemplo com entrada no console
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2));
		
		entrada.close();
	}
}
