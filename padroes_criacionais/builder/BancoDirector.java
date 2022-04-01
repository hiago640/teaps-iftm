package builder;

public class BancoDirector {
	
	BoletoBuilder boletoObject;
	
	public BancoDirector(BoletoBuilder boletoObject) {
		this.boletoObject = boletoObject;
	}
	
	public void construirBoleto() {
		boletoObject.createNewBoleto();
		boletoObject.buildCedente();
		boletoObject.buildCodigoDeBarras();
		boletoObject.buildSacado();
		boletoObject.buildValor();
		boletoObject.buildVencimento();
	}
	
	public Boleto getBoleto() {
		return boletoObject.getBoleto();
	}

}
