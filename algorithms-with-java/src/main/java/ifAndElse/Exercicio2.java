package ifAndElse;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		/*
		 * Escreva um programa para ler o ano de nascimento de uma pessoa
		 * e escrever uma mensagem dizendo se ela pode ou nao
		 * votar esse ano (nao e necessario considerar o mes que ela nasceu)
		 * */
		
		int anoNascimento = 0;
		int resultado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento");
		anoNascimento = ler.nextInt();
		
		resultado = 2022 - anoNascimento;
		
		if(resultado > 15 && resultado <= 17) {
			System.out.println("Voce pode votar, mas nao e obrigatorio");
		} else if(resultado >= 18) {
			System.out.println("Voce tem que votar, OBRIGATORIO");
		} else {
			System.out.println("Voce nao pode votar");
		}
		
		
	}

}
