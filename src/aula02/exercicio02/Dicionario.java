package aula02.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Dicionario<K,V> {
	
	private List<K> keys = new ArrayList<>();
	private List<V> values = new ArrayList<>();
	
	public void add(K k, V v) {
		keys.add(k);
		values.add(v);
	}
	
	public V getDicionario(K i){
		int index = keys.indexOf(i); 
		return values.get(index);
	}
	
}

