package proxy.exemplo01.service;

import java.util.Random;

public class BancoUsuarios {
	private int quantidadeDeUsuarios;
	private int usuariosConectados;

	public BancoUsuarios() {
		Random randNum = new Random();
		quantidadeDeUsuarios = randNum.nextInt(500);
		usuariosConectados = randNum.nextInt(20);
	}

	public void getNumeroDeUsuarios() throws Exception{
		System.out.println("Total de usuários: " + quantidadeDeUsuarios);
	}

	public void getUsuariosConectados() throws Exception{
		System.out.println("Usuários conectados: " + usuariosConectados);
	}

}
