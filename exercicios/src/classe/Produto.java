package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	double descontoDoGerente;

	Produto() {
		// Esse é o construtor padrão, não recebe paramêtros.
	}

	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	} // Esse é um construtor com paramêtros definidos.

	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDescontoDoGerente() {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
