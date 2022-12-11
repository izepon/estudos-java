package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		// if(boolean) ...
		// while(boolean) ...
		// for(...; boolean; ...) ...

		// Switch é diferente, ele não recebe um verdadeiro ou falso, recebe direto o
		// valor.

		String faixa = "preta";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei Tekki Shodan");
		case "roxa":
			System.out.println("Sei Heian Godan");
		case "verde":
			System.out.println("Sei Heian Yodan");
		case "laranja":
			System.out.println("Sei Heian Sandan");
		case "vermelha":
			System.out.println("Sei Heian Nidan");
		case "amarela":
			System.out.println("Sei Heian Shodan");
			break;
		default:
			System.out.println("Não sei lutar :( ");
		}

		System.out.println("Fim!");

		int idade = 3;

		switch (idade) {
		case 3:
			System.out.println("\nSabe falar");
		case 2:
			System.out.println("Sabe andar");
		case 1:
			System.out.println("Sabe reconhecer rosto e voz");
		case 0:
			System.out.println("Está crescendo e aprendendo todos os dias.");

		}
	}
}
