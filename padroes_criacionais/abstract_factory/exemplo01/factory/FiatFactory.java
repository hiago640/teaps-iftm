package abstract_factory.exemplo01.factory;

import abstract_factory.exemplo01.products.Argo;
import abstract_factory.exemplo01.products.CarroPopular;
import abstract_factory.exemplo01.products.CarroSedan;
import abstract_factory.exemplo01.products.Cronos;

public class FiatFactory implements CarroFactory{

	@Override
	public CarroPopular criaCarroPopular() {
		return new Argo();
	}

	@Override
	public CarroSedan criaCarroSedan() {
		return new Cronos();
	}
	
}
