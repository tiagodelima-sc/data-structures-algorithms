package ifAndElse;

import java.util.Scanner;

/*
 * Escreva um programa para caixas de cinema.
 * Seu programa deve receber a idade do usuario e verificar se ele e estudante
 * Com esses dados, exiba o preco do ingresso conforme a seguinte tabela
 * Estudante ou idoso(Acima de 65 anos) pagam R$15
 * Preco Normal R$30
 * */


public class Exercicio11 {

	public static void main(String[] args) {
		
		int anoNascimento;
		int verificar;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("==== CAIXA CINEMA ====");
		System.out.println("Digite seu ano de nascimento: ");
		anoNascimento = ler.nextInt();
		anoNascimento = 2022 - anoNascimento;
		
		System.out.println("Por favor, selecione o tipo de ingreso: "
				+ "\n1) Meia entrada (Estudante)"
				+ "\n2) Entrada completa (Pessoa normal)");
		verificar = ler.nextInt();
		
		if(verificar == 1) {
			System.out.println("Total do seu ingresso foi de R$15,00");
		} else if(anoNascimento >= 65 && verificar == 2) {
			System.out.println("Total do seu ingresso foi de R$15,00 devido a sua idade");
		} else if(verificar == 2) {
			System.out.println("Total do seu ingresso foi de R$30,00");
		} else {
			System.out.println("Por favor, selecione o tipo correto de ingresso");
		}
		
		
	}
	
	

}
