package decorator.exemplo02.decorators;

import decorator.exemplo02.Bebidas;

public class Limao extends AcompanhamentoDecorator{

	Bebidas bebida;
	
	public Limao(Bebidas bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", Limao";
	}

	@Override
	public double getCusto() {
		return 5.40 + bebida.getCusto();
	}
	
}
