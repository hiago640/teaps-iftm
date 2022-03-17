package aula04.lista01.exercicio02;

import aula04.lista01.exercicio02.factory.NokiaFactory;
import aula04.lista01.exercicio02.factory.ParteCelularEnum;

public class Principal {
	
	public static void main(String[] args) {
		
		NokiaFactory factory = new NokiaFactory();
		
		System.out.println(factory.createParte(ParteCelularEnum.BATERIA).toString());
		System.out.println(factory.createParte(ParteCelularEnum.VISOR).toString());
	}
	
}
