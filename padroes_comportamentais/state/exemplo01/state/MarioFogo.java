package state.exemplo01.state;

public class MarioFogo implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario com Capa");
		return new MarioCapa();
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Mario Grande");
		return new MarioGrande();
	}

}
