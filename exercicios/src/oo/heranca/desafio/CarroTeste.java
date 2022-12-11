package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Civic();

		c1.acelerar();
		c1.acelerar();
		System.out.println("Honda Civic está acelerando, velocidade atual é: " + c1);

		Carro f1 = new Ferrari(400);

		f1.acelerar();
		f1.frear();
		System.out.println("\nFerrari está acelerando, velocidade atual é: " + f1);

		f1.acelerar();
		f1.frear();
		System.out.println("Ferrari está freando, velocidade atual é: " + f1);

		f1.acelerar();
		System.out.println("Ferrari está acelerando, velocidade atual é: " + f1);
	}
}
