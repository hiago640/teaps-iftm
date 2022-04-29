package stategy.exemplo01.strategy.voar;

public class VoarNao implements ComportamentoVoar{

	@Override
	public void voar() {
		System.out.println("cê não voa");
	}

}
