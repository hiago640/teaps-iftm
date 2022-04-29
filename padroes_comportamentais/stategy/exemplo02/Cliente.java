package stategy.exemplo02;

import stategy.exemplo02.context.Fragil;
import stategy.exemplo02.context.GrandeExercito;
import stategy.exemplo02.context.Inimigo;
import stategy.exemplo02.context.Nuclear;

public class Cliente {

	public static void main(String[] args) {
		
		Inimigo inimigoNuclear = new Nuclear();
		Inimigo inimigoGrandeExercito = new GrandeExercito();
		Inimigo inimigoFragil = new Fragil();
		
		inimigoNuclear.informacoes();
		inimigoNuclear.iniciarGuerra();
		inimigoNuclear.concluirGuerra();
		
		System.out.println("\n\n");
		
		inimigoGrandeExercito.informacoes();
		inimigoGrandeExercito.iniciarGuerra();
		inimigoGrandeExercito.concluirGuerra();
		
		System.out.println("\n\n");
		
		inimigoFragil.informacoes();
		inimigoFragil.iniciarGuerra();
		inimigoFragil.concluirGuerra();
	}
}
