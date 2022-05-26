package threads.exercicio2;

import java.util.Random;

public class MyThread extends Thread {
	
	private static final long TOTAL_NUMEROS = 1_000_000_000L;
	private final long numerosGerados;
	
	public MyThread(long numerosGerados) {
		this.numerosGerados = numerosGerados;
		System.out.printf("Thread %d criado\n", getId());
	}
	
	public static void main(String[] args) {
		//se nao for iniciado nenhuma thread, por padrao gerar 1 
		final int threads = args.length == 0 ? 1 : Integer.valueOf(args[0]);
		//descobrindo quantos numeros a thread tem que gerar:
		final long numerosPorThread = (TOTAL_NUMEROS / threads);
		System.out.printf("Criando %d threads\n", threads);
		for(int i = 0; i < threads; i++) {
			new MyThread(numerosPorThread).start();
		}
		
	}
	
	@Override
	public void run() {
		System.out.println("\nThread Iniciou: " + Thread.currentThread().getId());
		Random random = new Random();
		//elevar numeros na potencia de 10
		double soma = 0;
		for(int i = 0; i < numerosGerados; i++) {
			soma += Math.pow(random.nextDouble(), 10);
		}
				
	}

}
