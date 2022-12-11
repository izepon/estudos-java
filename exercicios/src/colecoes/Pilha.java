package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();

		livros.add("O Soldado Azul"); // adiciona na pilha, valor booleando true ou false
		livros.push("Clean Code"); // adiciona na pilha e caso de erro retorno uma exceção
		livros.push("O Hobbit");

		System.out.println(livros.peek());
		System.out.println(livros.element());

		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.pop());

	}
}
