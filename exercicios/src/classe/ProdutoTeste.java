package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		// Esse produto � gerado pelo construtor definido:
		Produto p1 = new Produto("Notebook", 4356.89);

		// Esse produto � gerado pelo construtor padr�o:
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;

		Produto.desconto = 0.50;

		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("M�dia do carrinho = R$%.2f.", mediaCarrinho);

	}
}
