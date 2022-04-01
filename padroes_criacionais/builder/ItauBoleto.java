package builder;

public class ItauBoleto extends BoletoBuilder {

	@Override
	public void buildValor() {
		boleto.setValor(100);
	}

	@Override
	public void buildSacado() {
		boleto.setSacado("Nafuzi");

	}

	@Override
	public void buildCedente() {
		boleto.setCedente("Hiago");

	}

	@Override
	public void buildVencimento() {
		boleto.setVencimento("01/01/2022");
	}

	@Override
	public void buildCodigoDeBarras() {
		boleto.setCodigoDeBarras("12345678994151");
	}
}
