package aula04.lista01.exercicio02.factory;

import aula04.lista01.exercicio02.AbstractPart;

public interface FactoryInterface {
	
	public AbstractPart createParte(ParteCelularEnum tipoParte);
}
