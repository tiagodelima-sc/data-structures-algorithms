package threads.exercicio5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class T1 implements Runnable {

	int ID;

	public T1(int id) {
		this.ID = id;
	}

	@Override
	public void run() {
		try {
			while (true) {

				System.out.println("Thread ID: " + ID + ": executando.");

				Thread.sleep(100);
			}
		} catch (InterruptedException ex) {

			ex.printStackTrace();

		}
	}
}

public class Exercicio5 {

	public static void main(String[] args) {

		System.out.println("Iniciando as threads...");

		ExecutorService executerT1Thread = Executors.newFixedThreadPool(1);
		executerT1Thread.submit(new T1(0));

		Thread mythreads[] = new Thread[5];
		for (int j = 0; j < 5; j++) {
			mythreads[j] = new Thread(new Threads(j));
			mythreads[j].start();
		}

		ExecutorService threadExecutorT1 = Executors.newFixedThreadPool(100);

		for (int j = 0; j < 5; j++) {
			try {

				mythreads[j].join();

			} catch (InterruptedException e) {

				e.printStackTrace();

			}
		}

		threadExecutorT1.shutdown();
		executerT1Thread.shutdown();

	}

}
