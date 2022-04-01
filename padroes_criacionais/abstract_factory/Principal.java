package abstract_factory;

import abstract_factory.factory.NokiaFactory;
import abstract_factory.factory.ParteCelularEnum;

public class Principal {
	
	public static void main(String[] args) {
		
		NokiaFactory factory = new NokiaFactory();
		
		System.out.println(factory.createParte(ParteCelularEnum.BATERIA).toString());
		System.out.println(factory.createParte(ParteCelularEnum.VISOR).toString());
	}
	
}
