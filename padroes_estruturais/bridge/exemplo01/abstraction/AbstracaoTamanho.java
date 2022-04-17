package bridge.exemplo01.abstraction;

import bridge.exemplo01.implementation.ImplementacaoRefrigerante;

public abstract class AbstracaoTamanho {
	
	protected ImplementacaoRefrigerante refrigerante;
	
	public AbstracaoTamanho(ImplementacaoRefrigerante refrigerante) {
		this.refrigerante = refrigerante;
	}
	
	public abstract void beber();
}
