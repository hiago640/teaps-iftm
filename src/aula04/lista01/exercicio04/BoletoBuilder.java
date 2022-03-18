package aula04.lista01.exercicio04;

public abstract class BoletoBuilder {
	
	protected Boleto boleto;
	
	public void createNewBoleto() {
		boleto = new Boleto();
	}
	
	public abstract void buildValor();
	public abstract void buildSacado();
	public abstract void buildCedente();
	public abstract void buildVencimento();
	public abstract void buildCodigoDeBarras();

	public Boleto getBoleto() {
		return boleto;
	}
}
