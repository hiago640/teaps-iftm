package state.exemplo02.state;

public class DeliveredPizzaState implements PizzaState {

	@Override
	public PizzaState bake() {
		System.out.println("Can't bake a pizza already delivered");
		return this;
	}

	@Override
	public PizzaState deliver() {
		System.out.println("Can't deliver a pizza already delivered");
		return this;
	}

}
