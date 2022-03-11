package aula04.lista01.enums;

public enum SaladaEnum {
	COM_VERDURA("Com verdura"),
	SEM_VERDURA("Sem verdura");
	
	private String value;
	
	SaladaEnum(String value){
		this.value = value;		
	}
	
	public String getType() {
        return value;
    }
}
