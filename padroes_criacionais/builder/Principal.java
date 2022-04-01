package builder;

public class Principal {
	
	public static void main(String[] args) {
		ItauBoleto itauBoleto = new ItauBoleto();
		BancoDirector bancoDirector = new BancoDirector(itauBoleto);
		
		bancoDirector.construirBoleto();
		Boleto boleto = bancoDirector.getBoleto();
		
		System.out.println(boleto);
		
	}
	
}
