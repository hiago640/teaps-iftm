package bridge.exemplo01.abstraction;

import bridge.exemplo01.implementation.ImplementacaoRefrigerante;

public class TamanhoPequeno extends AbstracaoTamanho {

	public TamanhoPequeno(ImplementacaoRefrigerante refrigerante) {
		super(refrigerante);
	}

	@Override
	public void beber() {
		System.out.println("Toma um gole de "+ refrigerante);
		System.out.println("Acabou o(a) "+ refrigerante);
		System.out.println("\n");
	}

}
