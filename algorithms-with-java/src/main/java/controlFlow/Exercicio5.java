package controlFlow;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		String nome;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu nome ou S para sair");
		nome = ler.nextLine();
		
		while(!nome.equals("S")) {
			System.out.println("Bem vindo ao sistema");
			System.out.println("Digite seu nome ou S para sair");
			nome = ler.nextLine();
		}
		
	}

}
