package factory_method.exemplo02;

import factory_method.exemplo02.enums.PaoEnum;
import factory_method.exemplo02.enums.PresuntoEnum;
import factory_method.exemplo02.enums.QueijoEnum;
import factory_method.exemplo02.enums.SaladaEnum;

public class SanduicheBasico extends Sanduiche {
	
	public SanduicheBasico(PaoEnum tipoPao, QueijoEnum tipoQueijo, PresuntoEnum tipoPresunto, SaladaEnum tipoSalada) {
		this.tipoPao = tipoPao;
		this.tipoQueijo = tipoQueijo;
		this.tipoPresunto = tipoPresunto;
		this.tipoSalada = tipoSalada;
	}
	
	
}
