package ifAndElse;

import java.util.Scanner;

/* Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são 
 * do imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato 
 * e que o FGTS corresponde a 11% do salário bruto, mas não é descontado (é a empresa que deposita.)
 * O salário líquido corresponde ao salário bruto menos os descontos 
 * O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
 * a. Desconto do IR;
 * b. Salário Bruto ate R$900,00 (inclusive) – Isento;
 * c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
 * d. Salario bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
 * e. Salário bruto acima de 2500 – Desconto de 20%.
 * 
 * Imprima na tela as informações, dispostas conforme o exemplo abaixo, no exemplo valor da hora é 5 e a quantidade de horas é 220.  
 * Salário bruto (5 * 220)  : R$ 1100,00
 * ( – ) IR (5%)            : R$ 55,00
 * ( – ) INSS ( 10% )       : R$ 110,00
 * FGTS ( 11%)              : R$ 121,00
 * Total de descontos       : R$ 165,00
 * Salário Líquido          : R$ 935,00    
 */

public class Exercicio13 {
	
	public static void main(String[] args) {
		
		double quantidadeHorasTrabalhas;
		double valorHora;
		double salarioBruto;
		String nome;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = ler.nextLine();
		System.out.println("Digite o valor da sua hora: ");
		valorHora = ler.nextDouble();
		System.out.println("Digite quantas horas voce trabalhou nesse mes: ");
		quantidadeHorasTrabalhas = ler.nextDouble();
		
		salarioBruto = quantidadeHorasTrabalhas * valorHora;
		
		if(salarioBruto > 0 && salarioBruto <= 900) {
			
			double inss,fgts,resultadoTotal;
			
			System.out.println("\nSalario Bruto: " + salarioBruto);
			inss = salarioBruto * 0.10;
			System.out.println("\nINSS: " + inss);
			fgts = salarioBruto * 0.11;
			System.out.println("\nFGTS: " + fgts);
			resultadoTotal = salarioBruto - (inss + fgts);
			System.err.println("\n" + nome + " O seu Salario Liquido ficou em: R$" + resultadoTotal);
			
		} else if(salarioBruto > 900 && salarioBruto <= 1500) {
			
			double ir,inss,fgts,resultadoTotal;
			
			System.out.println("Salario Bruto: " + salarioBruto);
			ir =  salarioBruto * 0.05;
			System.out.println("\nIR: " + ir);
			inss = salarioBruto * 0.10;
			System.out.println("\nINSS: " + inss);
			fgts = salarioBruto * 0.11;
			System.out.println("\nFGTS: " + fgts);
			resultadoTotal = salarioBruto - (inss + fgts + ir);
			System.err.println(nome +" O seu Salario Liquido ficou em: R$" + resultadoTotal);
			
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			
			double ir,inss,fgts,resultadoTotal;
			
			System.out.println("Salario Bruto: " + salarioBruto);
			ir =  salarioBruto * 0.10;
			System.out.println("\nIR: " + ir);
			inss = salarioBruto * 0.10;
			System.out.println("\nINSS: " + inss);
			fgts = salarioBruto * 0.11;
			System.out.println("\nFGTS: " + fgts);
			resultadoTotal = salarioBruto - (inss + fgts + ir);
			System.err.println(nome +" O seu Salario Liquido ficou em: R$" + resultadoTotal);
			
		} else if(salarioBruto > 2500) {
			
			double ir,inss,fgts,resultadoTotal;
			
			System.out.println("Salario Bruto: " + salarioBruto);
			ir =  salarioBruto * 0.20;
			System.out.println("\nIR: " + ir);
			inss = salarioBruto * 0.10;
			System.out.println("\nINSS: " + inss);
			fgts = salarioBruto * 0.11;
			System.out.println("\nFGTS: " + fgts);
			resultadoTotal = salarioBruto - (inss + fgts + ir);
			System.err.println(nome +" O seu Salario Liquido ficou em: R$" + resultadoTotal);
			
		}
		
		else {
			System.out.println("Digite um numero valido");
		}
		
	}
}
