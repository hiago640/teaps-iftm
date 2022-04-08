package adapter.exemplo01;

public class Principal {
	
	public static void main(String[] args) {
		SomadorExistente somador = new SomadorExistente();
		
		int[] vetor = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		SomadorAdapter adapter = new SomadorAdapter(somador);
		
		int soma = adapter.somaVetor(vetor);
		System.out.println("Resultado: " + soma);
	}
}




