package abstract_factory.exemplo02.products.nokia;

import abstract_factory.exemplo02.products.Visor;

public class VisorNokia extends Visor{

	@Override
	public void mostraInfoVisor() {
		System.out.println("Visor = NOKIA");
	}
}
