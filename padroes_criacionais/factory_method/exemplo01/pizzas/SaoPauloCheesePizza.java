package factory_method.exemplo01.pizzas;

import factory_method.exemplo01.Pizza;

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
