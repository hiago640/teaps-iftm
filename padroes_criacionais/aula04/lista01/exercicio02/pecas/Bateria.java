package aula04.lista01.exercicio02.pecas;

import aula04.lista01.exercicio02.AbstractPart;

public class Bateria extends AbstractPart{

	public Bateria(String marca) {
		super(marca);
	}
	
	@Override
	public String toString() {
		return "Bateria " + getMarca();
	}
	
}
