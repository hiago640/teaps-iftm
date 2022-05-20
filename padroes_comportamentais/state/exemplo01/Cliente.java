package state.exemplo01;

import state.exemplo01.context.Mario;

public class Cliente {

	public static void main(String[] args) {
		
		Mario mario = new Mario();
		mario.pegarCogumelo();
		mario.pegarPena();
		mario.levarDano();
		mario.pegarFlor();
		mario.pegarCogumelo();
		mario.levarDano();
		mario.pegarPena();
		mario.levarDano();
		mario.levarDano();
		mario.levarDano();
		
	}
	
}
