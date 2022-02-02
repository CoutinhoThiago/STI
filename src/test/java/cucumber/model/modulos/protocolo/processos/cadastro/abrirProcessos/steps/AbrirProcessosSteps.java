package cucumber.model.modulos.protocolo.processos.cadastro.abrirProcessos.steps;

import java.util.List;
import java.util.Map;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.interessado.Interessado;
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
		//this.abrirProcessos.fechar();
	}
	
	//Contexto geral 1
	@Dado("um usuario valido logado")
	public void um_usuario_valido_logado(DataTable tabelaDeUsuarios) {
		List<Map<String, String>> valores = tabelaDeUsuarios.asMaps();
		for (Map<String, String> mapa : valores) {
			String login = mapa.get("login");
			String senha = mapa.get("senha");
				
			this.abrirProcessos.efetuarLogin(login, senha);
		}
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
		this.abrirProcessos.irDaMesaVirtualParaAPrimeiraPadinaDeAbrirProcessos();
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
	
	//Contexto geral 2
	@Quando("o usuario estiver na primeira pagina de abrir processos")
	public void o_usuario_estiver_na_primeira_pagina_de_abrir_processos() {
		this.abrirProcessos.irParaPaginaDeAbrirProcessosContexto();
	}
	
	//Botes
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
		//Botao remover Classificacao CONARQ
		@Quando("clicar em no botao Remover Classificacao CONARQ")
		public void clicar_em_no_botao_remover_classificacao_conarq() {
		}
		@Entao("a Classificacao CONARQ deve ser removida")
		public void a_classificacao_conarq_deve_ser_removida() {
		}
	
	
	//Interessado
		//Adicionar interessado
		@Quando("preencher o formulario de Dados do Interessado")
		public void preencher_o_formulario_de_dados_do_interessado() throws InterruptedException {
			String categoria = "Servidor"; // Aluno, Credor, Unidade, Outros
			String nomeInteressado = "ELEILDES SILVA DE SOUZA";
			boolean notificarInteresado = true; //false
			String email = "eleildes.souza!!@hotmail.com";
			Interessado interessado = new Interessado(categoria, nomeInteressado, notificarInteresado, email);
			this.abrirProcessos.preencherFormularioDeDadosDoInteressado(interessado);
		}
		@Quando("clicar no botao inserir")
		public void clicar_no_botao_inserir() {
			this.abrirProcessos.botaoInserirInteressado();
		}
		@Entao("a mensagem {string} deve aparecer")
		public void a_mensagem_deve_aparecer(String string) {
		}
		@Entao("o interessado deve ser inserido")
		public void o_interessado_deve_ser_inserido() {;
		}
		//Remover interessado
		@Quando("adicionar um interessado do tipo {string}")
		public void adicionar_um_interessado_do_tipo(String string) throws InterruptedException {
			String categoria = "Servidor"; // Aluno, Credor, Unidade, Outros
			String nomeInteressado = "ELEILDES SILVA DE SOUZA";
			boolean notificarInteresado = true; //false
			String email = "eleildes.souza!!@hotmail.com";
			Interessado interessado = new Interessado(categoria, nomeInteressado, notificarInteresado, email);
			this.abrirProcessos.preencherFormularioDeDadosDoInteressado(interessado);
			this.abrirProcessos.botaoInserirInteressado();
		}
		@Quando("clicar no botao excluir")
		public void clicar_no_botao_excluir() {
			this.abrirProcessos.botaoExcluirInteressado();
		}
		@Quando("confirmar o Alert")
		public void confirmar_o_alert() {
			this.abrirProcessos.confirmarAlert();
		}
		@Entao("a mensagem de erro {string} deve aparecer")
		public void a_mensagem_de_erro_deve_aparecer(String string) {
		}
		@Entao("o interessado deve ser excluido")
		public void o_interessado_deve_ser_excluido() {
		}
	
	//Abrir um processo
		//Abrir um processo corretamente com um interessado do tipo correto adicionado
		@Quando("Adicionar um interessado do tipo {string} {string} {string} {string} {string}")
		public void adicionar_um_interessado_do_tipo(String tipo, String nome, String notificar, String email, String cpf) throws InterruptedException {
		}
		@Quando("preenche os campos com os dados corretos {string} {string} {string}")
		public void preenche_os_campos_com_os_dados_corretos(String natureza, String hipoteseLegal, String grauDeSigilo) throws InterruptedException {
		}
		@Quando("clicar no botao continuar")
		public void clicar_no_botao_continuar() {
		}
}
