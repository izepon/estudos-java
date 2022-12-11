package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> Adicionam elementos na fila
		// A diferença é o comportamento quando a fila está cheia!
		// No caso do Add vai gerar um erro de exceção e o Offer vai retornar false e
		// não adiciona na fila.
		fila.add("Zyra");
		fila.offer("Namis");
		fila.offer("Angelinas");
		fila.offer("Izepon");

		// Peek e Element -> obter o próximo elementos da fila sem remover.
		// A diferença é o comportamento quando a fila está vazia!
		System.out.println(fila.peek()); // peek retorna false se a fila estiver vazia.
		System.out.println(fila.element());// element gerar um erro de exceção fila estiver vazia.

//		fila.size(); verifica tamanho da fila.
//		fila.clear(); limpa a fila.
//		fila.isEmpty(); verifica se a fila está vazia.
//		fila.contains(...); verifica se contém na fila.

		// Peek e Element -> obter o próximo elementos da fila mas remove da fila.
		// A diferença é o comportamento quando a fila está vazia!
		System.out.println(fila.poll()); // retorna false se a fila estiver vazia.
		System.out.println(fila.remove()); // gerar um erro de exceção fila estiver vazia.

	}

}
