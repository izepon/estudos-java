package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Civic();

		c1.acelerar();
		c1.acelerar();
		System.out.println("Honda Civic est� acelerando, velocidade atual �: " + c1);

		Carro f1 = new Ferrari(400);

		f1.acelerar();
		f1.frear();
		System.out.println("\nFerrari est� acelerando, velocidade atual �: " + f1);

		f1.acelerar();
		f1.frear();
		System.out.println("Ferrari est� freando, velocidade atual �: " + f1);

		f1.acelerar();
		System.out.println("Ferrari est� acelerando, velocidade atual �: " + f1);
	}
}
