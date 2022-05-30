package exceptions;

import java.io.IOException;

public class Exercicio01 implements Runnable {
	

	// o lan�amento de uma exce��o espec�fica para um thread n�o impacta a execu��o de uma sendo executada em paralelo
	public static void main(String[] args) throws IOException{
		
		Thread thrd = new Thread(new Exercicio01());
		thrd.start();
		
		try {
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//lan�a exce��o checked n�o capturada
		throw new IOException("Oops");
		
		
	}

	@Override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Alive");
		}
		
	}

}
