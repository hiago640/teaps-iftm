package stategy.exemplo01.context;

import stategy.exemplo01.strategy.grasnar.ComportamentoGrasnar;
import stategy.exemplo01.strategy.voar.ComportamentoVoar;

public abstract class Pato {
	public ComportamentoVoar comportamentoVoar;
	public ComportamentoGrasnar comportamentoGrasnar;
	
	public void nadar() {
		System.out.println("NADA");
	}
	
	public abstract void display();
	
	public void executarVoo() {
		comportamentoVoar.voar();
	}
	
	public void grasnar() {
		comportamentoGrasnar.grasnar();
	}
}
