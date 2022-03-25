package aula03.exercicio01;

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
