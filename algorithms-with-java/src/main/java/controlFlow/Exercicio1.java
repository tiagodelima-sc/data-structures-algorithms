package controlFlow;

import java.util.Scanner;

/*Fa�a um programa que implemente um menu 
 * onde o usur�rio dever� selecionar 1 ou 0. 
 * Caso seja entrado um n�mero diferente
 * o programa dever� solicitar uma nova op��o.*/

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int numero = 0;
		Scanner ler = new Scanner(System.in);
				
		do{
			
			System.out.println("Digite 1 ou 0");
			numero = ler.nextInt();
			
		} while(numero != 0 && numero != 1);
		
		System.out.println("Voce escolheu: " + numero);
	}

}
