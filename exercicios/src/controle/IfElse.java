package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe o n�mero: ");
		int numero = Integer.parseInt(valor);

		// Verifica��o de n�mero par ou �mpar sem Else:

		if (numero % 2 == 0) {
			System.out.println("N�mero � par!");
		}

		if (numero % 2 == 1) {
			System.out.println("N�mero � �mpar!");
		}

		// Utilizando If e Else:

		if (numero % 2 == 0) {
			System.out.println("O n�mero � par!");
		} else {
			System.out.println("O n�mero � �mpar!");
		}
	}
}
