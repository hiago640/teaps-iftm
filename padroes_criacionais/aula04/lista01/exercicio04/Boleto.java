package aula04.lista01.exercicio04;

public class Boleto {

	float valor;
	String sacado;
	String cedente;
	String vencimento;
	String codigoDeBarras;

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getSacado() {
		return sacado;
	}

	public void setSacado(String sacado) {
		this.sacado = sacado;
	}

	public String getCedente() {
		return cedente;
	}

	public void setCedente(String cedente) {
		this.cedente = cedente;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	@Override
	public String toString() {
		return "Boleto [valor=" + valor + ", sacado=" + sacado + ", cedente=" + cedente + ", vencimento=" + vencimento
				+ ", codigoDeBarras=" + codigoDeBarras + "]";
	}

	
}
