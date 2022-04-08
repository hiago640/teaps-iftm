package decorator.exemplo02.decorators;

import decorator.exemplo02.Bebidas;

public class LeiteCondensado extends AcompanhamentoDecorator {

	Bebidas bebida;

	public LeiteCondensado(Bebidas bebida) {
		this.bebida = bebida;
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", Leite Condensado";
	}

	@Override
	public double getCusto() {
		return 1.4 + bebida.getCusto();
	}
}