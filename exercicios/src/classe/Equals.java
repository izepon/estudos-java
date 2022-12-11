package classe;

import java.util.Date;

public class Equals {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Jean Izepon";
		u1.email = "email@email.com.br";

		Usuario u2 = new Usuario();
		u2.nome = "Jean Izepon";
		u2.email = "email@email.com.br";

		System.out.println(u1 == u2); // false
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));

		System.out.println(u2.equals(new Date()));
	}

}
