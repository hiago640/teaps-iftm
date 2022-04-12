package abstract_factory.exemplo01.factory;

import abstract_factory.exemplo01.products.CarroPopular;
import abstract_factory.exemplo01.products.CarroSedan;

public interface CarroFactory {

	public CarroPopular criaCarroPopular();

	public CarroSedan criaCarroSedan();
}
