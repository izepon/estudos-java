package oo.heranca;

public class Jogo {

	public static void main(String[] args) {

		Monstro m1 = new Monstro();
		m1.x = 10;
		m1.y = 10;

		Heroi h2 = new Heroi(10, 11);

		System.out.println("Monstro vida: " + m1.lifeBar);
		System.out.println("Herói vida: " + h2.lifeBar + "\n");

		m1.atacar(h2);
		h2.atacar(m1);

		System.out.println("Herói atacou monstro, o dano foi: " + h2.danoBase + " \nA vida atual do monstro é: "
				+ m1.lifeBar + "\n");
		System.out.println(
				"Monstro atacou herói, o dano foi: " + m1.danoBase + " \nA vida atual do herói é: " + h2.lifeBar);
	}
}
