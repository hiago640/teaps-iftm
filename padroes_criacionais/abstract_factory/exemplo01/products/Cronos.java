package abstract_factory.exemplo01.products;

public class Cronos implements CarroSedan{

	@Override
	public void exibirInfoSedan() {
		String info = "Modelo: Cronos, Fábrica: Fiat, Categoria: Sedan";
		System.out.println(info); 
	}
	
}
