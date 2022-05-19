package ifAndElse;

import java.util.Scanner;

/*
 * Escreva um programa que verifique a validade de uma senha fornecida 
 * pelo usuario. a senha valida deve ser o numero 1234.
 * devem ser impressas as seguintes mensagens: ACESSO PERMITIDO(senha correta)
 * e ACESSO NEGADO(senha errada)
 * */

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		int resultado;
		int senha = 1234;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a senha do sistema: ");
		resultado = ler.nextInt();
		
		if(resultado == senha) {
			System.out.println("Acesso Permitido");
		} else {
			System.out.println("Acesso Negado");
		}
		
	}

}
