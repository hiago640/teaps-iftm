package adapter;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado{
	
	private SomadorExistente somador;
	
	public SomadorAdapter(SomadorExistente somador){
		this.somador = somador;
	}
	
	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> list = new ArrayList<>();
		
		for(int i : vetor)
			list.add(i);
		
		return somador.somaLista(list);
	}

}
