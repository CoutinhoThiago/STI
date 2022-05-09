package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import org.junit.jupiter.api.MethodOrderer;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;
import br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos.Interessado.Interessado;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AbrirProcessoTest 
{		
	private AbrirProcessoPage abrirProcessos;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.abrirProcessos = new AbrirProcessoPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.abrirProcessos.fechar();
	}
	
	@Test
	@Order(1)
	public void CaminhosFuncionandoCorretamente()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
	}

	@Test
	@Order(2)
	public void DeveAdicionarServidorInteressadoComDadosCorretos() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Servidor", "", "ELIEIDE SANTOS ORRICO", true, "elieide.orrico!!@ufba.br"));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("1574037", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Servidor", tipoInteressadoLogado);
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
	}
	@Test
	@Order(3)
	public void DeveRemoverServidorInteressadoComDadosCorretos() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Servidor", "", "ELIEIDE SANTOS ORRICO", true, "elieide.orrico!!@ufba.br"));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("1574037", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Servidor", tipoInteressadoLogado);
		
		//String mensagem = abrirProcessos.getMensagem();
		//Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
		
		this.abrirProcessos.removerInteressado();
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado removido com sucesso.", mensagem);
	}
	@Test
	@Order(4)
	public void DeveAdicionarServidorInteressadoComDadosCorretosENaoInformarOServidorInteressado() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Servidor", "", "ELIEIDE SANTOS ORRICO", false, ""));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("1574037", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("---", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Servidor", tipoInteressadoLogado);
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
	}
	@Test
	@Order(5)
	public void DeveRemoverServidorInteressadoComDadosCorretosENaoInformarOServidorInteressado() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Servidor", "", "ELIEIDE SANTOS ORRICO", false, ""));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("1574037", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("---", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Servidor", tipoInteressadoLogado);
		
		//String mensagem = abrirProcessos.getMensagem();
		//Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
		
		this.abrirProcessos.removerInteressado();
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado removido com sucesso.", mensagem);
	}
	@Test
	@Order(6)
	public void NaoDeveAdicionarServidorInteressadoPorFaltaDeDadosDoServidor() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Servidor", "", "", true, "elieide.orrico!!@ufba.br"));
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		//Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoServidor());
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Servidor: Campo obrigatório não informado.", mensagem);
	}
	@Test
	@Order(7)
	public void NaoDeveAdicionarServidorInteressadoPorFaltaDeDadosDoEmail() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Servidor", "", "ELIEIDE SANTOS ORRICO", true, ""));
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		//Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComEroPorFaltaDeDadosDoEmail());
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("E-mail: Campo obrigatório não informado.", mensagem);
	}
	
	@Test
	@Order(8)
	public void DeveAdicionarAlunoInteressadoComDadosCorretos() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Aluno", "", "ELIEIDE SANTOS ORRICO", true, "elieide.orrico!!@ufba.br"));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("212215251", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Aluno Pós-Graduação", tipoInteressadoLogado);
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
	}
	@Test
	@Order(9)
	public void DeveRemoverAlunoInteressadoComDadosCorretos() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Aluno", "", "ELIEIDE SANTOS ORRICO", true, "elieide.orrico!!@ufba.br"));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("212215251", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Aluno Pós-Graduação", tipoInteressadoLogado);
		
		this.abrirProcessos.removerInteressado();
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado removido com sucesso.", mensagem);
	}
	@Test
	@Order(10)
	public void DeveAdicionarAlunoInteressadoComDadosCorretosENaoInformarOAlunoInteressado() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Aluno", "", "ELIEIDE SANTOS ORRICO", false, "elieide.orrico!!@ufba.br"));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("212215251", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("---", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Aluno Pós-Graduação", tipoInteressadoLogado);
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
	}
	@Test
	@Order(11)
	public void DeveRemoverAlunoInteressadoComDadosCorretosENaoInformarOAlunoInteressado() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Aluno", "", "ELIEIDE SANTOS ORRICO", false, "elieide.orrico!!@ufba.br"));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("212215251", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		//String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		//Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Aluno Pós-Graduação", tipoInteressadoLogado);
		
		this.abrirProcessos.removerInteressado();
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado removido com sucesso.", mensagem);
	}
	@Test
	@Order(12)
	public void NaoDeveAdicionarAlunoInteressadoPorFaltaDeDadosDoAluno() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Aluno", "", "", true, "elieide.orrico!!@ufba.br"));
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		//Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoServidor());
	
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Aluno: Campo obrigatório não informado.", mensagem);
	}
	@Test
	@Order(13)
	public void NaoDeveAdicionarAlunoInteressadoPorFaltaDeDadosDoEmail() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Aluno", "", "ELIEIDE SANTOS ORRICO", true, ""));
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		//Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComEroPorFaltaDeDadosDoEmail());
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("E-mail: Campo obrigatório não informado.", mensagem);
	}

	@Test
	@Order(14)
	public void DeveAdicionarCredorInteressadoComDadosCorretosENaoInformarOCredorInteressado() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Credor", "", "ASSEMBLÉIA LEGISLATIVA DO ESTADO DA BAHIA", false, ""));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("14.674.337/0001-99", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ASSEMBLÉIA LEGISLATIVA DO ESTADO DA BAHIA", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("---", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Credor", tipoInteressadoLogado);
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);

	}
	@Test
	@Order(15)
	public void DeveRemoverCredorInteressadoComDadosCorretosENaoInformarOCredorInteressado() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Credor", "", "ASSEMBLÉIA LEGISLATIVA DO ESTADO DA BAHIA", false, ""));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("14.674.337/0001-99", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ASSEMBLÉIA LEGISLATIVA DO ESTADO DA BAHIA", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("---", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Credor", tipoInteressadoLogado);
		
		//String mensagem = abrirProcessos.getMensagem();
		//Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
		
		this.abrirProcessos.removerInteressado();
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado removido com sucesso.", mensagem);
	}
	@Test
	@Order(16)
	public void NaoDeveAdicionarCredorInteressadoPorFaltaDeDadosDoCredor() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Credor", "", "", false, ""));
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Credor: Campo obrigatório não informado.", mensagem);
	}
	/*@Test
	@Order(17)
	public void NaoDeveAdicionarCredorInteressadoPorFaltaDeDadosDoEmail()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarCredorInteressadoComFaltaDeDadosDoServidor();
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoEmail());
	}*/
	
	@Test
	@Order(18)
	public void DeveAdicionarUnidadeInteressadaComDadosCorretos() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Unidade", "", "SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA", true, "sti!!@ufba.br"));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("120142", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("sti!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Unidade", tipoInteressadoLogado);
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
	}
	@Test
	@Order(19)
	public void DeveRemoverUnidadeInteressadaComDadosCorretos() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Unidade", "", "SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA", true, "sti!!@ufba.br"));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("120142", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("sti!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Unidade", tipoInteressadoLogado);
		
		//String mensagem = abrirProcessos.getMensagem();
		//Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
		
		this.abrirProcessos.removerInteressado();
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado removido com sucesso.", mensagem);
	}
	@Test
	@Order(20)
	public void DeveAdicionarUnidadeInteressadaComDadosCorretosENaoInformarAUnidadeInteressada() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Unidade", "", "SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA", false, ""));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("120142", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("---", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Unidade", tipoInteressadoLogado);
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
	}
	@Test
	@Order(21)
	public void DeveRemoverUnidadeInteressadaComDadosCorretosENaoInformarAUnidadeInteressada() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Unidade", "", "SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA", false, ""));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("120142", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("---", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Unidade", tipoInteressadoLogado);
		
		//String mensagem = abrirProcessos.getMensagem();
		//Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
		
		this.abrirProcessos.removerInteressado();
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado removido com sucesso.", mensagem);
	}
	@Test
	@Order(22)
	public void NaoDeveAdicionarUnidadeInteressadoComFaltaDeDadosDaUnidade() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Unidade", "", "", true, "sti!!@ufba.br"));

		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		//Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoServidor());
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Unidade: Campo obrigatório não informado.", mensagem);
	}
	@Test
	@Order(23)
	public void NaoDeveAdicionarUnidadeInteressadoPorFaltaDeDadosDoEmail() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Unidade", "", "SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA", true, ""));
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		//Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComEroPorFaltaDeDadosDoEmail());
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("E-mail: Campo obrigatório não informado.", mensagem);
	}

	/*@Test
	@Order(24)
	public void DeveAdicionarOutrosInteressadoComDadosCorretos()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarOutrosInteressado();

		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComSucesso());
		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("1574037", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Servidor", tipoInteressadoLogado);
	}*/
	
	@Test
	@Order(25)
	public void DeveAdicionarServidorInteressadoEPreencherOFormularioComDadosCorretos() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Servidor", "", "ELIEIDE SANTOS ORRICO", true, "elieide.orrico!!@ufba.br"));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("1574037", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Servidor", tipoInteressadoLogado);
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
		
		this.abrirProcessos.preencherFormularioAbrirProcessosComTodosOsDadosCorretos();
	
		this.abrirProcessos.submeterFormularioAbrirProcessos();
		this.abrirProcessos.confirmarSubmicaoDeFormularioAbrirProcessos();
		
		Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		
		mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Processo cadastrado com sucesso.", mensagem);
		
		String numeroDeProtocolo = abrirProcessos.getNumeroDeProtocolo();
		//Assert.assertEquals("", numeroDeProtocolo);
		
		String origemdoProcesso = abrirProcessos.getOrigemdoProcesso();
		Assert.assertEquals("Interno", origemdoProcesso);
		String usuarioDeAtuacao = abrirProcessos.getUsuarioDeAtuacao();
		Assert.assertEquals("THIAGO COUTINHO SOUSA SILVA", usuarioDeAtuacao);
		
		String nataDeCdastro = abrirProcessos.getDataDeCdastro();
		//Assert.assertEquals("", nataDeCdastro);
		
		String assuntoDoProcesso = abrirProcessos.getAssuntoDoProcesso();
		Assert.assertEquals("001 - MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS", assuntoDoProcesso);
		String assuntoDetalhado = abrirProcessos.getAssuntoDetalhado();
		Assert.assertEquals("TEST", assuntoDetalhado);
		
		String naturezaDoProcesso = abrirProcessos.getNaturezaDoProcesso();
		Assert.assertEquals("RESTRITO", naturezaDoProcesso);
		//String hipoteseLegal = abrirProcessos.getHipoteseLegal();
		//Assert.assertEquals("Informação Pessoal (Art. 31 da Lei nº 12.527/2011)", hipoteseLegal);
		String unidadeDeOrigem = abrirProcessos.getUnidadeDeOrigem();
		Assert.assertEquals("SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA (12.01.42)", unidadeDeOrigem);
		String observacao = abrirProcessos.getObservacao();
		Assert.assertEquals("test", observacao);
		String situacao = abrirProcessos.getSituacao();
		Assert.assertEquals("ABERTO", situacao);
		
		identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("1574037", identificadorInteressadoLogado); 
		nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("Servidor", tipoInteressadoLogado);
	}
	@Test
	@Order(26)
	public void DeveAdicionarServidorInteressadoENaoInformarOServidorInteressadoEPreencherOFormularioComDadosCorretos() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Servidor", "", "ELIEIDE SANTOS ORRICO", false, ""));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		//Assert.assertEquals("1574037", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		//Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		//Assert.assertEquals("---", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		//Assert.assertEquals("Servidor", tipoInteressadoLogado);
		
		String mensagem = abrirProcessos.getMensagem();
		//Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
		
		this.abrirProcessos.preencherFormularioAbrirProcessosComTodosOsDadosCorretos();
	
		this.abrirProcessos.submeterFormularioAbrirProcessos();
		this.abrirProcessos.confirmarSubmicaoDeFormularioAbrirProcessos();
		
		Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		
		mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Processo cadastrado com sucesso.", mensagem);
		
		String numeroDeProtocolo = abrirProcessos.getNumeroDeProtocolo();
		//Assert.assertEquals("", numeroDeProtocolo);
		
		String origemdoProcesso = abrirProcessos.getOrigemdoProcesso();
		Assert.assertEquals("Interno", origemdoProcesso);
		String usuarioDeAtuacao = abrirProcessos.getUsuarioDeAtuacao();
		Assert.assertEquals("THIAGO COUTINHO SOUSA SILVA", usuarioDeAtuacao);
		
		String nataDeCdastro = abrirProcessos.getDataDeCdastro();
		//Assert.assertEquals("", nataDeCdastro);
		
		String assuntoDoProcesso = abrirProcessos.getAssuntoDoProcesso();
		Assert.assertEquals("001 - MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS", assuntoDoProcesso);
		String assuntoDetalhado = abrirProcessos.getAssuntoDetalhado();
		Assert.assertEquals("TEST", assuntoDetalhado);
		
		String naturezaDoProcesso = abrirProcessos.getNaturezaDoProcesso();
		Assert.assertEquals("RESTRITO", naturezaDoProcesso);
		//String hipoteseLegal = abrirProcessos.getHipoteseLegal();
		//Assert.assertEquals("Informação Pessoal (Art. 31 da Lei nº 12.527/2011)", hipoteseLegal);
		String unidadeDeOrigem = abrirProcessos.getUnidadeDeOrigem();
		Assert.assertEquals("SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA (12.01.42)", unidadeDeOrigem);
		String observacao = abrirProcessos.getObservacao();
		Assert.assertEquals("test", observacao);
		String situacao = abrirProcessos.getSituacao();
		Assert.assertEquals("ABERTO", situacao);
		
		identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("1574037", identificadorInteressadoLogado); 
		nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("---", emailInteressadoLogado);
		tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("Servidor", tipoInteressadoLogado);
	}
	
	@Test
	@Order(27)
	public void DeveAdicionarAlunoInteressadoEPreencherOFormularioComDadosCorretos() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Aluno", "", "ELIEIDE SANTOS ORRICO", true, "elieide.orrico!!@ufba.br"));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("212215251", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Aluno Pós-Graduação", tipoInteressadoLogado);
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
		
		this.abrirProcessos.preencherFormularioAbrirProcessosComTodosOsDadosCorretos();
	
		this.abrirProcessos.submeterFormularioAbrirProcessos();
		this.abrirProcessos.confirmarSubmicaoDeFormularioAbrirProcessos();
		
		Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		
		mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Processo cadastrado com sucesso.", mensagem);
		
		String numeroDeProtocolo = abrirProcessos.getNumeroDeProtocolo();
		//Assert.assertEquals("", numeroDeProtocolo);
		
		String origemdoProcesso = abrirProcessos.getOrigemdoProcesso();
		Assert.assertEquals("Interno", origemdoProcesso);
		String usuarioDeAtuacao = abrirProcessos.getUsuarioDeAtuacao();
		Assert.assertEquals("THIAGO COUTINHO SOUSA SILVA", usuarioDeAtuacao);
		
		String nataDeCdastro = abrirProcessos.getDataDeCdastro();
		//Assert.assertEquals("", nataDeCdastro);
		
		String assuntoDoProcesso = abrirProcessos.getAssuntoDoProcesso();
		Assert.assertEquals("001 - MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS", assuntoDoProcesso);
		String assuntoDetalhado = abrirProcessos.getAssuntoDetalhado();
		Assert.assertEquals("TEST", assuntoDetalhado);
		
		String naturezaDoProcesso = abrirProcessos.getNaturezaDoProcesso();
		Assert.assertEquals("RESTRITO", naturezaDoProcesso);
		//String hipoteseLegal = abrirProcessos.getHipoteseLegal();
		//Assert.assertEquals("Informação Pessoal (Art. 31 da Lei nº 12.527/2011)", hipoteseLegal);
		String unidadeDeOrigem = abrirProcessos.getUnidadeDeOrigem();
		Assert.assertEquals("SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA (12.01.42)", unidadeDeOrigem);
		String observacao = abrirProcessos.getObservacao();
		Assert.assertEquals("test", observacao);
		String situacao = abrirProcessos.getSituacao();
		Assert.assertEquals("ABERTO", situacao);
		
		identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("212215251", identificadorInteressadoLogado); 
		nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("Aluno Pós-Graduação", tipoInteressadoLogado);
	}
	@Test
	@Order(28)
	public void DeveAdicionarAlunoInteressadoENaoInformarOServidorInteressadoEPreencherOFormularioComDadosCorretos() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Aluno", "", "ELIEIDE SANTOS ORRICO", false, "elieide.orrico!!@ufba.br"));

		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("212215251", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("---", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Aluno Pós-Graduação", tipoInteressadoLogado);
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
		
		this.abrirProcessos.preencherFormularioAbrirProcessosComTodosOsDadosCorretos();
	
		this.abrirProcessos.submeterFormularioAbrirProcessos();
		this.abrirProcessos.confirmarSubmicaoDeFormularioAbrirProcessos();
		
		Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		
		mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Processo cadastrado com sucesso.", mensagem);
		
		String numeroDeProtocolo = abrirProcessos.getNumeroDeProtocolo();
		//Assert.assertEquals("", numeroDeProtocolo);
		
		String origemdoProcesso = abrirProcessos.getOrigemdoProcesso();
		Assert.assertEquals("Interno", origemdoProcesso);
		String usuarioDeAtuacao = abrirProcessos.getUsuarioDeAtuacao();
		Assert.assertEquals("THIAGO COUTINHO SOUSA SILVA", usuarioDeAtuacao);
		
		String nataDeCdastro = abrirProcessos.getDataDeCdastro();
		//Assert.assertEquals("", nataDeCdastro);
		
		String assuntoDoProcesso = abrirProcessos.getAssuntoDoProcesso();
		Assert.assertEquals("001 - MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS", assuntoDoProcesso);
		String assuntoDetalhado = abrirProcessos.getAssuntoDetalhado();
		Assert.assertEquals("TEST", assuntoDetalhado);
		
		String naturezaDoProcesso = abrirProcessos.getNaturezaDoProcesso();
		Assert.assertEquals("RESTRITO", naturezaDoProcesso);
		//String hipoteseLegal = abrirProcessos.getHipoteseLegal();
		//Assert.assertEquals("Informação Pessoal (Art. 31 da Lei nº 12.527/2011)", hipoteseLegal);
		String unidadeDeOrigem = abrirProcessos.getUnidadeDeOrigem();
		Assert.assertEquals("SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA (12.01.42)", unidadeDeOrigem);
		String observacao = abrirProcessos.getObservacao();
		Assert.assertEquals("test", observacao);
		String situacao = abrirProcessos.getSituacao();
		Assert.assertEquals("ABERTO", situacao);
		
		identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("212215251", identificadorInteressadoLogado); 
		nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("Aluno Pós-Graduação", tipoInteressadoLogado);
	}
	
	@Test
	@Order(29)
	public void DeveAdicionarCredorInteressadoENaoInformarOCredorInteressadoEPreencherOFormularioComDadosCorretos() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Credor", "", "ASSEMBLÉIA LEGISLATIVA DO ESTADO DA BAHIA", false, ""));
	
		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("14.674.337/0001-99", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ASSEMBLÉIA LEGISLATIVA DO ESTADO DA BAHIA", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("---", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Credor", tipoInteressadoLogado);
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
		this.abrirProcessos.preencherFormularioAbrirProcessosComTodosOsDadosCorretos();
		
		this.abrirProcessos.submeterFormularioAbrirProcessos();
		this.abrirProcessos.confirmarSubmicaoDeFormularioAbrirProcessos();
		
		Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		
		mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Processo cadastrado com sucesso.", mensagem);
		
		String numeroDeProtocolo = abrirProcessos.getNumeroDeProtocolo();
		//Assert.assertEquals("", numeroDeProtocolo);
		
		String origemdoProcesso = abrirProcessos.getOrigemdoProcesso();
		Assert.assertEquals("Interno", origemdoProcesso);
		String usuarioDeAtuacao = abrirProcessos.getUsuarioDeAtuacao();
		Assert.assertEquals("THIAGO COUTINHO SOUSA SILVA", usuarioDeAtuacao);
		
		String nataDeCdastro = abrirProcessos.getDataDeCdastro();
		//Assert.assertEquals("", nataDeCdastro);
		
		String assuntoDoProcesso = abrirProcessos.getAssuntoDoProcesso();
		Assert.assertEquals("001 - MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS", assuntoDoProcesso);
		String assuntoDetalhado = abrirProcessos.getAssuntoDetalhado();
		Assert.assertEquals("TEST", assuntoDetalhado);
		
		String naturezaDoProcesso = abrirProcessos.getNaturezaDoProcesso();
		Assert.assertEquals("RESTRITO", naturezaDoProcesso);
		//String hipoteseLegal = abrirProcessos.getHipoteseLegal();
		//Assert.assertEquals("Informação Pessoal (Art. 31 da Lei nº 12.527/2011)", hipoteseLegal);
		String unidadeDeOrigem = abrirProcessos.getUnidadeDeOrigem();
		Assert.assertEquals("SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA (12.01.42)", unidadeDeOrigem);
		String observacao = abrirProcessos.getObservacao();
		Assert.assertEquals("test", observacao);
		String situacao = abrirProcessos.getSituacao();
		Assert.assertEquals("ABERTO", situacao);
		
		identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("14.674.337/0001-99", identificadorInteressadoLogado);
		nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("ASSEMBLÉIA LEGISLATIVA DO ESTADO DA BAHIA", nomeInteressadoLogado);
		emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("---", emailInteressadoLogado);
		tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("Credor", tipoInteressadoLogado);
		
		//String mensagem = abrirProcessos.getMensagem();
		//Assert.assertEquals("Interessado adicionado com sucesso.", mensagem);
	}
	
	@Test
	@Order(30)
	public void DeveImprimir() throws InterruptedException
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado(new Interessado("Servidor", "", "ELIEIDE SANTOS ORRICO", true, "elieide.orrico!!@ufba.br"));
		
		this.abrirProcessos.preencherFormularioAbrirProcessosComTodosOsDadosCorretos();
	
		this.abrirProcessos.submeterFormularioAbrirProcessos();
		this.abrirProcessos.confirmarSubmicaoDeFormularioAbrirProcessos();
		
		Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		
		String mensagem = abrirProcessos.getMensagem();
		Assert.assertEquals("Processo cadastrado com sucesso.", mensagem);
		
		String numeroDeProtocolo = abrirProcessos.getNumeroDeProtocolo();
		//Assert.assertEquals("", numeroDeProtocolo);
		
		String origemdoProcesso = abrirProcessos.getOrigemdoProcesso();
		Assert.assertEquals("Interno", origemdoProcesso);
		String usuarioDeAtuacao = abrirProcessos.getUsuarioDeAtuacao();
		Assert.assertEquals("THIAGO COUTINHO SOUSA SILVA", usuarioDeAtuacao);
		
		String dataDeCadastro = abrirProcessos.getDataDeCdastro();
		//Assert.assertEquals("", dataDeCadastro);
		
		
		this.abrirProcessos.imprimir();
		
		
		String assuntoDoProcesso = abrirProcessos.getAssuntoDoProcesso();
		Assert.assertEquals("001 - MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS", assuntoDoProcesso);
		String assuntoDetalhado = abrirProcessos.getAssuntoDetalhado();
		Assert.assertEquals("TEST", assuntoDetalhado);
		
		String naturezaDoProcesso = abrirProcessos.getNaturezaDoProcesso();
		Assert.assertEquals("RESTRITO", naturezaDoProcesso);
		String hipoteseLegal = abrirProcessos.getHipoteseLegal();
		Assert.assertEquals("Informação Pessoal (Art. 31 da Lei nº 12.527/2011)", hipoteseLegal);
		String unidadeDeOrigem = abrirProcessos.getUnidadeDeOrigem();
		Assert.assertEquals("SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA (12.01.42)", unidadeDeOrigem);
		String observacao = abrirProcessos.getObservacao();
		Assert.assertEquals("test", observacao);
		String situacao = abrirProcessos.getSituacao();
		Assert.assertEquals("ABERTO", situacao);
		
		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("1574037", identificadorInteressadoLogado); 
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogadoNoProcessoberto();
		Assert.assertEquals("Servidor", tipoInteressadoLogado);
	
	}
}






































