package poo;

public class Vizualizacao {
	
	private Aluno espectador;
	private Video filme;
	
	public Vizualizacao(Aluno espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setAssistindo(this.espectador.getAssistindo() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}
	
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	public void avaliar(float porc) {
		
		int total = 0;
		if(porc <= 20) {
			total = 3;
		} else if (porc <= 50  ) {
			total = 5;
		} else if (porc <= 90) {
			total = 8;
		} else {
			total = 10;
		}
		
		this.filme.setAvaliacao(total);
	}

	public Aluno getEspectador() {
		return espectador;
	}

	public void setEspectador(Aluno espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Vizualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
	

}
