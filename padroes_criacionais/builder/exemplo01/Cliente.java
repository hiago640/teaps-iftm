package builder.exemplo01;

import builder.exemplo01.builder.ItauBoleto;
import builder.exemplo01.director.BancoDirector;
import builder.exemplo01.product.Boleto;

public class Cliente {
	
	public static void main(String[] args) {
		ItauBoleto itauBoleto = new ItauBoleto();
		BancoDirector bancoDirector = new BancoDirector(itauBoleto);
		
		bancoDirector.construirBoleto();
		Boleto boleto = bancoDirector.getBoleto();
		
		System.out.println(boleto);
	}
}
