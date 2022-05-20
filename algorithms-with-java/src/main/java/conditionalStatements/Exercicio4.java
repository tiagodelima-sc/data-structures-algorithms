package conditionalStatements;

import java.util.Scanner;

/*
 * As macas custam 0,30cents cada se forem compradas menos do que uma duzia.
 * Fica 0,25cent se forem compradas pelo menos doze.
 * Escreva o valor total da compra
 * */

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		int quantidade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantas macas vc quer comprar?");
		quantidade = ler.nextInt();
		
		if(quantidade >= 12) {
			double valorTotal;
			valorTotal = quantidade * 0.25;
			System.out.println("Voce comprou: " + quantidade + " macas. O valor total foi de: " + valorTotal);
		} else {
			double valorTotal;
			valorTotal = quantidade * 0.30;
			System.out.println("Voce comprou: " + quantidade + " macas. O valor total foi de: " + valorTotal);
		}

		ler.close();
	}

}
