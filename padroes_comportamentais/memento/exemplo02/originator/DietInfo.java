package memento.exemplo02.originator;

import memento.exemplo02.caretaker.DietInfoCareTaker;
import memento.exemplo02.memento.DietInfoMemento;

public class DietInfo {
	
	protected String nomeDietista;
	protected String diaDieta;
	protected String peso;
	DietInfoCareTaker careTaker;

	public DietInfo() {
		nomeDietista = new String();
		diaDieta = new String();
		peso = new String();
		
		careTaker = new DietInfoCareTaker();
	}

	public void setDietInfo(String nomeDietista, String diaDieta, String peso) {
		careTaker.adicionarMemento(new DietInfoMemento(nomeDietista, diaDieta, peso));
		nomeDietista += nomeDietista;
		diaDieta += diaDieta;
		peso += peso;
	}
	
	public void desfazerEscrita() {
		nomeDietista = careTaker.getUltimoEstadoSalvo().getNomeDietista();
		diaDieta = careTaker.getUltimoEstadoSalvo().getDiaDieta();
		peso = careTaker.getUltimoEstadoSalvo().getPeso();
	}

	private void mostrarNomeDietista() {
		System.out.println(nomeDietista);
	}
	
	private void mostrarDiaDieta() {
		System.out.println(diaDieta);
	}
	
	private void mostrarPeso() {
		System.out.println(peso);
	}
	
	public void mostrarInfo() {
		mostrarNomeDietista();
		mostrarDiaDieta();
		mostrarPeso();
	}
	
}
