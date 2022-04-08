package decorator.exemplo01;

import decorator.exemplo01.decorators.ChavesDecorator;
import decorator.exemplo01.decorators.ColcheteDecorator;
import decorator.exemplo01.decorators.ParentesesDecorator;

public class Principal {
	
	public static void main(String[] args) {
		
		Numero number = new NumeroPositivo();
		number.geraNumero();
		
		System.out.println(number.getDescricao());
		
		number = new ParentesesDecorator(number);
		
		System.out.println(number.getDescricao());
		number = new ParentesesDecorator(number);
		
		System.out.println(number.getDescricao());
		number = new ChavesDecorator(number);
		
		System.out.println(number.getDescricao());
		number = new ColcheteDecorator(number);
		
		System.out.println(number.getDescricao());
		
	}
}
