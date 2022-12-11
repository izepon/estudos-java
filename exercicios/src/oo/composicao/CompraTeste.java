package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.cliente = "Zyra Laila";
		compra1.adicionarItem("Petisco", 20, 1.99);
		compra1.adicionarItem("Ração", 1, 149.90);
		compra1.adicionarItem("Caco macaco", 1, 49.90);

		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal());

		// Só para mostrar a relação bidirecional
		double total = compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal();

		System.out.println("O valor total é R$ " + total);
	}

}
