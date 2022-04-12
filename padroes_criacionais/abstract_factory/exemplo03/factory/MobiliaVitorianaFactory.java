package abstract_factory.exemplo03.factory;

import abstract_factory.exemplo03.products.Cadeira;
import abstract_factory.exemplo03.products.Mesa;
import abstract_factory.exemplo03.products.Sofa;
import abstract_factory.exemplo03.products.vitoriano.CadeiraVitoriana;
import abstract_factory.exemplo03.products.vitoriano.MesaVitoriana;
import abstract_factory.exemplo03.products.vitoriano.SofaVitoriano;

public class MobiliaVitorianaFactory  implements MobiliaFactory{

	@Override
	public Cadeira criaCadeira() {
		return new CadeiraVitoriana();
	}

	@Override
	public Mesa criaMesa() {
		return new MesaVitoriana();
	}

	@Override
	public Sofa criaSofa() {
		return new SofaVitoriano();
	}


}
