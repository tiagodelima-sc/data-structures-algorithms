package poo;

public class Aluno extends Pessoa {
	
	private String login;
	private int Assistindo;
	
	public Aluno(String nome, String sexo, int idade, String login) {
		super(nome, sexo, idade);
		this.login = login;
		this.Assistindo = 0;

	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getAssistindo() {
		return Assistindo;
	}
	public void setAssistindo(int assistindo) {
		Assistindo = assistindo;
	}
	
	

}
