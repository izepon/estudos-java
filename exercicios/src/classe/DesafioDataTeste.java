package classe;

public class DesafioDataTeste {

	public static void main(String[] args) {

		DesafioData data1 = new DesafioData(12, 01, 1989);

		DesafioData data2 = new DesafioData();
		data2.dia = 9;
		data2.mes = 12;
		data2.ano = 1991;

		DesafioData data3 = new DesafioData();

		var d4 = new DesafioData(01, 12, 2021);

		System.out.printf("Jean nasceu no dia %s.", data1.obterDataFormatada());

		System.out.printf("\nAngelina nasceu no dia %s.", data2.obterDataFormatada());

		System.out.printf("\nData marco Unix %s.", data3.obterDataFormatada());

		System.out.println("\n" + d4.obterDataFormatada());

		data2.imprimirDataFormatada();
	}

}
