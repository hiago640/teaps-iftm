package stategy.exemplo01.context;

import stategy.exemplo01.strategy.grasnar.GrasnarRealmente;
import stategy.exemplo01.strategy.voar.VoarAsas;

public class PatoMallard extends Pato{

	public PatoMallard() {
		comportamentoGrasnar = new GrasnarRealmente();
		comportamentoVoar = new VoarAsas();
	}
	
	@Override
	public void display() {
		System.out.println("Eu sou um pato Mallard");
	}
	
}
