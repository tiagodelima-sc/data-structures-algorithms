package threads.exercicio4;

import java.time.LocalDateTime;
import java.util.Random;

public class Exercicio4 extends Thread {

	public void Matriz() {

		Exercicio4 MatrizSolver = new Exercicio4();
		
		int TAM = MatrizSolver.GetRandomNumber();
		int Matriz[][] = new int[TAM][TAM];
		int ValueGE;

		System.out.println("Tamanho da Matriz:\n" + TAM + " x " + TAM);

		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {

				ValueGE = MatrizSolver.GetRandomNumber();

				Matriz[i][j] = ValueGE;

				System.out.print(Matriz[i][j] + " ");

			}
			System.out.println();
		}

		for (int i = 0; i < TAM; i++) {
			int soma = 0;

			for (int j = 0; j < TAM; j++) {

				soma += Matriz[i][j];

			}
			System.out.print(soma + "\n");
		}
	}

	public boolean Thread(Runnable Matriz) {
		try {
			Thread Thread0 = new Thread(Matriz);

			Thread0.start();

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public int GetRandomNumber() {
		
		int max = 5, min = 3;
		Random random = new Random();

		int RandoNumber = random.nextInt((max - min) + 1) + min;

		return RandoNumber;
	}

	public static void main(String[] args) {
		
		Exercicio4 MatrizSolverT = new Exercicio4();
		MatrizSolverT.Thread(MatrizSolverT::Matriz);
	}

}
