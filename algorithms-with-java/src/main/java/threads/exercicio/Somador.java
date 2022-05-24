package threads.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Somador {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println("Iniciando a criacao do Array: ");
		//Array de numeros inteiros
		int[] numeros = new int[10000];
		
		Random ran = new Random(System.currentTimeMillis());
		
		for(int i=0; i<numeros.length; i++) {
			//limitando em 99
			numeros[i] = Math.abs(ran.nextInt()) % 100;
		}
		
		ExecutorService e = Executors.newCachedThreadPool();
		List<Future<Integer>> futures = new ArrayList<>();
		
		
		System.out.println("Iniciando execucao dos callables: ");

		for(int i=0; i < 100; i++) {
			Future<Integer> resultado =  e.submit(new SomadorCallable(numeros, i * 100, (i + 1) * 100));
			futures.add(resultado);
		}
		
		System.out.println("Callables executados..");

		
		System.out.println("Iniciando a soma:");
		int soma = 0;
		for(int i = 0; i < 100; i++) {
			System.out.println("Pegando a soma de: " + i * 100 + " ate: " + (i+1) * 100);
			Future<Integer> resultado = futures.get(i);
			soma += resultado.get();
		}
		
		System.out.println("Soma = " + soma);
		
		//Terminar toda as threads
		e.shutdown();
		
	}

}
