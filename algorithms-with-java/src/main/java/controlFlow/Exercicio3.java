package controlFlow;

import java.util.Scanner;

/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
 * Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
 * Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" 
 * e o algoritmo encerrado. 
 * Considere que a senha correta é o valor 2002.
*/

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int senhaValida = 0;
		
		System.out.println("\nDigite a senha para acessar nosso sistema");
		senhaValida = ler.nextInt();
		
		while(senhaValida != 2002) {
			
			System.out.println("\nSenha Invalida!");
			System.out.println("\nDigite a senha novamente: ");
			senhaValida = ler.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		ler.close();
	}

}
