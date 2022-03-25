package aula05.lista02.exercicio01;

public class ParentesesDecorator extends PontuacaoDecorator{
	
	Numero numero;
	
	public ParentesesDecorator(Numero numero) {
		this.numero = numero;
	}
	
	@Override
	public String getDescricao() {
		return "(" + numero.getDescricao()  + ")";
	}
	
}
