package factory_method.exemplo02.factory;

import factory_method.exemplo02.product.Sanduiche;
import factory_method.exemplo02.product.SanduicheBasico;
import factory_method.exemplo02.product.SanduicheInfarto;
import factory_method.exemplo02.product.enums.PaoEnum;
import factory_method.exemplo02.product.enums.PresuntoEnum;
import factory_method.exemplo02.product.enums.QueijoEnum;
import factory_method.exemplo02.product.enums.SaladaEnum;
import factory_method.exemplo02.product.enums.SanduicheEnum;

public class LanchoneteJPFactory extends SanduicheFactory {

	@Override
	public Sanduiche createSanduiche(SanduicheEnum type) {
		Sanduiche sanduba = null;

		switch (type) {

		case BASICO:
			sanduba = new SanduicheBasico(PaoEnum.FRANCES, QueijoEnum.MUSSARELA, PresuntoEnum.FRANGO,
					SaladaEnum.COM_VERDURA);
			sanduba.descricao = "Sanduiche Basico da Lanchonete JP";
			break;

		case INFARTO:
			sanduba = new SanduicheInfarto(PaoEnum.FRANCES, QueijoEnum.CHEDDAR, QueijoEnum.MUSSARELA, QueijoEnum.PRATO,
					PresuntoEnum.FRANGO, PresuntoEnum.PERU, SaladaEnum.COM_VERDURA);
			sanduba.descricao = "Sanduiche Infarto da Lanchonete JP";
			break;
		default:
			break;
		}

		return sanduba;
	}

}
