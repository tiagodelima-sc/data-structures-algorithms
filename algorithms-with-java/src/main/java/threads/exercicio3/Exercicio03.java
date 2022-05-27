package threads.exercicio3;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		Thread threadNota = new Thread(thread2);
		threadNota.start();

		/* Mensagem do Fluxo */
		JOptionPane.showMessageDialog(null, "O sistema esta executando para o usuario");

	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			/* Executando em paralelo e segundo plano */
			for (int i = 0; i < 10; i++) {

				System.out.println("Executando a rotina de envio de e-mails: " + i);
				try {
					Thread.sleep(1600);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			

		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			/*Executando em paralelo e segundo plano */
			for (int i = 0; i < 10; i++) {

				System.err.println("ENVIO DE NOTA FISCAL: " + i);
				try {
					Thread.sleep(1600);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	};

}
