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
		return this.nomeDietista;
	}

	public String getDiaDieta() {
		return this.diaDieta;
	}

	public String getPeso() {
		return this.peso;
	}

}
