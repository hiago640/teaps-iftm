package state.exemplo02.context;

import state.exemplo02.state.CookedPizzaState;
import state.exemplo02.state.PizzaState;

public class Pizza {

	private String name;
	protected PizzaState estado;

	public Pizza() {
		this.estado = new CookedPizzaState();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void bake() {
		estado = estado.bake();
	}

	public void deliver() {
		estado = estado.deliver();
	}

}
