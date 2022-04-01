package decorator.decorators;

import decorator.Numero;

public class ParentesesDecorator extends PontuacaoDecorator{
	
	Numero numero;
	
	public ParentesesDecorator(Numero numero) {
		this.numero = numero;
	}
	
	@Override
	public String getDescricao() {
		return "(" + numero.getDescricao()  + ")";
	}
	
}
