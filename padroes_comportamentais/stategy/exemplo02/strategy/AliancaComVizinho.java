package stategy.exemplo02.strategy;

public class AliancaComVizinho implements Estrategia {

	@Override
	public void iniciar() {
		System.out.println("Atacar pelo Norte");
		System.out.println("Vizinho Atacar pelo Sul");
	}

	@Override
	public void concluir() {
		System.out.println("Dividir beneficios");
		System.out.println("Dividir custo de reconstrução");
	}
}
