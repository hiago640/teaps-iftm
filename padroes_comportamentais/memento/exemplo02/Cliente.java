package memento.exemplo02;

import memento.exemplo02.originator.DietInfo;

public class Cliente {

	public static void main(String[] args) {
		
		DietInfo dietInfo = new DietInfo();
		
		dietInfo.setDietInfo("Nicole", "1", "50");
		dietInfo.setDietInfo("Sandra", "2", "60");
		dietInfo.setDietInfo("Lucas", "4", "80");
		dietInfo.mostrarInfo();

		System.out.println("Retirando a 3º linha");
		dietInfo.desfazerEscrita();
		dietInfo.mostrarInfo();

		System.out.println("Retirando a 2º linha");
		dietInfo.desfazerEscrita();
		dietInfo.mostrarInfo();
		
		System.out.println("Retirando a 1º linha");
		dietInfo.desfazerEscrita();
		dietInfo.mostrarInfo();

	}
	
	
}
