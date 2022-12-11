package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {

		HashSet<Usuario> usuarios = new HashSet<Usuario>();

		usuarios.add(new Usuario("Zyra"));
		usuarios.add(new Usuario("Namis"));
		usuarios.add(new Usuario("Babus"));

		boolean resultado = usuarios.contains(new Usuario("Zyra"));
		System.out.println(resultado);
	}
}
