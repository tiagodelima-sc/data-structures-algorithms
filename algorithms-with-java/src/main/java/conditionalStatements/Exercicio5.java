package conditionalStatements;

import java.util.Scanner;

/*
 * Escreva um programa para ler 3 valores inteiros 
 * (considere que nao serao lidos valores iguais)
 * e escrevelos em ordem crescente.
 * */

public class Exercicio5 {
	
	public static void main(String[] args) {
	
		int valor1 = 0;
		int valor2 = 0;
		int valor3 = 0;
		
		Scanner ler = new Scanner(System.in);	
		
		System.out.println("Digite o primeiro valor");
		valor1 = ler.nextInt();
		System.out.println("Digite o segundo valor");
		valor2 = ler.nextInt();
		System.out.println("Digite o terceiro valor");
		valor3 = ler.nextInt();
		
		if(valor1 > valor2) {
			if(valor2 > valor3) {
				System.out.println(valor1);
				System.out.println(valor2);
				System.out.println(valor3);
			} else {
				System.out.println(valor1);
				System.out.println(valor3);
				System.out.println(valor2);
			}
		} else if(valor2 > valor1 && valor2 > valor3) {
			if(valor1 > valor3) {
				System.out.println(valor2);
				System.out.println(valor1);
				System.out.println(valor3);
			}
			else {
				System.out.println(valor2);
				System.out.println(valor3);
				System.out.println(valor1);
			}
			
		} else if(valor3 > valor1 && valor3 > valor2) {
			if(valor1 > valor2) {
				System.out.println(valor3);
				System.out.println(valor1);
				System.out.println(valor2);
			}
			else {
				System.out.println(valor3);
				System.out.println(valor2);
				System.out.println(valor1);
			}
		} else {
			System.out.println("Existem numeros iguais, tente denovo");
		}

		ler.close();
	}

}
