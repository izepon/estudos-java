package oo.encapsulamento.casaA;

public class Ana {

	@SuppressWarnings("unused")
	private String segredo = "Segredo 1"; // privado só visivel na classe.
	String facoDentroDeCasa = "..."; // Default ou Package.
	protected String formaDeFalar = "----"; // protected é visivel no package e transmitido por herança.
	public String todosSabem = "......."; // publico é visivel para todos.
}
