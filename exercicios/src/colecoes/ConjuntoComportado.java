package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

//		Set<String> listaAprovados = new HashSet<>(); // nao respeita ordem nos itens.
		SortedSet<String> listaAprovados = new TreeSet<>(); // mostrar conjuntos ordenados.

		listaAprovados.add("Jean");
		listaAprovados.add("Carlos");
		listaAprovados.add("Izepon");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
	}

}
