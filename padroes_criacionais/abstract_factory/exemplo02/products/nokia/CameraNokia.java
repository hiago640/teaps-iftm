package abstract_factory.exemplo02.products.nokia;

import abstract_factory.exemplo02.products.Camera;

public class CameraNokia extends Camera{

	@Override
	public void mostraInfoCamera() {
		System.out.println("Camera = NOKIA");
	}

}
