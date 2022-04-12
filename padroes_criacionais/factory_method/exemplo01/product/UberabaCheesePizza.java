package factory_method.exemplo01.product;

public class UberabaCheesePizza extends Pizza {

	public UberabaCheesePizza() {
		nome = "Pizza de queijo estilo Uberaba";
		massa = "Massa fina";
		molho = "Molho marinara";
		
		coberturas.add("Queijo Mussarela");
		coberturas.add("Queijo Provolone");
	}

}
