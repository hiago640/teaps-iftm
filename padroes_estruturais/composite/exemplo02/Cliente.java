package composite.exemplo02;

import composite.exemplo02.component.ItemComponent;
import composite.exemplo02.composite.CaixaComposite;
import composite.exemplo02.leaf.Produto;

public class Cliente {
	public static void main(String[] args) {
		ItemComponent caixa01 = new CaixaComposite("Caixa 01");
		ItemComponent martelo = new Produto("Martelo", 25);
		ItemComponent prego = new Produto("Prego", 10);
		ItemComponent caixa02 = new CaixaComposite("Caixa 02");
		ItemComponent telefone = new Produto("Telefone", 250);

		try {
			caixa01.adicionar(martelo);
			caixa01.adicionar(prego);

			caixa02.adicionar(telefone);
			caixa01.adicionar(caixa02);

			caixa01.printNomeItem();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n\n>>>Valor dos produtos presentes na caixa 01");
		caixa01.mostraTotal();
	}
}
