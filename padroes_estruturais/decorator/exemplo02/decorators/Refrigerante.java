package decorator.exemplo02.decorators;

import decorator.exemplo02.Bebidas;

public class Refrigerante  extends AcompanhamentoDecorator{

	Bebidas bebida;
	
	public Refrigerante(Bebidas bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao() {
		return  bebida.getDescricao() + ", Refrigerante";
	}

	@Override
	public double getCusto() {
		return 9.40 + bebida.getCusto();
	}
	
}
