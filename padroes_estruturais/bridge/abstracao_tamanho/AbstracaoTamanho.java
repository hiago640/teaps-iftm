package bridge.abstracao_tamanho;

import bridge.abstracao_refrigerante.ImplementacaoRefrigerante;

public abstract class AbstracaoTamanho {
	
	protected ImplementacaoRefrigerante refrigerante;
	
	public AbstracaoTamanho(ImplementacaoRefrigerante refrigerante) {
		this.refrigerante = refrigerante;
	}
	
	public abstract void beber();
}
