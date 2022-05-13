package memento.exemplo01.originator;

import memento.exemplo01.caretaker.TextoCareTaker;
import memento.exemplo01.memento.TextoMemento;

public class Texto {
	
	protected String texto;
	TextoCareTaker careTaker;
	
	public Texto() {
		careTaker = new TextoCareTaker();
		texto = new String();
	}
	
	public void escreverTexto(String novoTexto) {
		careTaker.adicionarMemento(new TextoMemento(novoTexto));
		texto += novoTexto;
	}
	
	public void desfazerEscrita() {
		texto = careTaker.getUltimoEstadoSalvo().getTextoSalvo();
	}
	
	public void mostrarTexto() {
		System.out.println(texto);
	}
}
