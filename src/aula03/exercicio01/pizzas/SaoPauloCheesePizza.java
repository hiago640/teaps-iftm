package aula03.exercicio01.pizzas;

import aula03.exercicio01.Pizza;

public class SaoPauloCheesePizza extends Pizza{
	public SaoPauloCheesePizza()
	{
		nome = "Pizza de queijo estilo S�o Paulo";
		massa = "Massa grossa";
		molho = "Molho de tomate";
		
		coberturas.add("Queijo Mussarela");
		coberturas.add("Requeij�o");
	}
	
	@Override
	public void cut() {
		System.out.println("Cortar a pizza em peda�os quadrados.");
	}
}
