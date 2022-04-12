package factory_method.exemplo01.product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	
	public String nome;
	public String massa;
	public String molho;
	public List<String> coberturas = new ArrayList<>();

	public void preparar() {
		
		String etapas = "";
		etapas += "Preparando " + nome + "\n";
		etapas += "1. Esticando a massa \n";
		etapas += "2. Adicionando molho \n";
		etapas += "3. Adicionando ingredientes: ";

		for (String cobertura : coberturas) {
			etapas += cobertura;

		}
		System.out.println("\n\n" + etapas);
	}
	
	public void assar() {
		System.out.println("Assar por 15 minutos a 350 graus.");
	}
	
	public void cortar() {
		System.out.println("Cortar a pizza em fatias diagonais.");
	}
	
	public void colocarNaCaixa() {
		System.out.println("\"Colocar a pizza na caixa oficial da PizzaStore.");
	}	
	
	public String toString() {
		return nome;
	}
}
