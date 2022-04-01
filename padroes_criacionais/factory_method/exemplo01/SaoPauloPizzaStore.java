package factory_method.exemplo01;

import factory_method.exemplo01.pizzas.PizzaEnum;
import factory_method.exemplo01.pizzas.SaoPauloCheesePizza;

public class SaoPauloPizzaStore extends PizzaStore{
	
	@Override
	public Pizza createPizza(String type) {
		System.out.println(type);
		
		Pizza pizza = null;
		if (PizzaEnum.CHEESE.getType().equals(type)) {
			pizza = new SaoPauloCheesePizza();
		}

		return pizza;

	}

}
