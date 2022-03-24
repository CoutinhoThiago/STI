package testes.login.steps;

import io.cucumber.java.pt.Quando;
import testes.login.pages.LoginPage;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

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

	//Contexto
	@Dado("^um usuario na pagina de login$")
	public void um_usuario_na_pagina_de_login() throws Throwable {
		this.paginaDeLogin.caminhoAteAPaginaDeLogin();
	}
	
	//Tentar logar sem credenciais
	@Dado("um usuario que nao possui credenciais")
	public void um_usuario_que_nao_possui_credenciais() throws Throwable {
	}
		@Quando("deixar os campos em branco")
		public void deixar_os_campos_em_branco() throws Throwable {
			
		}
		@Quando("clica em entrar")
		public void clica_em_entrar() throws Throwable {
			this.paginaDeLogin.efetuarLogin();
		}
			@Entao("o usuario deve permanecer na paina de login")
			public void o_usuario_deve_permanecer_na_paina_de_login() throws Throwable {
			}
			@Entao("a mensagem de erro {string} deve aparecer")
			public void a_mensagem_de_erro_deve_aparecer(String string) throws Throwable {
			}
	
	//Tentar logar com as credenciais incorretas
	@Dado("um usuario que possui as credenciais incorretas")
	public void um_usuario_que_possui_as_credenciais_incorretas() throws Throwable {
	}
		@Quando("preenche os campos com as credenciais incorretas")
		public void preenche_os_campos_com_as_credenciais_incorretas(DataTable tabelaDeUsuarios) throws Throwable {
			List<Map<String, String>> valores = tabelaDeUsuarios.asMaps();
			for (Map<String, String> mapa : valores) {
				String login = mapa.get("login");
				String senha = mapa.get("senha");
				
				this.paginaDeLogin.preencherFormularioDeLogin(login, senha);
			}
		}
		//@Quando("^clica em entrar$")
		//public void clica_em_entrar() throws Throwable {}
			//@Entao("^o usuario deve permanecer na paina de login$")
			//public void o_usuario_deve_permanecer_na_paina_de_login() throws Throwable {}
			//@Entao("^a mensagem de erro correta deve aparecer$")
			//public void a_mensagem_de_erro_correta_deve_aparecer() throws Throwable {}
	
	//Logar com as credenciais corretas		
	@Dado("um usuario que possui as credenciais corretas")
	public void um_usuario_que_possui_as_credenciais_corretas() throws Throwable {
	}
		@Quando("preenche os campos com as credenciais corretas")
		public void preenche_os_campos_com_as_credenciais_corretas(DataTable tabelaDeUsuarios) throws Throwable {
			List<Map<String, String>> valores = tabelaDeUsuarios.asMaps();
			for (Map<String, String> mapa : valores) {
				String login = mapa.get("login");
				String senha = mapa.get("senha");
		}
		}
		//@Quando("^clica em entrar$")
		//public void clica_em_entrar() throws Throwable {}
			@Entao("o usuario deve ser redirecionado para a pagina inicial do sipac")
			public void o_usuario_deve_ser_redirecionado_para_a_pagina_inicial_do_sipac() throws Throwable {
			}
			@Entao("deve ser mostrado como usuario logado")
			public void deve_ser_mostrado_como_usuario_logado() throws Throwable {
			}
}
