package abstract_factory.exemplo02.products.nokia;

import abstract_factory.exemplo02.products.GPS;

public class GPSNokia extends GPS{

	@Override
	public void mostraInfoGPS() {
		System.out.println("GPS = NOKIA");
	}
	
}
