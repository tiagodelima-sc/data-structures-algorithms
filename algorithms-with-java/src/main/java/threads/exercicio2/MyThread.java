package threads.exercicio2;

import java.util.Random;

public class MyThread {
	
	private static final long TOTAL_NUMEROS = 1_000_000_000L;
	
	public static void main(String[] args) {
		
		new MyThread().run();
		
	}
	
	public void run() {
		System.out.println("Iniciando processo de criacao dos numeros: ");
		//armazenar a hr de quando iniciou
		final double comecou = System.currentTimeMillis();
		Random random = new Random();
		//elevar numeros na potencia de 10
		double soma = 0;
		for(int i = 0; i < TOTAL_NUMEROS; i++) {
			soma += Math.pow(random.nextDouble(), 10);
		}
		
		final double tempoGasto = (System.currentTimeMillis() - comecou) / 1000.0;
		System.out.printf("Finalizando em %.2f segundos\n", tempoGasto);
	}

}
