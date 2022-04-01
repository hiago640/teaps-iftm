package factory_method.exemplo02;

public class Principal {
	public static void main(String[] args) {
		
		SanduicheFactory factory;
		factory = new LanchoneteCG();
		
		Sanduiche sanduba = factory.createSanduiche();
		
		System.out.println(sanduba.toString());
	}
}
