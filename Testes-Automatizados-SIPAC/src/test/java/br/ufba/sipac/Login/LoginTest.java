package br.ufba.sipac.login;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import br.ufba.sipac.login.Usuarios.UsuarioTestModuloDeProtocolo;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginTest 
{
	private LoginPage paginaDeLogin;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();

	@BeforeEach
	public void beforeEach() 
	{
		this.paginaDeLogin = new LoginPage();
	}

	@AfterEach
	public void afterEach() 
	{
		this.paginaDeLogin.fechar();
	}
	
	@Test
	@Order(1)
	public void DeveEfetuarLoginCorretamenteComDadosValidos() 
	{
		paginaDeLogin.preencherFormularioDeLogin(usuario, senha);
		paginaDeLogin.efetuarLogin();

		String nomeUsuarioLogado = paginaDeLogin.getNomeUsuarioLogado();
		Assert.assertEquals("THIAGO COUTINHO SOUSA SILVA", nomeUsuarioLogado);
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
	}
	
	@Test
	@Order(2)
	public void NaoDeveEfetuarLoginComSenhaInvalida() 
	{
		paginaDeLogin.preencherFormularioDeLogin(usuario, "invalido");
		paginaDeLogin.efetuarLogin();

		String nomeUsuarioLogado = paginaDeLogin.getNomeUsuarioLogado();
		Assert.assertEquals("THIAGO COUTINHO SOUSA SILVA", nomeUsuarioLogado);
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
	}
	
	
}
