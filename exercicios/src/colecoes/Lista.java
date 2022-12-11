package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Izepon");
		lista.add(u1);

		lista.add(new Usuario("Jean"));
		lista.add(new Usuario("Lina"));
		lista.add(new Usuario("Zyra"));
		lista.add(new Usuario("Namis"));

		System.out.println(lista.get(3)); // acessa pelo indice

		System.out.println("\n>>>>>> " + lista.remove(2)); // remove pelo indice
		System.out.println(">>>>>> Um usuário foi removido? " + lista.remove(new Usuario("Izepon")));

		System.out.println(">>>>>> Tem o nome Zyra? " + lista.contains(new Usuario("Zyra")));

		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
	}

}
