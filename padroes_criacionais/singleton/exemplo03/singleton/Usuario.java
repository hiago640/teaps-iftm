package singleton.exemplo03.singleton;

public class Usuario {
	private String nome;
	private String email;
	private String telefone;

	public Usuario(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}

}
