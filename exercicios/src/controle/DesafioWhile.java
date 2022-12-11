package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		//Calcular media de alunos, independente da quantidade;
		//Usu�rio vai digitar as notas v�lidas (>=10 || < 0);
		//Armazenar o valor dessas notas numa vari�vel "total";
		//Outra vari�vel para armazenar quantidade de notas validas.
		//No final gerar m�dia e sair (user digita -1)
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadesDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			System.out.println("Para calcular m�dia digite a nota do aluno (ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			
			if(nota <=10 && nota >=0) {				
				total += nota;
				quantidadesDeNotas++;
			} else if (nota != -1){
				System.out.println("Nota inv�lida!!! :D");
			}			
		}
		
		//Calcular m�dia
		double media = total / quantidadesDeNotas;
		System.out.println("M�dia �: " + media);
		
		entrada.close();
	}
}
