package questao03;

import questao03.singleton.ConexoesUsuarios;
import questao03.singleton.Usuario;

public class Cliente {
	public static void main(String[] args) {
		
		ConexoesUsuarios conexoes = ConexoesUsuarios.getInstance();
		
		Usuario user1 = new Usuario("Hiago", "hiago@email.com", "(34) 123456789");
		Usuario user2 = new Usuario("Adriele", "adriele@email.com", "(35) 0125422314");
		Usuario user3 = new Usuario("Gabriel", "gabriel@email.com", "(37) 987456321");
		
		conexoes.conectarUsuario(user1);
		conexoes.conectarUsuario(user2);
		conexoes.conectarUsuario(user3);
		
		conexoes.desconectarUsuario(user1);
		
		for(Usuario usuario : conexoes.getUsuarios())
			System.out.println(usuario.toString());
		
	;
	}
}
