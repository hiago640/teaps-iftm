package composite.exemplo02.composite;

import java.util.ArrayList;
import java.util.List;

import composite.exemplo02.component.ItemComponent;

public class CaixaComposite extends ItemComponent {
	public List<ItemComponent> itens = new ArrayList<>();
	public static double valorDoPedido = 0;

	public CaixaComposite(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	@Override
	public void printNomeItem() {
		System.out.println(this.nomeItem);

		for (ItemComponent item : itens) {

			if (item.getClass() == this.getClass())
				System.out.println(" ");

			item.printNomeItem();
		}
	}

	@Override
	public void adicionar(ItemComponent item) throws Exception {
		this.itens.add(item);
	}

	@Override
	public ItemComponent getProduto(String nomeProduto) throws Exception {

		for (ItemComponent item : itens) {
			if (item.getNomeItem() == nomeProduto)
				return item;
		}

		throw new Exception("Não existe este item");
	}

	@Override
	public double calculaValorTotal() {

		for (ItemComponent item : itens) {
			System.out.println("Calculando valor do item: " + item.nomeItem + " valor: " + item.valor);
			valorDoPedido += item.valor;

			item.calculaValorTotal();
		}
		return valorDoPedido;
	}

	@Override
	public void mostraTotal() {
		System.out.println("O valor total de itens é: " + calculaValorTotal());
	}
}
