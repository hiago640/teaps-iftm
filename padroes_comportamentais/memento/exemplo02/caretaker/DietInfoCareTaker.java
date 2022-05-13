package memento.exemplo02.caretaker;

import java.util.ArrayList;

import memento.exemplo02.memento.DietInfoMemento;

public class DietInfoCareTaker {
	protected ArrayList<DietInfoMemento> estados;

	public DietInfoCareTaker() {
		estados = new ArrayList<DietInfoMemento>();
	}

	public void adicionarMemento(DietInfoMemento memento) {
		estados.add(memento);
	}

	public DietInfoMemento getUltimoEstadoSalvo() {

		DietInfoMemento estadoSalvo = estados.get(estados.size() - 1);
		estados.remove(estados.size() - 1);

		return estadoSalvo;
	}
}
