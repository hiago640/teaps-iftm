package abstract_factory.exemplo03;

import abstract_factory.exemplo03.factory.MobiliaArtDecoFactory;
import abstract_factory.exemplo03.factory.MobiliaFactory;
import abstract_factory.exemplo03.factory.MobiliaModernaFactory;
import abstract_factory.exemplo03.factory.MobiliaVitorianaFactory;
import abstract_factory.exemplo03.products.Cadeira;
import abstract_factory.exemplo03.products.Mesa;
import abstract_factory.exemplo03.products.Sofa;

public class Cliente {
	
	public static void main(String[] args) {
		
		MobiliaFactory factory;
		Cadeira cadeira;
		Mesa mesa;
		Sofa sofa;
		
		System.out.println(">>Mobília Art Deco");
		factory = new MobiliaArtDecoFactory();
		cadeira = factory.criaCadeira();
		mesa = factory.criaMesa();
		sofa = factory.criaSofa();
		
		cadeira.mostraInfoCadeira();
		mesa.mostraInfoMesa();
		sofa.mostraInfoSofa();
		
		System.out.println("\n>>Mobília Moderna");
		factory = new MobiliaModernaFactory();
		
		cadeira = factory.criaCadeira();
		mesa = factory.criaMesa();
		sofa = factory.criaSofa();
		
		cadeira.mostraInfoCadeira();
		mesa.mostraInfoMesa();
		sofa.mostraInfoSofa();
		
		System.out.println("\n>>Mobília Vitoriana");
		factory = new MobiliaVitorianaFactory();
		
		cadeira = factory.criaCadeira();
		mesa = factory.criaMesa();
		sofa = factory.criaSofa();
		
		cadeira.mostraInfoCadeira();
		mesa.mostraInfoMesa();
		sofa.mostraInfoSofa();
	}
}
