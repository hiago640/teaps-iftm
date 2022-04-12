package abstract_factory.exemplo02;

import abstract_factory.exemplo02.factory.CelularFactory;
import abstract_factory.exemplo02.factory.NokiaFactory;
import abstract_factory.exemplo02.products.Bateria;
import abstract_factory.exemplo02.products.Camera;
import abstract_factory.exemplo02.products.GPS;
import abstract_factory.exemplo02.products.Visor;

public class Cliente {
	
	public static void main(String[] args) {
		CelularFactory factory = new NokiaFactory();
		
		Bateria bateria = factory.criaBateria();
		Camera camera = factory.criaCamera();
		GPS gps = factory.criaGPS();
		Visor visor = factory.criaVisor();
		
		bateria.mostraInfoBateria();
		camera.mostraInfoCamera();
		gps.mostraInfoGPS();
		visor.mostraInfoVisor();
	}
}
