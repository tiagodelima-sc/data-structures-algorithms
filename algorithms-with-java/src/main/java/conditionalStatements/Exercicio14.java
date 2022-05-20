package conditionalStatements;

import java.util.Scanner;

/* Faça um programa que lê as duas notas parciais obtidas por um aluno 
 * numa disciplina ao longo de um semestre, e calcule a sua média. 
 * A atribuição de conceitos obedece à tabela abaixo:*/

public class Exercicio14 {
	
	public static void main(String[] args) {
		
		double notaA;
		double notaB;
		double resultado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		notaA = ler.nextDouble();
		System.out.println("Digite a segunda nota");
		notaB = ler.nextDouble();
		
		resultado = (notaA + notaB) / 2;
		
		if(resultado >= 9.0 && resultado <= 10.0) {
			System.out.println("Conceito: A");
			System.out.println("APROVADO!");
		} else if(resultado >= 7.5  && resultado < 9.0) {
			System.out.println("Conceito: B");
			System.out.println("APROVADO!");
		} else if(resultado >= 6.0 && resultado < 7.5) {
			System.out.println("Conceito: C");
			System.out.println("APROVADO!");
		} else if(resultado >= 4.0 && resultado < 6.0) {
			System.out.println("Conceito: D");
			System.out.println("REPROVADO!");

		} else {
			System.out.println("Conceito: E");
			System.out.println("REPROVADO!");
		}

		ler.close();
	}

}
