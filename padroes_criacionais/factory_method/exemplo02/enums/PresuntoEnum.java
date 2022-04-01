package factory_method.exemplo02.enums;

public enum PresuntoEnum {
	DE_FRANGO("Frango"),
	DE_PERU("Peru");
	
	private String value;
	
	PresuntoEnum(String value){
		this.value = value;		
	}
	
	public String getType() {
        return value;
    }
}
