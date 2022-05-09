package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos.Interessado;

public class Interessado 
{
	private String categoria;
	private String cpf;
	private String nome;
	private Boolean notificar;
	private String email;
	
	public Interessado(String categoria, String cpf, String nome, Boolean notificar, String email) 
	{
		this.categoria = categoria;
		this.cpf = cpf;
		this.nome = nome;
		this.notificar = notificar;
		this.email = email;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Boolean getNotificar() {
		return notificar;
	}

	public String getEmail() {
		return email;
	}
}
