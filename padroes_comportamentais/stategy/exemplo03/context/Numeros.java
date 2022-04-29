package stategy.exemplo03.context;

import java.util.ArrayList;
import java.util.List;

import stategy.exemplo03.strategy.SortStrategy;

public class Numeros {
	
	List<Integer> numeros = new ArrayList<>();
	
	public Numeros(List<Integer> numerosList) {
		numeros.addAll(numerosList);
	}
	
	public SortStrategy estrategia;
	
	public void sort() {
		estrategia.sort();
	}
}
