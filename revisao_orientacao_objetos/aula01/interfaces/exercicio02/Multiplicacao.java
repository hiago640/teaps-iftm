package aula01.interfaces.exercicio02;

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
