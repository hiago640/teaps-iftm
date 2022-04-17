package bridge.exemplo02;

import bridge.exemplo02.abstraction.JanelaAbstrata;
import bridge.exemplo02.abstraction.JanelaAviso;
import bridge.exemplo02.abstraction.JanelaDialogo;
import bridge.exemplo02.implementation.JanelaLinux;
import bridge.exemplo02.implementation.JanelaWindows;

public class Cliente {
	
	public static void main(String[] args) {
		System.out.println("\nGerando Janela de Dialogo no Linux");
		JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
		janela.desenhar();
		
		System.out.println("\nGerando Janela de Aviso no Windows ");
		janela = new JanelaAviso(new JanelaWindows());
		janela.desenhar();
	}
}
