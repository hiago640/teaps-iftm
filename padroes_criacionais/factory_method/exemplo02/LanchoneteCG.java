package factory_method.exemplo02;

import factory_method.exemplo02.enums.PaoEnum;
import factory_method.exemplo02.enums.PresuntoEnum;
import factory_method.exemplo02.enums.QueijoEnum;
import factory_method.exemplo02.enums.SaladaEnum;

public class LanchoneteCG extends SanduicheFactory {

		@Override
		public Sanduiche createSanduiche() {
			Sanduiche sanduiche = new SanduicheBasico(PaoEnum.INTEGRAL, QueijoEnum.PRATO, PresuntoEnum.DE_FRANGO, SaladaEnum.SEM_VERDURA);;
			sanduiche.descricao = "Lanche da Lanchonete CG";
			return sanduiche;
		}
		
			
}
