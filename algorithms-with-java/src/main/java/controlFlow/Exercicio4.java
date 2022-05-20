package controlFlow;

import java.util.Scanner;

/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada 
 * de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. 
 * O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA 
 * (nesta situação sem escrever mensagem alguma).
 * */

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\nDigite a coordenada X: ");
		x = ler.nextInt();
		System.out.println("\nDigite a coordenada Y: ");
		y = ler.nextInt();
		
		while(x != 0 && y != 0) {
			
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if(x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			
			else {
				System.out.println("quarto");
			}
			
			System.out.println("\nDigite a coordenada X: ");
			x = ler.nextInt();
			System.out.println("\nDigite a coordenada Y: ");
			y = ler.nextInt();
			
		}
		
		ler.close();
		
	}

}
