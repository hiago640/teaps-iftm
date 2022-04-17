package proxy.exemplo01;

import proxy.exemplo01.proxy.BancoProxy;
import proxy.exemplo01.service.BancoUsuarios;

public class Cliente {
	
	public static void main(String[] args) {
		BancoUsuarios banco;
		
		try {
			System.out.println("Acessando como Hacker");
			banco = new BancoProxy("Hacker", "12345");
			banco.getNumeroDeUsuarios();
			banco.getUsuariosConectados();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			System.out.println("Acessando como Usuário autorizado");
			banco = new BancoProxy("admin", "admin");
			banco.getNumeroDeUsuarios();
			banco.getUsuariosConectados();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
