package decorator.exemplo01.decorators;

import decorator.exemplo01.Numero;

public class ChavesDecorator extends PontuacaoDecorator{
	
	Numero numero;
	
	public ChavesDecorator(Numero numero) {
		this.numero = numero;
	}
	
	@Override
	public String getDescricao() {
		return "{" + numero.getDescricao() + "}";
	}

}
