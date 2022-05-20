package controlFlow;

import java.util.Scanner;

/* Fazer um programa que le numeros inteiros
 * ate que um zero seja lido.
 * Ao final mostra a soma dos numeros lidos
 * */

public class Exercicio2 {
	
	public static void main(String[] args) {
	
		int soma = 0;
		int numeroInteiro = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		numeroInteiro = ler.nextInt();
		
		while(numeroInteiro != 0) {
			
			soma = soma + numeroInteiro;
			System.out.println("Digite um numero inteiro: ");
			numeroInteiro = ler.nextInt();
		}
		
		System.out.println("Total da soma foi: " + soma);
		ler.close();
	}

}
