package aula03.exercicio01;

import aula03.exercicio01.pizzas.SaoPauloCheesePizza;

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
	
	@Override
	public Pizza orderPizza(String type) {
		return super.orderPizza(type);
	}
}
