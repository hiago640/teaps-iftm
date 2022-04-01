package factory_method.exemplo01.pizzas;

import factory_method.exemplo01.Pizza;

public class UberabaCheesePizza extends Pizza {

	public UberabaCheesePizza() {
		nome = "Pizza de queijo estilo Uberaba";
		massa = "Massa fina";
		molho = "Molho marinara";
		
		coberturas.add("Queijo Mussarela");
		coberturas.add("Queijo Provolone");
	}

}
