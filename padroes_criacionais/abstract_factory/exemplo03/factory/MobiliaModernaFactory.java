package abstract_factory.exemplo03.factory;

import abstract_factory.exemplo03.products.Cadeira;
import abstract_factory.exemplo03.products.Mesa;
import abstract_factory.exemplo03.products.Sofa;
import abstract_factory.exemplo03.products.moderno.CadeiraModerna;
import abstract_factory.exemplo03.products.moderno.MesaModerna;
import abstract_factory.exemplo03.products.moderno.SofaModerno;

public class MobiliaModernaFactory  implements MobiliaFactory{

	@Override
	public Cadeira criaCadeira() {
		return new CadeiraModerna();
	}

	@Override
	public Mesa criaMesa() {
		return new MesaModerna();
	}

	@Override
	public Sofa criaSofa() {
		return new SofaModerno();
	}

}
