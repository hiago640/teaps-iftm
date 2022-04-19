package questao03.singleton;

import java.util.ArrayList;
import java.util.List;

public class ConexoesUsuarios {

	private static List<Usuario> usuariosConectados = new ArrayList<>();

	private ConexoesUsuarios() {

	}

	private static ConexoesUsuarios uniqueInstance;

	public static ConexoesUsuarios getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new ConexoesUsuarios();
		return uniqueInstance;
	}

	public void conectarUsuario(Usuario usuario) {
		usuariosConectados.add(usuario);
	}
	
	public void desconectarUsuario(Usuario usuario) {
		usuariosConectados.remove(usuario);
	}
	
	public List<Usuario> getUsuarios(){
		return usuariosConectados;
	}
}
