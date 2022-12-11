package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Interger
		conjunto.add('x'); // char -> Caractere

		System.out.println("Tamanho do conjunto é: " + conjunto.size());
		System.out.println("Foi removido algo do conjunto: " + conjunto.remove('x'));
		System.out.println(conjunto.contains("Teste"));

		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

		conjunto.addAll(nums); // uniao dos conjuntos
		System.out.println(conjunto);

		conjunto.clear();
		System.out.println(conjunto);
	}

}
