package aula01.interfaces.exercicio02;

public class Soma implements OperacaoMatematica{
	
	@Override
	public double x() {
		return 47;
	}

	@Override
	public double y() {
		return 30;
	}

	@Override
	public double calcular() {
		return x() + y();
	}
	
}
