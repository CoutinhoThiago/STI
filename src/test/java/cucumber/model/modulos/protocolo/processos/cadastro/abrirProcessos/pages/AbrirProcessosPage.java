package cucumber.model.modulos.protocolo.processos.cadastro.abrirProcessos.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import cucumber.interessado.Interessado;
import cucumber.pages.PageObject;

public class AbrirProcessosPage extends PageObject{
	private static String URL_LOGIN = "https://homologacaosipac.ufba.br/sipac/";

    public AbrirProcessosPage(WebDriver driver) {
    	super(driver);
    }
	
	// caminhos
	public void irParaOModuloDeProtocolo() throws InterruptedException {
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		this.driver.findElement(By.cssSelector("#show-modulos-sipac")).click();
		Thread.sleep(500);//gambiarra
		this.driver.findElement(By.cssSelector("#modulos > ul:nth-child(2) > li.protocolo")).click();
	}
	public void selecionarOpcaoMenu() {
		this.driver.findElement(By.cssSelector("#menu > p")).click();
	}
	public void selecionarAbaCorreta() {
		this.driver.findElement(By.cssSelector("#elgen-6")).click();//*[@id="elgen-6"]
	}
	public void selecionarFuncaoCorreta() {
		this.driver.findElement(By.cssSelector("#menuForm\\:processo-movimentacao-abrirProc")).click();//*[@id="menuForm:processo-movimentacao-abrirProc"]
	}
	
	public void irParaOPortalAdiministrativo() {
		this.driver.findElement(By.cssSelector("#menu2 > a")).click();
		// element = <a href="/sipac/menuUnidade.do">Portal Admin.</a>
		// selector = #menu2 > a
		// //*[@id="menu2"]/a
	}
	public void mouseHoverAbrirProcessos() {
		this.driver.findElement(By.cssSelector("#formmenuadm_menuadm_menu > table > tbody > tr > td:nth-child(8) > span.ThemeOfficeMainFolderText")).click();
		this.driver.findElement(By.cssSelector("#cmSubMenuID36 > table > tbody > tr:nth-child(1) > td.ThemeOfficeMenuFolderText")).click();
		this.driver.findElement(By.cssSelector("#cmSubMenuID37 > table > tbody > tr:nth-child(5)")).click();
	}
	
	public void irParaAMesaVirtual() {
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		this.driver.findElement(By.cssSelector("#menu-usuario > ul > li.mesa-virtual")).click();
	}
	public void irDaMesaVirtualParaAPrimeiraPadinaDeAbrirProcessos() {
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		this.driver.findElement(By.cssSelector("#menuForm\\:processos_span")).click();
		this.driver.findElement(By.cssSelector("#menuForm\\:abrirProcesso")).click();
	}

	public void irParaPaginaDeAbrirProcessosContexto() {
		this.driver.navigate().to("https://homologacaosipac.ufba.br/sipac/portal_administrativo/index.jsf");	
		this.driver.findElement(By.cssSelector("#formmenuadm_menuadm_menu > table > tbody > tr > td:nth-child(8) > span.ThemeOfficeMainFolderText")).click();
		this.driver.findElement(By.cssSelector("#cmSubMenuID36 > table > tbody > tr:nth-child(1) > td.ThemeOfficeMenuFolderText")).click();
		this.driver.findElement(By.cssSelector("#cmSubMenuID37 > table > tbody > tr:nth-child(5)")).click();
	}
	
	//Botoes
		//interessado
		public void botaoInserirInteressado() { //interessado
			this.driver.findElement(By.xpath("//input[@value='Inserir']")).click();
			//<input type="submit" name="interessadosForm:j_id_jsp_1757759760_68" value="Inserir">
		}
		public void botaoExcluirInteressado() { //interessado
			this.driver.findElement(By.xpath("//*[@id=\"dadosGeraisForm:j_id_jsp_2064664619_182:0:j_id_jsp_2064664619_206\"]/a/img")).click();
		}
		//Primeira pagina de abrir processos
		public void botaoCancelar() {
			//this.driver.findElement(By.cssSelector("input.Cancelar")).click();
			this.driver.findElement(By.xpath("//input[@value='Cancelar']")).click();
		}
		public void botaoContinuar() {
			this.driver.findElement(By.xpath("//input[@value='Continuar']")).click();			
		}
		//Segundo pagina de abrir processos
		public void botaoVoltar() {
			this.driver.findElement(By.xpath("")).click();
		}
		//Remover Classificação CONARQ
		public void botaoRemoverClassificacao() throws InterruptedException {
			this.driver.findElement(By.id("dadosGeraisForm:removerConarq")).click();
			Thread.sleep(500);
			//<img id="dadosGeraisForm:removerConarq" 
			//		src="/sipac/img_css/cancel.png" 
			//		alt="Remover Classificação CONARQ" 
			//		style="vertical-align:middle;" 
			//		title="Remover Classificação CONARQ">
		}
		
		//preencher formularios de adicionar interessado
		public void preencherFormularioDeDadosDoInteressado(Interessado interessado) throws InterruptedException {
			switch (interessado.getCategoria()) {
			case "Servidor":
				this.driver.findElement(By.cssSelector("#dadosGeraisForm > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td > select"))
				.sendKeys(Keys.ENTER);
				break;
			case "Aluno":
				this.driver.findElement(By.cssSelector("#dadosGeraisForm > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td > select"))
				.sendKeys(Keys.DOWN, Keys.ENTER);
				break;
			case "Credor":
				this.driver.findElement(By.cssSelector("#dadosGeraisForm > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td > select"))
				.sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
				break;
			case "Unidade":
				this.driver.findElement(By.cssSelector("#dadosGeraisForm > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td > select"))
				.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
				break;
			case "Outros":
				this.driver.findElement(By.cssSelector("#dadosGeraisForm > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td > select"))
				.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
				this.driver.findElement(By.name("dadosGeraisForm:cpf_cnpj_outros")).click();
				this.driver.findElement(By.name("dadosGeraisForm:cpf_cnpj_outros")).sendKeys(interessado.getCpf());
				break;
			}
			String cssSelectorNomeServidor = "#dadosGeraisForm\\:nome" + interessado.getCategoria();
			if (interessado.getCategoria() != "Credor") {
				cssSelectorNomeServidor = cssSelectorNomeServidor + "Interessado";
			}
			this.driver.findElement(By.cssSelector(cssSelectorNomeServidor)).click();
			this.driver.findElement(By.cssSelector(cssSelectorNomeServidor)).sendKeys(interessado.getNomeInteressado());
			Thread.sleep(2000);
			this.driver.findElement(By.cssSelector(cssSelectorNomeServidor)).sendKeys(Keys.TAB);
			if(interessado.isNotificarInteresado() == true) {
				//this.driver.findElement(By.cssSelector("#dadosGeraisForm\\:notificarInteressado\\:0")).click();
				this.driver.findElement(By.name("dadosGeraisForm:email")).click();
				this.driver.findElement(By.name("dadosGeraisForm:email")).clear();
				this.driver.findElement(By.name("dadosGeraisForm:email")).sendKeys(interessado.getEmail(), Keys.TAB);
			}
			else {
				this.driver.findElement(By.cssSelector("#dadosGeraisForm\\:notificarInteressado\\:1")).click();
				//this.driver.findElement(By.name("dadosGeraisForm:email")).click();
				//this.driver.findElement(By.name("dadosGeraisForm:email")).clear();
			}
		}
		
		//preencher formularios de abrir processos
		public void preencherFormularioDeDadosGeraisDoProcesso
		(String assunto, boolean processoEletronico, String assuntoDetalhado, String natureza, String observacao,
		String hipoteseLegal, String grauSigilo) throws InterruptedException {
			this.driver.findElement(By.id("dadosGeraisForm:classificacaoConarq")).click();
			this.driver.findElement(By.id("dadosGeraisForm:classificacaoConarq")).sendKeys(assunto); //001 - MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS

	        Thread.sleep(700);
	        
	        this.driver.findElement(By.id("dadosGeraisForm:classificacaoConarq")).sendKeys(Keys.DOWN);
	        this.driver.findElement(By.id("dadosGeraisForm:classificacaoConarq")).sendKeys(Keys.ENTER);
			
			//this.driver.findElement(By.name("")).click();
			//this.driver.findElement(By.name("")).sendKeys(processoEletronico);
			
			this.driver.findElement(By.name("dadosGeraisForm:assunto")).click();
			this.driver.findElement(By.name("dadosGeraisForm:assunto")).sendKeys(assuntoDetalhado, Keys.TAB);
			
			
			driver.findElement(By.id("dadosGeraisForm:natureza")).sendKeys("0", "1");

			System.out.println(natureza);
			this.driver.findElement(By.id("dadosGeraisForm:natureza")).click();
			this.driver.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.DOWN);
			this.driver.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.ENTER);

			Thread.sleep(200);
			System.out.println(natureza);
			if (natureza == "OSTENSIVO") {
				System.out.println(natureza);
				this.driver.findElement(By.id("dadosGeraisForm:natureza")).click();
				this.driver.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.DOWN);
				this.driver.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.ENTER);

				
			}
			else {
				if(natureza == "RESTRITO") {

					this.driver.findElement(By.id("dadosGeraisForm:natureza")).click();
					this.driver.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.DOWN);
					this.driver.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.DOWN);
					this.driver.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.ENTER);

					this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito"))
					.click();
					switch (hipoteseLegal) {
					case "CONTROLE INTERNO":
						this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito"))
						.sendKeys(Keys.DOWN, Keys.ENTER);
					case "DOCUMENTO REPARATORIO":
						this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito"))
						.sendKeys(Keys.DOWN, Keys.ENTER);
					case "INFORMACAO PESSOAL":
						this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito"))
						.sendKeys(Keys.DOWN, Keys.ENTER);
					case "INVESTIGACOA DE RESPONSABILIDADE DE SERVIDOR":
						this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito"))
						.sendKeys(Keys.DOWN, Keys.ENTER);
					case "SIGILO CONTABIL":
						this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito"))
						.sendKeys(Keys.DOWN, Keys.ENTER);
					case "SIGILO EMPRESARIAL":
						this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito"))
						.sendKeys(Keys.DOWN, Keys.ENTER);
					case "SIGILO FISCAL":
						this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito"))
						.sendKeys(Keys.DOWN, Keys.ENTER);
					}
				}
				else if (natureza == "SIGILOSO"){
					this.driver.findElement(By.name("dadosGeraisForm:natureza"))
					.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
					this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalSigiloso"))
					.click();
					switch (hipoteseLegal) {
					case "1":  // voltar para completar os casos de teste
						this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalSigiloso"))
						.sendKeys(Keys.DOWN, Keys.ENTER);
					}
					this.driver.findElement(By.name("dadosGeraisForm:grauSigilo"))
					.click();
					switch (grauSigilo) {
					case "CONFIDENCIAL":
						this.driver.findElement(By.name("dadosGeraisForm:grauSigilo"))
						.sendKeys(Keys.DOWN, Keys.ENTER);
					case "RESERVADO":
						this.driver.findElement(By.name("dadosGeraisForm:grauSigilo"))
						.sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
					case "SECRETO":
						this.driver.findElement(By.name("dadosGeraisForm:grauSigilo"))
						.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
					case "ULTRASSECRETO":
						this.driver.findElement(By.name("dadosGeraisForm:grauSigilo"))
						.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
					}
				}
			}
			
			this.driver.findElement(By.name("dadosGeraisForm:observacao")).click();
			this.driver.findElement(By.name("dadosGeraisForm:observacao")).sendKeys(observacao, Keys.TAB);
		}
		//preencher assunto do processo CONARQ
		public void adicionarClassificacaoConarq() throws InterruptedException {
			this.driver.findElement(By.id("dadosGeraisForm:classificacaoConarq")).click();
			this.driver.findElement(By.id("dadosGeraisForm:classificacaoConarq")).sendKeys("MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS"); //001 - MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS

	        Thread.sleep(700);
	        
	        this.driver.findElement(By.id("dadosGeraisForm:classificacaoConarq")).sendKeys(Keys.DOWN);
	        this.driver.findElement(By.id("dadosGeraisForm:classificacaoConarq")).sendKeys(Keys.ENTER);
	        
	        Thread.sleep(700);
		}

		//Gambiarras
		//Tela de CI em remover interessado de abrir processos
		public boolean verificarTelaDeCi() {
			try {
				//System.out.println(driver.findElement(By.xpath("//*[@id=\"mensagem-erro\"]/h3")).getText());
				String telaDeCi = driver.findElement(By.id("mensagem-erro")).getText();
				return true;
			} 
			catch (NoSuchElementException e) {
				return false;
			}
		}
}
