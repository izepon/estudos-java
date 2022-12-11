package classe;

public class DesafioData {

	int dia;
	int mes;
	int ano;

	DesafioData() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970); // this como construtor
	}

	DesafioData(int dia, int mes, int ano) {
		this.dia = dia; // this como parametro
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() {
		String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
