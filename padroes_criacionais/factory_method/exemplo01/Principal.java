package factory_method.exemplo01;

import java.util.Scanner;

import factory_method.exemplo01.pizzas.PizzaEnum;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		sb.append("Escolha qual Pizzaria deseja encomendar Pizza.");
		sb.append("\n1 - Pizzaria Uberaba");
		sb.append("\n2 - Pizzaria S�o Paulo");
		sb.append("\n>>>> ");
		System.out.print(sb.toString());
		int option = scan.nextInt();

		PizzaStore pizzaStore;
		
		switch (option) {
			case 1:
				pizzaStore = new UberabaPizzaStore();
				escolheCardapio(pizzaStore);
				break;
	
			case 2:
				pizzaStore = new SaoPauloPizzaStore();
				escolheCardapio(pizzaStore);
				break;
				
			default:
				break;
		}
		
		scan.close();

	}

	
	public static void escolheCardapio(PizzaStore pizzaStore) {
		Scanner scan = new Scanner(System.in);

		StringBuilder string = new StringBuilder();

		string.append("Qual Pizza?.");
		string.append("\n1 - Cheese");
		string.append("\n2 - Veggie");
		string.append("\n3 - Pepperoni");
		string.append("\n>>>> ");

		System.out.print(string.toString());
		int cardapio = scan.nextInt();
		
		switch (cardapio) {
			case 1:
				pizzaStore.orderPizza(PizzaEnum.CHEESE.getType());
				break;
	
			case 2:
				pizzaStore.orderPizza(PizzaEnum.PEPPERONI.getType());
				break;
	
			case 3:
				pizzaStore.orderPizza(PizzaEnum.VEGGIE.getType());
				break;
	
			default:
				break;
		}
		
		scan.close();
	}

}
