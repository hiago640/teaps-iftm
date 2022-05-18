package memento.exemplo02.originator;

import memento.exemplo02.caretaker.DietInfoCareTaker;
import memento.exemplo02.memento.DietInfoMemento;

public class DietInfo {
	
	protected String nomeDietista;
	protected String diaDieta;
	protected String peso;
	DietInfoCareTaker careTaker;

	public DietInfo() {
		this.nomeDietista = new String();
		this.diaDieta = new String();
		this.peso = new String();
		
		this.careTaker = new DietInfoCareTaker();
	}

	public void setDietInfo(String nomeDietista, String diaDieta, String peso) {
		this.careTaker.adicionarMemento(new DietInfoMemento(nomeDietista, diaDieta, peso));
		this.nomeDietista += nomeDietista + " ";
		this.diaDieta += diaDieta + " ";
		this.peso += peso+ " ";
	}
	
	public void desfazerEscrita() {
		final DietInfoMemento ultimoEstado = careTaker.getUltimoEstadoSalvo();
		
		this.nomeDietista = ultimoEstado.getNomeDietista();
		this.diaDieta = ultimoEstado.getDiaDieta();
		this.peso = ultimoEstado.getPeso();
	}
	
	public void mostrarInfo() {
		System.out.println(this.nomeDietista + " - " + this.diaDieta + " - " + this.peso + "\n");
	}
	
}
