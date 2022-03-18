package aula04.lista01.exercicio01;

import aula04.lista01.exercicio01.enums.PaoEnum;
import aula04.lista01.exercicio01.enums.PresuntoEnum;
import aula04.lista01.exercicio01.enums.QueijoEnum;
import aula04.lista01.exercicio01.enums.SaladaEnum;

public class LanchoneteCG extends SanduicheFactory {

	Sanduiche sanduiche = new SanduicheBasico(PaoEnum.INTEGRAL, QueijoEnum.PRATO, PresuntoEnum.DE_FRANGO, SaladaEnum.SEM_VERDURA);;

		@Override
		public Sanduiche createSanduiche(String type) {
			// TODO Auto-generated method stub
			return null;
		}
		
			
}
