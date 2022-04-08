package decorator.exemplo02;

import decorator.exemplo02.decorators.Limao;
import decorator.exemplo02.decorators.Suco;

public class Principal {
	public static void main(String[] args) {
		
		Bebidas vodka = new Vodka();
		System.out.println("Bebida = " + vodka.getDescricao());
		System.out.println("Valor = " + vodka.getCusto());
		
		vodka = new Limao(vodka);
		System.out.println("Bebida = " + vodka.getDescricao());
		System.out.println("Valor = " + vodka.getCusto());
		
		vodka = new Suco(vodka);
		System.out.println("Bebida = " + vodka.getDescricao());
		System.out.println("Valor = " + vodka.getCusto());
	}
}
