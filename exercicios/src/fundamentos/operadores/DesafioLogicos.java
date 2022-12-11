package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		//Se os dois trabalhos derem certo compra TV50"
		//Se apenas um dois trabalho der certo, compra TV32"
		//Se comprar qualquer TV vão tomar sorvete
		//Se nenhum trabalho der certo, não compra nenhuma TV e sorvete
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;		
	
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		boolean nenhumTrabalho = !sorvete;		
		
		System.out.println("Vai comprar a TV50? " + tv50);
		System.out.println("Vai comprar a TV32\" ? " + tv32);
		System.out.println("Compraram uma TV e vão tomar sorvete? " + sorvete);
		System.out.println("Não comprou sorvete? " + nenhumTrabalho);
		
		
	}
}
