package factory_method.exemplo01;

import java.util.Scanner;

import factory_method.exemplo01.factory.PizzaEnum;
import factory_method.exemplo01.factory.PizzaFactory;
import factory_method.exemplo01.factory.SaoPauloPizzaFactory;
import factory_method.exemplo01.factory.UberabaPizzaFactory;

public class Cliente {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		sb.append("Escolha qual Pizzaria deseja encomendar Pizza.");
		sb.append("\n1 - Pizzaria Uberaba");
		sb.append("\n2 - Pizzaria Sao Paulo");
		sb.append("\n>>>> ");
		System.out.print(sb.toString());
		int option = scan.nextInt();

		PizzaFactory pizzaFactory = null;
		
		switch (option) {
			case 1:
				pizzaFactory = new UberabaPizzaFactory();
				break;
			case 2:
				pizzaFactory = new SaoPauloPizzaFactory();
				break;
			default:
				break;
		}
		
		mostrarCardapio(pizzaFactory);
		scan.close();
	}

	private static void mostrarCardapio(PizzaFactory pizzaFactory) {
		
		if(pizzaFactory == null) 
			return;
		
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
				pizzaFactory.orderPizza(PizzaEnum.CHEESE);
				break;
			case 2:
				pizzaFactory.orderPizza(PizzaEnum.PEPPERONI);
				break;
			case 3:
				pizzaFactory.orderPizza(PizzaEnum.VEGGIE);
				break;
			default:
				break;
		}
		
		scan.close();
		
	}
	
}
