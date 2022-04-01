package factory_method.exemplo02;

import factory_method.exemplo02.enums.PaoEnum;
import factory_method.exemplo02.enums.PresuntoEnum;
import factory_method.exemplo02.enums.QueijoEnum;
import factory_method.exemplo02.enums.SaladaEnum;

public abstract class Sanduiche {
	String descricao;
	PaoEnum tipoPao;
	QueijoEnum tipoQueijo;
	PresuntoEnum tipoPresunto;
	SaladaEnum tipoSalada;

	public void fritar() {
		System.out.println("Tá pegando fogo bixo!");
	}

	@Override
	public String toString() {
		return "Sanduiche [descricao=" + descricao + ", tipoPao=" + tipoPao + ", tipoQueijo=" + tipoQueijo
				+ ", tipoPresunto=" + tipoPresunto + ", tipoSalada=" + tipoSalada + "]";
	}
	
	
}
