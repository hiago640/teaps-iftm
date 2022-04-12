package abstract_factory.exemplo03.factory;

import abstract_factory.exemplo03.products.Cadeira;
import abstract_factory.exemplo03.products.Mesa;
import abstract_factory.exemplo03.products.Sofa;
import abstract_factory.exemplo03.products.art_deco.CadeiraArtDeco;
import abstract_factory.exemplo03.products.art_deco.MesaArtDeco;
import abstract_factory.exemplo03.products.art_deco.SofaArtDeco;

public class MobiliaArtDecoFactory implements MobiliaFactory{

	@Override
	public Cadeira criaCadeira() {
		return new CadeiraArtDeco();
	}

	@Override
	public Mesa criaMesa() {
		return new MesaArtDeco();
	}

	@Override
	public Sofa criaSofa() {
		return new SofaArtDeco();
	}

}
