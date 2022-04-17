package proxy.exemplo01.proxy;

import proxy.exemplo01.service.BancoUsuarios;

public class BancoProxy extends BancoUsuarios {

	public String usuario;
	public String senha;

	public BancoProxy(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public void getNumeroDeUsuarios() throws Exception {

		if (!isAuthenticated())
			throw new Exception("Usuário não possui acesso!");

		super.getNumeroDeUsuarios();

	};

	@Override
	public void getUsuariosConectados() throws Exception {

		if (!isAuthenticated())
			throw new Exception("Usuário não possui acesso!");
		
		super.getUsuariosConectados();

	}

	public boolean isAuthenticated() {
		return (usuario.equals("admin") && senha.equals("admin"));
	}

}
