package state.exemplo02.state;

public class CookedPizzaState implements PizzaState {

	@Override
	public PizzaState bake() {
		System.out.println("Baking the pizza...");
		return new BakedPizzaState();
	}

	@Override
	public PizzaState deliver() {
		System.out.println("Can't deliver a pizza not baked yet.");
		return null;
	}

}
