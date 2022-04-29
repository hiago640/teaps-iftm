package stategy.exemplo02.strategy;

public class Diplomacia implements Estrategia {

	@Override
	public void iniciar() {
		System.out.println("Recuar tropas");
		System.out.println("Propor cooperação econômica");
	}

	@Override
	public void concluir() {
		System.out.println("Desarmar inimigo");
	}

}
