package abstract_factory.exemplo01.products;

public class Argo implements CarroPopular{

	@Override
	public void exibirInfoPopular() {
		String info = "Modelo: Argo, Fábrica: Fiat, Categoria: Popular";
		System.out.println(info); 
	}

}
