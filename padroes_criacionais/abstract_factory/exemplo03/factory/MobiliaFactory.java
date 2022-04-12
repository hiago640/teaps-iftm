package abstract_factory.exemplo03.factory;

import abstract_factory.exemplo03.products.Cadeira;
import abstract_factory.exemplo03.products.Mesa;
import abstract_factory.exemplo03.products.Sofa;

public interface MobiliaFactory {

	public Cadeira criaCadeira();

	public Mesa criaMesa();

	public Sofa criaSofa();
}
