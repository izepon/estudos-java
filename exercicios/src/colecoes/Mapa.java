package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Zyra"); // adiciona
		usuarios.put(1, "Namis"); // altera o valor do nome
		usuarios.put(2, "Zyra");
		usuarios.put(3, "Babus");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Zyra"));
		System.out.println(usuarios.get(3));

		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}

		for (String nome : usuarios.values()) {
			System.out.println(nome);
		}

		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}

	}

}
