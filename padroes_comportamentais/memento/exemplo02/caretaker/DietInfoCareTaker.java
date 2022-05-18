package memento.exemplo02.caretaker;

import java.util.ArrayList;

import memento.exemplo02.memento.DietInfoMemento;

public class DietInfoCareTaker {
	protected ArrayList<DietInfoMemento> estados;

	public DietInfoCareTaker() {
		this.estados = new ArrayList<>();
	}

	public void adicionarMemento(DietInfoMemento memento) {
		this.estados.add(memento);
	}

	public DietInfoMemento getUltimoEstadoSalvo() {
		if(estados.isEmpty())
			return new DietInfoMemento("","","");
		
		DietInfoMemento estadoSalvo = estados.get(estados.size() - 1);
		estados.remove(estados.size() - 1);

		return estadoSalvo;
	}
}
