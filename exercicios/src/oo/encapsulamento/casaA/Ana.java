package oo.encapsulamento.casaA;

public class Ana {

	@SuppressWarnings("unused")
	private String segredo = "Segredo 1"; // privado s� visivel na classe.
	String facoDentroDeCasa = "..."; // Default ou Package.
	protected String formaDeFalar = "----"; // protected � visivel no package e transmitido por heran�a.
	public String todosSabem = "......."; // publico � visivel para todos.
}
