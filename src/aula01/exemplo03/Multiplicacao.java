package aula01.exemplo03;

public class Multiplicacao implements OperacaoMatematica{

	@Override
	public double x() {
		return 3;
	}

	@Override
	public double y() {
		return 348;
	}

	@Override
	public double calcular() {
		return x() * y();
	}
}
