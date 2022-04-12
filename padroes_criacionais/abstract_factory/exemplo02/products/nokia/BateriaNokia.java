package abstract_factory.exemplo02.products.nokia;

import abstract_factory.exemplo02.products.Bateria;

public class BateriaNokia extends Bateria{

	@Override
	public void mostraInfoBateria() {
		System.out.println("Bateria = NOKIA");
	}

}
