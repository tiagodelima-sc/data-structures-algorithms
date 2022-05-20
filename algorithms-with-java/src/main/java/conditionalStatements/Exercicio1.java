package conditionalStatements;

import java.util.Scanner;

/*Escreva um programa para ler 2 valores 
  (considere que nao serao informados valores iguais) 
  e escrever o maior deles;
*/

public class Exercicio1 {
	
	public static void main(String[] args) {

		int valorA = 0;
		int valorB = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		valorA = ler.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valorB = ler.nextInt();
		
		if(valorA == valorB) {
			System.out.println("Numero Invalido, os valores informados sao iguais");
		} else if(valorA > valorB) {
			System.out.println("O primeiro valor e maior que o segundo");
		} else {
			System.out.println("O segundo valor e maior que o segundo");
		}	
		
		ler.close();
	}

}
