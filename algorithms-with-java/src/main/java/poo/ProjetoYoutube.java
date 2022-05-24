package poo;

public class ProjetoYoutube {
	
	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula de HTML");
		v[1] = new Video("Aula de CSS");
		v[2] = new Video("Aula de Java");
		
		Aluno aluno[] = new Aluno[2];
		aluno[0] = new Aluno("Tiago", "M", 22, "tiaguin");
		aluno[1] = new Aluno("Pedro", "Masculino", 20, "pedroka007");
		
		System.out.println(aluno[0].toString());

		
	}

}
