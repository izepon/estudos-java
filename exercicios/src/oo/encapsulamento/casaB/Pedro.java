package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testeAcessos() {
		// segredo
		// facoDentroDeCasa
		// formaDeFalar
		// todosSabem

		// System.out.println(segredo);
		// System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar); // protected - acessivel por heran�a
		System.out.println(todosSabem);// public - acessivel por todos e passa na heran�a

	}
}
