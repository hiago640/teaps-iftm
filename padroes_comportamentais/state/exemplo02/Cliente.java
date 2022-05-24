package state.exemplo02;

import state.exemplo02.context.Pizza;

public class Cliente {
	
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		pizza.setName("Portuguesa");
		
		pizza.bake();
		pizza.deliver();
	}
	
}
