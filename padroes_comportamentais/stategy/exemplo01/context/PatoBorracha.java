package stategy.exemplo01.context;

import stategy.exemplo01.strategy.grasnar.GrasnarMudo;
import stategy.exemplo01.strategy.voar.VoarNao;

public class PatoBorracha extends Pato{

	public PatoBorracha() {
		comportamentoGrasnar = new GrasnarMudo();
		comportamentoVoar = new VoarNao();
	}
	
	@Override
	public void display() {
		System.out.println("Eu sou um pato de borracha");
	}
	

}
