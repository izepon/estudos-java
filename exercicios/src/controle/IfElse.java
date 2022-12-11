package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe o número: ");
		int numero = Integer.parseInt(valor);

		// Verificação de número par ou ímpar sem Else:

		if (numero % 2 == 0) {
			System.out.println("Número é par!");
		}

		if (numero % 2 == 1) {
			System.out.println("Número é ímpar!");
		}

		// Utilizando If e Else:

		if (numero % 2 == 0) {
			System.out.println("O número é par!");
		} else {
			System.out.println("O número é ímpar!");
		}
	}
}
