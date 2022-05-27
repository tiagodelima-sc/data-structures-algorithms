package threads.exercicio6;

import java.util.concurrent.Semaphore;

public class Exercicio6 {
	
	public static void main(String[] args) 
	{
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for (int Pessoa = 0 ; Pessoa <4 ; Pessoa++) {
			Thread tPessoa = new PessoaThread(Pessoa, semaforo);
			tPessoa.start();
		}
	}

}
