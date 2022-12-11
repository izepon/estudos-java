package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	double descontoDoGerente;

	Produto() {
		// Esse � o construtor padr�o, n�o recebe param�tros.
	}

	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	} // Esse � um construtor com param�tros definidos.

	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDescontoDoGerente() {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
