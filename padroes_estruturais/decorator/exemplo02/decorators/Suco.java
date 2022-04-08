package decorator.exemplo02.decorators;

import decorator.exemplo02.Bebidas;

public class Suco extends AcompanhamentoDecorator {

	Bebidas bebida;

	public Suco(Bebidas bebida) {
		this.bebida = bebida;
	}

	@Override
	public String getDescricao() {
		return  bebida.getDescricao() + ", Suco";
	}

	@Override
	public double getCusto() {
		return 1.9 + bebida.getCusto();
	}
}
