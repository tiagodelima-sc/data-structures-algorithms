package ifAndElse;

import java.util.Scanner;

/* Fa�a um Programa que pe�a um n�mero inteiro e determine se ele 
 * e par ou �mpar. Dica: utilize o operador m�dulo (resto da divis�o).  */

public class Exercicio16 {
	
	public static void main(String[] args) {
		
		
		double divisao;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		divisao = ler.nextInt();
		
		divisao = divisao % 2; 
		
		if(divisao == 1) {
			System.out.println("Impar");
		} else {
			System.out.println("Par");
		}
		
	}

}
