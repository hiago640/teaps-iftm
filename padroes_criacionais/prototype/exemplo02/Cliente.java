package prototype.exemplo02;

import prototype.exemplo02.product.FormaGeometrica;

public class Cliente {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		FormaGeometrica forma = new FormaGeometrica(3, "Triangulo");
		
		FormaGeometrica novaForma = forma.clone();
		novaForma.lados = 4;
		novaForma.nome = "Quadrado";
		
		System.out.println(forma);
		System.out.println(novaForma);
	}
	
}
