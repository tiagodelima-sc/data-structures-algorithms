package threads.exercicio;

import java.util.concurrent.Callable;

public class SomadorCallable implements Callable<Integer> {
	
	private int[] numeros;
	private int inicio;
	private int fim;
	
	public SomadorCallable(int[] numeros, int inicio, int fim) {
		this.numeros = numeros;
		this.inicio = inicio;
		this.fim = fim;
	}

	public Integer call() throws Exception {
		try {
			int guardarSoma = 0;
			
			for(int i = inicio; i < fim; i++ ) {
				guardarSoma += numeros[i];
			}
			return guardarSoma;
		} finally {
			System.out.println("Thread: " + Thread.currentThread().getId() + " Executado Callable de " + inicio + " ate: " + fim);
		}
	}

}
