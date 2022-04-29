package stategy.exemplo03;

import java.util.Arrays;
import java.util.List;

import stategy.exemplo03.context.Numeros;
import stategy.exemplo03.strategy.BubbleSort;
import stategy.exemplo03.strategy.InsertionSort;
import stategy.exemplo03.strategy.QuickSort;
import stategy.exemplo03.strategy.ShellSort;

public class Cliente {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,9,40,3,2,0);
		
		Numeros	numeros = new Numeros(lista);
		numeros.estrategia = new BubbleSort();
		numeros.sort();
		
		numeros.estrategia = new InsertionSort();
		numeros.sort();
		
		numeros.estrategia = new QuickSort();
		numeros.sort();
		
		numeros.estrategia = new ShellSort();
		numeros.sort();
	}
	
}
