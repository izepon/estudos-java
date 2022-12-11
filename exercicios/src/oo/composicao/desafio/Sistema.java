package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.adicionarItem("Petisco", 5, 2.50);
		compra1.adicionarItem(new Produto("Ração", 149.00), 1);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Roupinha", 1, 39.90);
		compra2.adicionarItem(new Produto("Caco Macaco", 19.90), 1);

		Cliente cliente = new Cliente("Zyra Laila");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);

		System.out.println(cliente.obterValorTotal());
	}

}
