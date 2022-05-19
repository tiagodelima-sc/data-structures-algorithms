package ifAndElse;

import java.util.Scanner;

/*
 * Escreva um programa que leia as medidas dos lados de um triangulo
 * e escreva se ele e equiltaero, isoceles ou escaleno. sendo que ****
 * 
 * */

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		int medida1 = 0; 
		int medida2 = 0; 
		int medida3 = 0; 
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro lado do triangulo: ");
		medida1 = ler.nextInt();
		System.out.println("Digite o segundo lado do triangulo: ");
		medida2 = ler.nextInt();
		System.out.println("Digite o terceiro lado do triangulo: ");
		medida3 = ler.nextInt();
		
		if(medida1 + medida2 > medida3 && medida1 + medida3 > medida2 && medida2 + medida3 > medida1) {
			System.out.println("Os 3 lados formam um triangulo");
			if(medida1 == medida2 && medida1 == medida3) {
				System.out.println("EQUILATERO");
			} else {
				if(medida1 == medida2 || medida1 == medida3 || medida2 == medida3) {
					System.out.println("isosceles");
				} else {
					System.out.println("Escaleno");
				}
			}
		} else {
			System.out.println("Os 3 lados nao formam um triangulo");
		}
	}
}
