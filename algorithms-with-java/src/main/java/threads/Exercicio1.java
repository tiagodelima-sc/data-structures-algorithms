package threads;

/*Entendendo o funcionamento da thread*/

public class Exercicio1 {
		
	public static void main(String[] args) {
		
		new Thread(t1).start();
		new Thread(t2).start();
	}
	  
	private static Runnable t1 = new Runnable() {
		
		public void run() {
			for(int i=0; i < 10; i++) {
				System.out.println("Thread 1: " + i);
			}
		}
	};
	
	private static Runnable t2 = new Runnable() {
		
		public void run() {
			for(int j=0; j < 10; j++) {
				System.out.println("Thread 2: " + j);
			}
		}
	};

}
