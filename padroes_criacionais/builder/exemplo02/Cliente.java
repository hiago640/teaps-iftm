package builder.exemplo02;

import builder.exemplo02.builder.FiatBuilder;
import builder.exemplo02.builder.VolksBuilder;
import builder.exemplo02.director.ConcessionariaDirector;
import builder.exemplo02.product.Carro;

public class Cliente {

	public static void main(String[] args) {
		FiatBuilder fiatBuilder = new FiatBuilder();
		
		ConcessionariaDirector concessionaria = new ConcessionariaDirector(fiatBuilder);
		concessionaria.construirCarro();
		
		Carro carro = concessionaria.getCarro();
		System.out.println(carro);
		
		VolksBuilder volksBuilder = new VolksBuilder();
		concessionaria = new ConcessionariaDirector(volksBuilder);
		concessionaria.construirCarro();
		
		carro = concessionaria.getCarro();
		System.out.println(carro);
	}

}
