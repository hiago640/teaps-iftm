package factory_method.exemplo01.factory;

import factory_method.exemplo01.product.Pizza;

public abstract class PizzaFactory {
	
	public abstract Pizza createPizza(PizzaEnum type);

	public Pizza orderPizza(PizzaEnum type) {
		Pizza pizza;
		pizza = createPizza(type);
		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.colocarNaCaixa();
		return pizza;

	}
}
