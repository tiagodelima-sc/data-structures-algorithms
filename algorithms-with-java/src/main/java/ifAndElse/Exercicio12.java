package ifAndElse;

import java.util.Scanner;

/*
 * As organizações CSM resolveram dar um aumento de salario aos seus colaboradores 
 * e lhe contrataram para desenvolver o programa que calculará os reajustes.  
 * Faça um programa que recebe o salário de um colaborador 
 * e o reajuste segundo o seguinte criterio, baseado no salario atual;
 * Salários até R$ 280,00 (incluindo): aumento de 20%;
 * Salários entre R$ 280,00 e R$700,00: aumento de 15%;
 * Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
 * Salários de R$ 1500,00 em diante: aumento de 5%
 * */

public class Exercicio12 {
	
	public static void main(String[] args) {
		
		String nome;
		double salario;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = ler.nextLine();
		System.out.println("Digite seu salario: ");
		salario = ler.nextDouble();
		
		if(salario > 0 && salario < 280) {
			
			double resultado;
			resultado = salario * 1.20;
			System.out.println(nome + " Seu salario ficou em: R$" + resultado + " depois do reajuste");
	
		} else if(salario > 280 && salario < 700) {
			double resultado;
			resultado = salario * 1.15;
			System.out.println(nome + " Seu salario ficou em: R$" + resultado + " depois do reajuste");
			
		} else if(salario > 700 && salario < 1500) {
			
			double resultado;
			resultado = salario * 1.10;
			System.out.println(nome + " Seu salario ficou em: R$" + resultado + " depois do reajuste");
			
		} else if(salario > 1500) {
			
			double resultado;
			resultado = salario * 1.05;
			System.out.println(nome + " Seu salario ficou em: R$" + resultado + " depois do reajuste");
			
		} else {
			System.out.println("Por favor, digite um salario valido");
		}
		
		
	}

}
