package conditionalStatements;

import java.util.Scanner;

/*Um posto está vendendo combustíveis com a seguinte tabela de descontos:   
 * Álcool:
 * Até 20 litros: desconto de 3% por litro
 * Acima de 20 litros: Desconto de 5% por litro 99.
 * 
 * Gasolina:
 * Até 20 litros: desconto de 4% por litro
 * Acima de 20 litros, desconto de 6% por litro
 * Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível 
 * (codificado da seguinte forma: A-álcool. G-gasolina), 
 * calcule e imprima o valor a ser pago pelo cliente.  */

public class Exercicio15 {
	
	public static void main(String[] args) {
		
		int selecione = 0;
		int quantidadeLitros = 0;
		double resultado = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Selecione o tipo de combustivel: "
				+ "\n1) Alcool"
				+ "\n2) Gasolina");
		selecione = ler.nextInt();
		
		System.out.println("Quantos litros deseja comprar?");
		quantidadeLitros = ler.nextInt();
		
		if(selecione == 1 && quantidadeLitros > 0 && quantidadeLitros <= 20) {
			resultado = quantidadeLitros * 0.3;
			System.out.println("Total de desconto foi de: R$" + resultado);
		} else if(quantidadeLitros > 20) {
			resultado = quantidadeLitros * 0.5;
			System.out.println("Total de desconto foi de: R$" + resultado);
		} else if (selecione == 2 && quantidadeLitros > 0 && quantidadeLitros <= 20) {
			resultado = quantidadeLitros * 0.4;
			System.out.println("Total de desconto foi de: R$" + resultado);
		} else {
			resultado = quantidadeLitros * 0.6;
			System.out.println("Total de desconto foi de: R$" + resultado);
		}

		ler.close();
	}

}
