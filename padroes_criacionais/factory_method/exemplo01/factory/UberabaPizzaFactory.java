package factory_method.exemplo01.factory;

import factory_method.exemplo01.product.PepperoniPizza;
import factory_method.exemplo01.product.Pizza;
import factory_method.exemplo01.product.UberabaCheesePizza;
import factory_method.exemplo01.product.VeggiePizza;

public class UberabaPizzaFactory extends PizzaFactory {

	@Override
	public Pizza createPizza(PizzaEnum type) {

		Pizza pizza = null;
		switch (type) {
		case CHEESE:
			pizza = new UberabaCheesePizza();
			break;
		case PEPPERONI:
			pizza = new PepperoniPizza();
			break;
		case VEGGIE:
			pizza = new VeggiePizza();
			break;
		default:
			break;
		}

		return pizza;
	}

}
