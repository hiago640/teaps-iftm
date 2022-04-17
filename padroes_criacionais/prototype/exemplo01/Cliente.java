package prototype.exemplo01;

import prototype.exemplo01.product.Caracteristica;
import prototype.exemplo01.product.Produto;

public class Cliente {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Produto prod1 = new Produto("Livre","Jogos");
		prod1.setCaracteristica(new Caracteristica("Controle", "Microsoft", 350));

		Produto produtoClonado = prod1.clone();
		produtoClonado.setCaracteristica(new Caracteristica("Controle", "Playstation", 400));
		
		System.out.println("Produto 1 > " + prod1.toString());
		System.out.println("Produto 2 > " + produtoClonado.toString());
	}

}
