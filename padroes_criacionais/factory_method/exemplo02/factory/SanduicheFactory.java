package factory_method.exemplo02.factory;

import factory_method.exemplo02.product.Sanduiche;
import factory_method.exemplo02.product.enums.SanduicheEnum;

public abstract class SanduicheFactory {

	public abstract Sanduiche createSanduiche(SanduicheEnum type);

	public Sanduiche orderSanduiche(SanduicheEnum type) {
		Sanduiche sandubao;
		sandubao = createSanduiche(type);
		sandubao.fritar();
		return sandubao;
	}
}
