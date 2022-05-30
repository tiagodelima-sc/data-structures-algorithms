package exceptions;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		new Exercicio02();
	}

	public Exercicio02() {
		exceptionsTeste();
	}

	void exceptionsTeste() {

		Object x = new Float("1.0");
		System.out.println((Double) x);
		System.out.println((String) x);

		"".length();

		int[] a = new int[1];
		int length = a.length;

		new ArrayList<>().size();

	}

	public void tryFinally() {

		try {

			System.out.println("Jab ");
			System.exit(0);

		} finally {
			System.out.println("And Roundhouse");

		}
	}

	public void tryWithResources() {

		// em um try-cath normal fecharíamos o sc.close() dentro do finally
		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Number of apples: ");
			int apples = sc.nextInt();

			System.out.print("Number of oranges: ");
			int oranges = sc.nextInt();

			System.out.println("Apples:" + apples + " Oranges: " + oranges);

		} catch (InputMismatchException ime) {
			ime.printStackTrace();
		}

	}

}
