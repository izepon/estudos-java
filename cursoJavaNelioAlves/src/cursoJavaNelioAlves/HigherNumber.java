package cursoJavaNelioAlves;

import java.util.Scanner;

public class HigherNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);

		showResults(higher);

		sc.close();
	}

	public static int max(int numberOne, int numberTwo, int numberThree) {
		int number;

		if (numberOne > numberTwo && numberOne > numberThree) {
			number = numberOne;
		} else if (numberTwo > numberThree) {
			number = numberTwo;
		} else {
			number = numberThree;
		}

		return number;
	}

	public static void showResults(int value) {
		System.out.println("Higher = " + value);
	}
}
