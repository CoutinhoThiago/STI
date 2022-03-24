package testes.interessado;

public class Interessado {
	private String categoria;
	private String nomeInteressado;
	private boolean notificarInteresado;
	private String email;
	private String cpf;
	
	public Interessado(String categoria, String nomeInteressado, boolean notificarInteresado, String email, String cpf) {
		this.categoria = categoria;
		this.nomeInteressado = nomeInteressado;
		this.notificarInteresado = notificarInteresado;
		this.email = email;
		this.cpf = cpf;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNomeInteressado() {
		return nomeInteressado;
	}
	public void setNomeInteressado(String nomeInteressado) {
		this.nomeInteressado = nomeInteressado;
	}
	public boolean isNotificarInteresado() {
		return notificarInteresado;
	}
	public void setNotificarInteresado(boolean notificarInteresado) {
		this.notificarInteresado = notificarInteresado;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}

