package stategy.exemplo02.strategy;

public class AtacarSozinho implements Estrategia {

	@Override
	public void iniciar() {
		System.out.println("Plantar evidências falsas");
		System.out.println("Lançar Bombas");
		System.out.println("Derrubar governo");
	}

	@Override
	public void concluir() {
		System.out.println("Estabelecer governo");
		System.out.println("Amigo");
	}

}
