package memento.exemplo02.memento;

public class DietInfoMemento {
	protected String nomeDietista;
	protected String diaDieta;
	protected String peso;
	
	public DietInfoMemento (String nomeDietista, String diaDieta, String peso) {
		this.nomeDietista = nomeDietista;
		this.diaDieta = diaDieta;
		this.peso = peso;
	}

	public String getNomeDietista() {
		return nomeDietista;
	}

	public String getDiaDieta() {
		return diaDieta;
	}

	public String getPeso() {
		return peso;
	}

}
