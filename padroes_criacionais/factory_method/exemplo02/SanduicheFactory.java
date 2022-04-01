package factory_method.exemplo02;

public abstract class SanduicheFactory {

	public abstract Sanduiche createSanduiche();

	public Sanduiche orderSanduiche() {
		Sanduiche sandubao;
		sandubao = createSanduiche();
		sandubao.fritar();
		return sandubao;

	}
}
