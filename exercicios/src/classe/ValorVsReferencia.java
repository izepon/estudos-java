package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {

		double a = 2;
		double b = a; // atribuição por valor pq estamos trabalhando com tipo primitivo, uma cópia do
						// valor definido na memória.

		a++; // valor de a era 2, acrescentou 1 fica 3
		b--; // valor de b era 2, retirou 1 ficou 1.

		System.out.println("Valor de A é: " + a + "\nValor de B é: " + b);

		DesafioData d1 = new DesafioData(26, 11, 2021);
		DesafioData d2 = d1; // atribuição por referência pq estamos trabalhando com Objeto.

		d1.dia = 31;
		d2.mes = 12;

		d1.ano = 2022;

		System.out.println(d1.obterDataFormatada()); // d1 vai ter a data 31/12/2022
		System.out.println(d2.obterDataFormatada()); // d2 vai ter a mesma data de d1 pois alteração
		// acima mudou o objeto de referencia.

		voltarDataParaValorPadrao(d1);

		System.out.println(d1.obterDataFormatada()); // d1 vai ter a data 31/12/2022
		System.out.println(d2.obterDataFormatada()); // d2 vai ter a mesma data de d1 pois alteração
		// acima mudou o objeto de referencia.

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);

	}

	static void voltarDataParaValorPadrao(DesafioData d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	static void alterarPrimitivo(int a) {
		a++;
	}

}
