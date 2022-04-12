package abstract_factory.exemplo03.products.moderno;

import abstract_factory.exemplo03.products.Cadeira;

public class CadeiraModerna extends Cadeira{

	@Override
	public void mostraInfoCadeira() {
		System.out.println("Cadeira = Moderna");
	}
}
