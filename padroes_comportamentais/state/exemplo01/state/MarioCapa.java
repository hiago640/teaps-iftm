package state.exemplo01.state;

public class MarioCapa implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario com Fogo");
		return null;
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Mario Grande");
		return new MarioGrande();
	}

}
