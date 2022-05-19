package ifAndElse;

import java.util.Scanner;

/* Faça um Programa que peça um número inteiro e determine se ele 
 * e par ou ímpar. Dica: utilize o operador módulo (resto da divisão).  */

public class Exercicio16 {
	
	public static void main(String[] args) {
		
		
		double divisao;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		divisao = ler.nextInt();
		
		divisao = divisao % 2; 
		
		if(divisao == 1) {
			System.out.println("Impar");
		} else {
			System.out.println("Par");
		}
		
	}

}
