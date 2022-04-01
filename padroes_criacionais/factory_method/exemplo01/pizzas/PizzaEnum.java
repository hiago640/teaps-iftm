package factory_method.exemplo01.pizzas;

public enum PizzaEnum {
	CHEESE("cheese"),
	PEPPERONI("pepperoni"),
	VEGGIE("veggie");
	
	String value;
	PizzaEnum(String value) {
		this.value = value;
	}
	
	public String getType() {
        return value;
    }
}
