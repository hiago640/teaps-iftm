package abstract_factory.exemplo03.products.art_deco;

import abstract_factory.exemplo03.products.Cadeira;

public class CadeiraArtDeco extends Cadeira{

	@Override
	public void mostraInfoCadeira() {
		System.out.println("Cadeira = Art Deco");
	}

}
