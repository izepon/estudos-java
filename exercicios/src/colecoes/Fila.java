package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> Adicionam elementos na fila
		// A diferen�a � o comportamento quando a fila est� cheia!
		// No caso do Add vai gerar um erro de exce��o e o Offer vai retornar false e
		// n�o adiciona na fila.
		fila.add("Zyra");
		fila.offer("Namis");
		fila.offer("Angelinas");
		fila.offer("Izepon");

		// Peek e Element -> obter o pr�ximo elementos da fila sem remover.
		// A diferen�a � o comportamento quando a fila est� vazia!
		System.out.println(fila.peek()); // peek retorna false se a fila estiver vazia.
		System.out.println(fila.element());// element gerar um erro de exce��o fila estiver vazia.

//		fila.size(); verifica tamanho da fila.
//		fila.clear(); limpa a fila.
//		fila.isEmpty(); verifica se a fila est� vazia.
//		fila.contains(...); verifica se cont�m na fila.

		// Peek e Element -> obter o pr�ximo elementos da fila mas remove da fila.
		// A diferen�a � o comportamento quando a fila est� vazia!
		System.out.println(fila.poll()); // retorna false se a fila estiver vazia.
		System.out.println(fila.remove()); // gerar um erro de exce��o fila estiver vazia.

	}

}
