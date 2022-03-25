package aula04.lista01.exercicio01.enums;

public enum PaoEnum {
	INTEGRAL("Integral"),
	FRANCES("Frances"),
	BOLA("Bola");
	
	private String value;
	
	PaoEnum(String value){
		this.value = value;		
	}
	
	public String getType() {
        return value;
    }
}
