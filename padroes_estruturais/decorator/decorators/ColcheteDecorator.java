package decorator.decorators;

import decorator.Numero;

public class ColcheteDecorator extends PontuacaoDecorator{
	
	Numero numero;
	
	public ColcheteDecorator(Numero numero) {
		this.numero = numero;
	}
	
	@Override
	public String getDescricao() {
		return "[" + numero.getDescricao()  + "]";
	}

}