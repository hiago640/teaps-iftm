package state.exemplo02.state;

public class BakedPizzaState implements PizzaState {

	@Override
	public PizzaState bake() {
		System.out.println("Can't bake a pizza already baked");
		return this;
	}

	@Override
	public PizzaState deliver() {
		System.out.println("Delivering the pizza...");
		return new DeliveredPizzaState();
	}

}
