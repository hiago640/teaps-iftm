package aula02.exercicio01;

public class Par<F,S> {
	
	private F first;
	private S second;
	
	
	public F getF() {
		return first;
	}

	public void setFirst(F f) {
		this.first = f;
	}

	public S getS() {
		return second;
	}

	public void setSecond(S s) {
		this.second = s;
	}
	
	public String exibirPar() {
		return String.format("First: %s - Second: %s", first, second);
	}
}
