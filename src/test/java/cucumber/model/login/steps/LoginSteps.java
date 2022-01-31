package cucumber.model.login.steps;

import java.util.List;
import java.util.Map;

import cucumber.model.login.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	LoginPage paginaDeLogin;
	
	@Before("@login")
	public void antesDeTudo() {
		this.paginaDeLogin = new LoginPage(null);
	}
	@After("@login")
	public void fim() {
		this.paginaDeLogin.fechar();
	}
	
	//Before(() -> {
	//	this.paginaDeLogin = new LoginPage();
	//});
	
	@Dado("um usuario valido na pagina de login")
	public void um_usuario_valido() {
		this.paginaDeLogin.caminhoAteAPaginaDeLogin();
	}
	@Quando("usuario preenche os campos com os dados corretos")
	public void usuario_preenche_os_campos_com_os_dados_corretos(DataTable tabelaDeUsuarios) {
		List<Map<String, String>> valores = tabelaDeUsuarios.asMaps();
		for (Map<String, String> mapa : valores) {
			String login = mapa.get("login");
			String senha = mapa.get("senha");
			
			this.paginaDeLogin.preencherFormularioDeLogin(login, senha);
		}
	}
	@Quando("clicar no botao entrar")
	public void clicar_no_botao_entrar() {
		this.paginaDeLogin.efetuarLogin();
	}
	@Entao("o usuario deveria ser redirecionado para a pagina inicial do sipac")
	public void o_usuario_deveria_ser_redirecionado_para_a_pagina_inicial_do_sipac() {
	}
}
