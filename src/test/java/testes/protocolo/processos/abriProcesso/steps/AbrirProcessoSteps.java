package testes.protocolo.processos.abriProcesso.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import testes.interessado.Interessado;
import testes.protocolo.processos.abriProcesso.pages.AbrirProcessoPage;

public class AbrirProcessoSteps {
	AbrirProcessoPage abrirProcessos;
	Interessado interessado;
	
	@Before
	public void antesDeTudo() {
		this.abrirProcessos = new AbrirProcessoPage(null);
	}
	@After
	public void fim() {
		this.abrirProcessos.fechar();
	}
	
	//Contexto Geral
	@Dado("um usuario que possui as credenciais corretas logado")
	public void um_usuario_que_possui_as_credenciais_corretas_logado(DataTable tabelaDeUsuarios) {
		List<Map<String, String>> valores = tabelaDeUsuarios.asMaps();
		for (Map<String, String> mapa : valores) {
			String login = mapa.get("login");
			String senha = mapa.get("senha");
				
			this.abrirProcessos.efetuarLogin(login, senha);
		}
	}
	
	//Caminhos ate a Primeira Pagina de Abrir Processo
	//modulo de protocolo
	@Quando("seguir o caminho: modulos > protocolo > menu > processos > cadastro > abrir processo")
	public void seguir_o_caminho_modulos_protocolo_menu_processos_cadastro_abrir_processo() throws InterruptedException {
		this.abrirProcessos.irParaOModuloDeProtocolo();	
		this.abrirProcessos.selecionarOpcaoMenu();	
		this.abrirProcessos.selecionarAbaCorreta();
		this.abrirProcessos.selecionarFuncaoCorreta();
	}
	@Entao("o usuario devera ser redirecionado para a primeira pagina de abrir pocesso pelo modulo de protocolo")
	public void o_usuario_devera_ser_redirecionado_para_a_primeira_pagina_de_abrir_pocesso_pelo_modulo_de_protocolo() {
		String url = this.abrirProcessos.getUrl();
		System.out.println(url);
		boolean funcionou = false;
		System.out.println(funcionou);
		Assert.assertTrue(url.equals("https://homologacaosipac.ufba.br/sipac/protocolo/menu.jsf"));
	}
	//portal adiministrativo
	@Quando("seguir o caminho: portal adiministrativo > protocolo > processos > abrir processo")
	public void seguir_o_caminho_portal_adiministrativo_protocolo_processos_abrir_processo() {
		this.abrirProcessos.irParaOPortalAdiministrativo();	
		this.abrirProcessos.mouseHoverAbrirProcessos();
	}
	@Entao("o usuario devera ser redirecionado para a primeira pagina de abrir pocesso pelo portal adiministrativo")
	public void o_usuario_devera_ser_redirecionado_para_a_primeira_pagina_de_abrir_pocesso_pelo_portal_adiministrativo() {
		String url = this.abrirProcessos.getUrl();
		System.out.println(url);
		boolean funcionou = false;
		System.out.println(funcionou);
		Assert.assertTrue(url.equals("https://homologacaosipac.ufba.br/sipac/portal_administrativo/index.jsf"));
	}
	//mesa virtual
	@Quando("seguir o caminho: mesa virtual > processos > abrir processos")
	public void seguir_o_caminho_mesa_virtual_processos_abrir_processos() {
		this.abrirProcessos.irParaAMesaVirtual();
		this.abrirProcessos.irDaMesaVirtualParaAPrimeiraPadinaDeAbrirProcessos();
	}
	@Entao("o usuario devera ser redirecionado para a primeira pagina de abrir pocesso pela mesa virtual")
	public void o_usuario_devera_ser_redirecionado_para_a_primeira_pagina_de_abrir_pocesso_pela_mesa_virtual() {
		String url = this.abrirProcessos.getUrl();
		System.out.println(url);
		boolean funcionou = false;
		System.out.println(funcionou);
		Assert.assertTrue(url.equals("https://homologacaosipac.ufba.br/sipac/protocolo/mesa_virtual/lista.jsf"));
	}
	
	//Contexto Primeira pagina de Aprir Processo 
	@Dado("o usuario na primeira pagina de abrir processos")
	public void o_usuario_na_primeira_pagina_de_abrir_processos() {
		this.abrirProcessos.vaiParaPrimeiraPaginaDeAbrirProcessoRapido();	
	}
	
//Botoes primeira pagina de abrir processos
	//Botao Cancelar
	@Quando("clicar no botao cancelar")
	public void clicar_no_botao_cancelar() {
		this.abrirProcessos.botaoCancelar();
	}
	@Quando("confirmar o pop-up")
	public void confirmar_o_pop_up() {
		this.abrirProcessos.confirmarAlert();
	}
	@Entao("o usuario devera ser redirecionado para a pagina inicial da mesa virtual")
	public void o_usuario_devera_ser_redirecionado_para_a_pagina_inicial_da_mesa_virtual() {
	}
	//Botao Remover Classificacao CONARQ
	@Quando("adicionar uma classificacao CONARQ")
	public void adicionar_uma_classificacao_conarq() throws InterruptedException {
		this.abrirProcessos.adicionarClassificacaoConarq();
	}
	@Quando("clicar em no botao Remover Classificacao CONARQ")
	public void clicar_em_no_botao_remover_classificacao_conarq() throws InterruptedException {
		this.abrirProcessos.botaoRemoverClassificacao();
	}
	@Entao("a Classificacao CONARQ deve ser removida")
	public void a_classificacao_conarq_deve_ser_removida() {
	}
	@Entao("a mensagem de classificacao CONARQ removida deve aparecer")
	public void a_mensagem_de_classificacao_conarq_removida_deve_aparecer() {
	}
	
//Interessado
	//Botao inserir interessado
	@Quando("clicar no botao inserir")
	public void clicar_no_botao_inserir() {
		this.abrirProcessos.botaoInserirInteressado();
	}
	//Tentar adicionar interessado sem dados
	@Quando("deixar o formulario de Dados do Interessado em branco")
	public void deixar_o_formulario_de_dados_do_interessado_em_branco() {
	}
	@Entao("a mensagem interessado campo obrigatorio nao informado deve aparecer")
	public void a_mensagem_interessado_campo_obrigatorio_nao_informado_deve_aparecer() {
	}
	@Entao("a mensagem email obrigatorio nao informado deve aparecer")
	public void a_mensagem_email_obrigatorio_nao_informado_deve_aparecer() {
	}
	//Adicionar Interessado corretamente
	@Quando("preencher o formulario de Dados do Interessado")
	public void preencher_o_formulario_de_dados_do_interessado() throws InterruptedException {
		interessado = new Interessado(null, null, false, null, null);
		this.abrirProcessos.categoriaDeInteressado(interessado);
		this.abrirProcessos.nomeDoInteressado(interessado);
		this.abrirProcessos.notificarInteressado(interessado);
	}
	@Entao("o interessado deve ser inserido")
	public void o_interessado_deve_ser_inserido() {
	}
	@Entao("a mensagem interessado adicionado com sucesso deve aparecer")
	public void a_mensagem_interessado_adicionado_com_sucesso_deve_aparecer() {
	}
	//Remover Interessado
	@Quando("inserir um interessado do tipo {string}")
	public void inserir_um_interessado_do_tipo(String string) throws InterruptedException {
		this.abrirProcessos.categoriaDeInteressado(interessado);
		this.abrirProcessos.nomeDoInteressado(interessado);
		this.abrirProcessos.notificarInteressado(interessado);
		
		this.abrirProcessos.botaoInserirInteressado();
	}
	@Quando("clicar no botao Remover Interessado")
	public void clicar_no_botao_remover_interessado() {
		this.abrirProcessos.botaoRemoverInteressado();
	}
	@Entao("o interessado deve ser removido")
	public void o_interessado_deve_ser_removido() {
	}
	@Entao("a mensagem interessado removido com sucesso deve aparecer")
	public void a_mensagem_interessado_removido_com_sucesso_deve_aparecer() {
	}
	
//Abrir Processo
	@Dado("um interessado do tipo {string} adicionado")
	public void um_interessado_do_tipo_adicionado(String string) {
	}
	@Quando("selecionar a opcao precesso {string}")
	public void selecionar_a_opcao_precesso(String string) {
	}
	@Quando("preencher o forrmilario de abrir processo")
	public void preencher_o_forrmilario_de_abrir_processo() {
	}
	@Quando("clicar em continuar")
	public void clicar_em_continuar() {
	}
	@Entao("o usuario deve ser redirecionado para segunda pagina de abrir processos")
	public void o_usuario_deve_ser_redirecionado_para_segunda_pagina_de_abrir_processos() {
	}
	@Entao("os dados cadastrados no formulario Dados Gerais do Processo estao corretos")
	public void os_dados_cadastrados_no_formulario_dados_gerais_do_processo_estao_corretos() {
	}
	@Entao("os dados cadastrados no formulario Dados do Interessado estao corretos")
	public void os_dados_cadastrados_no_formulario_dados_do_interessado_estao_corretos() {
	}
}


















































