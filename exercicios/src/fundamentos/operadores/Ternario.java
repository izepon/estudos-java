package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recupera��o.";
		
		System.out.println("O aluno est� " + resultadoFinal);
		
//		double nota = media;
		boolean bomComportamento = false;
		boolean passouPorMedia = media >= 7.0;
		boolean descontoMensalidade = bomComportamento && passouPorMedia;
		String resultado = descontoMensalidade ? "Sim." : "N�o.";
		
		System.out.println("Tem desconto na mensalidade? " + resultado);
		
	}
}
