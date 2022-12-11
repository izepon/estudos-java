package classe;

public class PrimeiroTraumaExercicio {

	int a = 3;
	static int b = 5; // outro meio de pegar o valor de b

	public static void main(String[] args) {

		PrimeiroTraumaExercicio p = new PrimeiroTraumaExercicio(); // cria uma instancia para receber
		// valor de a

		System.out.println(p.a);// p recebe a que está na instancia e pode acessar com notação .

		System.out.println(b);// exibi valor de b, algo static pode acessar outro static

	}

}
