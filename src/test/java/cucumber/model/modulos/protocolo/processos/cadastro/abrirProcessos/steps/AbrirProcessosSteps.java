package cucumber.model.modulos.protocolo.processos.cadastro.abrirProcessos.steps;

import java.util.List;
import java.util.Map;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.model.login.pages.LoginPage;
import cucumber.model.modulos.protocolo.processos.cadastro.abrirProcessos.pages.AbrirProcessosPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AbrirProcessosSteps {
	AbrirProcessosPage abrirProcessos;
	
	@Before("@abrirProcessos")
	public void antesDeTudo() {
		this.abrirProcessos = new AbrirProcessosPage(null);
	}
	@After("@abrirProcessos")
	public void fim() {
		this.abrirProcessos.fechar();
	}
	
	//Contexto
	@Dado("um usuario valido logado")
	public void um_usuario_valido_logado(DataTable tabelaDeUsuarios) {
		this.abrirProcessos.caminhoAteAPaginaDeLogin();
			List<Map<String, String>> valores = tabelaDeUsuarios.asMaps();
			for (Map<String, String> mapa : valores) {
				String login = mapa.get("login");
				String senha = mapa.get("senha");
				
				this.abrirProcessos.preencherFormularioDeLogin(login, senha);
			}
		this.abrirProcessos.efetuarLogin();
	}
	
	//caminho funcionando corretamente
	@Quando("seguir pelo caminho do modulo de protocolo")
	public void seguir_pelo_caminho_do_modulo_de_protocolo() throws InterruptedException {
		this.abrirProcessos.irParaOModuloDeProtocolo();	
		this.abrirProcessos.selecionarOpcaoMenu();	
		this.abrirProcessos.selecionarAbaCorreta();
		this.abrirProcessos.selecionarFuncaoCorreta();
	}
	@Quando("seguir pelo caminho do portal adiministrativo")
	public void seguir_pelo_caminho_do_portal_adiministrativo() {
		this.abrirProcessos.irParaOPortalAdiministrativo();	
		this.abrirProcessos.mouseHoverAbrirProcessos();
	}
	@Quando("seguir pelo caminho da mesa virtual")
	public void seguir_pelo_caminho_da_mesa_virtual() {
		this.abrirProcessos.irParaAMesaVirtual();
		//this.abrirProcessos.irDaMesaVirtualParaAPrimeiraPadinaDeAbrirProcessos();
	}
	@Entao("devera chegar na primeira pagina de abrir processos")
	public void devera_chegar_na_primeira_pagina_de_abrir_processos() {
		String url = this.abrirProcessos.getUrl();
		System.out.println(url);
		boolean funcionou = false;
		System.out.println(funcionou);
		Assert.assertTrue(
				(url.equals("https://homologacaosipac.ufba.br/sipac/protocolo/menu.jsf")) || 
				(url.equals("https://homologacaosipac.ufba.br/sipac/portal_administrativo/index.jsf")) || 
				(url.equals("https://homologacaosipac.ufba.br/sipac/protocolo/mesa_virtual/lista.jsf")));
	}
	
	//Contexto 2
		@Quando("o usuario estiver na primeira pagina de abrir processos")
		public void o_usuario_estiver_na_primeira_pagina_de_abrir_processos() {
		}
	
	//Botão cancelar funcionando
	@Quando("clicar em no botao cancelar")
	public void clicar_em_no_botao_cancelar() {
	}
	@Quando("confirmar o pop-up")
	public void confirmar_o_pop_up() {
	}
	@Entao("o usuario deve retornar para a pagina inicial do sipac")
	public void o_usuario_deve_retornar_para_a_pagina_inicial_do_sipac() {
	}

	//Esquema de cenário
	//Abrir um processo corretamente com um servidor do tipo correto adicionado
	@Quando("Adicionar um usuario do tipo {string}")
	public void adicionar_um_usuario_do_tipo(String string) {
	}
	@Quando("preenche os campos com os dados corretos")
	public void preenche_os_campos_com_os_dados_corretos() {
	}
	@Quando("clicar no botao continuar")
	public void clicar_no_botao_continuar() {
	}
}
