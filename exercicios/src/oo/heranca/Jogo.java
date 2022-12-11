package oo.heranca;

public class Jogo {

	public static void main(String[] args) {

		Monstro m1 = new Monstro();
		m1.x = 10;
		m1.y = 10;

		Heroi h2 = new Heroi(10, 11);

		System.out.println("Monstro vida: " + m1.lifeBar);
		System.out.println("Her�i vida: " + h2.lifeBar + "\n");

		m1.atacar(h2);
		h2.atacar(m1);

		System.out.println("Her�i atacou monstro, o dano foi: " + h2.danoBase + " \nA vida atual do monstro �: "
				+ m1.lifeBar + "\n");
		System.out.println(
				"Monstro atacou her�i, o dano foi: " + m1.danoBase + " \nA vida atual do her�i �: " + h2.lifeBar);
	}
}
