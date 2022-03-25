package aula04.lista01.exercicio02.factory;

import aula04.lista01.exercicio02.AbstractPart;
import aula04.lista01.exercicio02.pecas.Bateria;
import aula04.lista01.exercicio02.pecas.Camera;
import aula04.lista01.exercicio02.pecas.Gps;
import aula04.lista01.exercicio02.pecas.Visor;

public class NokiaFactory implements FactoryInterface {

	private static final String MARCA = "Nokia";
	
	@Override
	public AbstractPart createParte(ParteCelularEnum tipoParte) {
		
		
		switch (tipoParte) {
			case BATERIA:
				return new Bateria(MARCA);
			case CAMERA:
				return new Camera(MARCA);
			case GPS:
				return new Gps(MARCA);
			case VISOR:
				return new Visor(MARCA);
			default:
				return null;
		}
	}

}
