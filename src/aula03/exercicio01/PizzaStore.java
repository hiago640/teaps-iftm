package aula03.exercicio01;

public abstract class PizzaStore {

	public abstract Pizza createPizza(String type);

	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare(); // preparar
		pizza.bake(); // assar
		pizza.cut(); // cortar
		pizza.box(); // colocar na caixa
		return pizza;

	}
}
