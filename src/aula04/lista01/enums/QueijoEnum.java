package aula04.lista01.enums;

public enum QueijoEnum {
	PRATO("Prato"),
	MUSSARELA("Mussarela"),
	CHEDDAR("Cheddar");
	
	private String value;
	
	QueijoEnum(String value){
		this.value = value;		
	}
	
	public String getType() {
        return value;
    }
}
