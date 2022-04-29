package stategy.exemplo01;

import stategy.exemplo01.context.Pato;
import stategy.exemplo01.context.PatoBorracha;
import stategy.exemplo01.context.PatoMallard;

public class Cliente {
	
	public static void main(String[] args) {
		Pato patoBorracha = new PatoBorracha();
		Pato patoMallard = new PatoMallard();
		
		patoBorracha.display();
		patoBorracha.executarVoo();
		patoBorracha.grasnar();
		
		System.out.println();
		
		patoMallard.display();
		patoMallard.executarVoo();
		patoMallard.grasnar();
	}
	
}
