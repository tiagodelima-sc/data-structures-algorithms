package conditionalStatements;

import java.util.Scanner;

/*
 * Tendo como entra a altura e o sexo
 * codificando da seguinte forma: 1 feminino 2:masculino) de uma pessoa
 * construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes formulas
 * para	homens:	(72.7  Altura) – 58
 * para	mulheres: (62.1 * Altura) – 44.7
 * */

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		int sexo;
		double altura;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe sua altura");
		altura = ler.nextDouble();
		
		System.out.println("Escolha seu sexo: 1) Para homem 2) Para mulher");
		sexo = ler.nextInt();
		
		if(sexo == 1) {
			double resultadoTotal;
			resultadoTotal = (72.7 * altura) - 58;
			System.out.println("\nSua altura: " + altura +"\nSeu sexo: Masculino" + "\nSeu peso ideal como homem: " + resultadoTotal);
			
		} else if(sexo == 2) {
			double resultadoTotal;
			resultadoTotal = (62.1 * altura) - 44.7;
			System.out.println("\nSua altura: " + altura +"\nSeu sexo: Feminino" + "\nSeu peso ideal como mulher: " + resultadoTotal);
			
		} else {
			System.out.println("Digite um numero valido");
		}
		
		ler.close();
	}

}
