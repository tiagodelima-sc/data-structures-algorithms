package ifAndElse;

import java.util.Scanner;

/* Escreva um programa para ler 3 valores
 * inteiros e escrever o maior deles
 */

public class Exercicio9 {
	
	public static void main(String[] args) {

		int valor1;
		int valor2;
		int valor3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = ler.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = ler.nextInt();
		System.out.println("Digite o terceiro valor: ");
		valor3 = ler.nextInt();
		
		if(valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior valor e o: " + valor1);
		} else if(valor2 > valor1 && valor2 > valor3) {
			System.out.println("O maior valor e o: " + valor2);
		} else {
			System.out.println("Maior valor e o: " + valor3);
		}
	}
}
