package aula04.lista01.exercicio01;

import aula03.exercicio01.Pizza;

public abstract class SanduicheFactory {

	public abstract Sanduiche createSanduiche(String type);

	public Sanduiche orderPizza(String type) {
		Sanduiche sandubao;
		sandubao = createSanduiche(type);
		sandubao.fritar();
		return sandubao;

	}
}
