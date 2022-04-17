package composite.exemplo02.leaf;

import composite.exemplo02.component.ItemComponent;

public class Produto extends ItemComponent {

	public Produto(String nomeItem, double valor) {
		this.nomeItem = nomeItem;
		this.valor = valor;
	}

}
