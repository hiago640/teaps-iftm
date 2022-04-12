package abstract_factory.exemplo01;

import abstract_factory.exemplo01.factory.CarroFactory;
import abstract_factory.exemplo01.factory.FiatFactory;
import abstract_factory.exemplo01.products.CarroPopular;
import abstract_factory.exemplo01.products.CarroSedan;

public class Cliente {

	public static void main(String[] args) {
		CarroFactory fabrica = new FiatFactory();

		CarroPopular carroPopular = fabrica.criaCarroPopular();
		carroPopular.exibirInfoPopular();

		CarroSedan carroSedan = fabrica.criaCarroSedan();
		carroSedan.exibirInfoSedan();
	}
}
