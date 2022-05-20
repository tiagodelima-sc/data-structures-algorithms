package conditionalStatements;

import java.util.Scanner;

/*
 * Escreva um programa para ler o numero de lados de um poligono
 * regular, e a medida do lado(em cm).
 * calcular e imprimir o seguinte:
 * Se o	número de lados	for	igual a	3 escrever TRIANGULO e o valor da area
 * Se o	número de lados	for	igual a	4 escrever QUADRADO e o	valor da sua area.	
 * Se o	número de lados for	igual a 5 escrever PENTAGONO.
 * */

public class Exercicio7 {
	
	public static void main(String[] args) {

		int medida = 0;
		int quantidadeLados = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva quantos lados tem seu poligono regular");
		quantidadeLados = ler.nextInt();
		
		System.out.println("Escreva a medida em cm dos lados do poligono");
		medida = ler.nextInt();
		
		if(quantidadeLados == 3){
			System.out.println("=== TRIANGULO ===");
			double resultado;
			resultado = (medida * medida * 1.732) / 4;
			System.out.println("Area total do triangulo: " + resultado + "CM");
		} else if(quantidadeLados == 4) {
			double resultado;
			System.out.println("=== QUADRADO ===");
			resultado = (medida * medida);
			System.out.println("Area total do quadrado: " + resultado + "CM");
		} else if(quantidadeLados == 5) {
			System.out.println("=== PENTAGONO ===");
			double resultado;
			resultado = (1.72 * medida * medida);
			System.out.println("Area total do pentagono: " + resultado + "CM");
		} else if(quantidadeLados < 3){
			System.out.println("NAO E UM POLIGONO");
		} else {
			System.out.println("POLIGONO NAO INDENTIFICADO");

		}

		ler.close();
	}

}
