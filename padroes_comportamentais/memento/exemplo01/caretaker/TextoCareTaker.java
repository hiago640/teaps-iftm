package memento.exemplo01.caretaker;

import java.util.ArrayList;

import memento.exemplo01.memento.TextoMemento;

public class TextoCareTaker {
	protected ArrayList<TextoMemento> estados;
	
	public TextoCareTaker() {
		estados = new ArrayList<TextoMemento>();
	}
	
	public void adicionarMemento(TextoMemento memento) {
		estados.add(memento);
	}
	
	public TextoMemento getUltimoEstadoSalvo() {
		if(estados.size() <= 0)
			return new TextoMemento("");
		
		TextoMemento estadoSalvo = estados.get(estados.size() - 1);
		estados.remove(estados.size() - 1);
		
		return estadoSalvo;
	}
}
