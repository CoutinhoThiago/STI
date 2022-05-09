package testes.protocolo.processos.abriProcesso.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testes.PageObject;
import testes.interessado.Interessado;

public class AbrirProcessoPage extends PageObject{
	private static String URL_LOGIN = "https://homologacaosipac.ufba.br/sipac/";

    public AbrirProcessoPage(WebDriver driver) {
    	super(driver);
    }
	
// caminhos
    //Caminho pelo modulo de protocolo
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
		//Ir para pagina RAPIDO
		public void vaiParaPrimeiraPaginaDeAbrirProcessoRapido() {
			this.driver.navigate().to("https://homologacaosipac.ufba.br/sipac/protocolo/menu.jsf");	
			this.driver.findElement(By.cssSelector("#menuForm\\:processo-movimentacao-abrirProc")).click();//*[@id="menuForm:processo-movimentacao-abrirProc"]
		}
	//Caminho do portl adiministrativo
	public void irParaOPortalAdiministrativo() {
		this.driver.findElement(By.cssSelector("#menu2 > a")).click();
	}
	public void mouseHoverAbrirProcessos() {
		this.driver.findElement(By.cssSelector("#formmenuadm_menuadm_menu > table > tbody > tr > td:nth-child(8) > span.ThemeOfficeMainFolderText")).click();
		this.driver.findElement(By.cssSelector("#cmSubMenuID36 > table > tbody > tr:nth-child(1) > td.ThemeOfficeMenuFolderText")).click();
		this.driver.findElement(By.cssSelector("#cmSubMenuID37 > table > tbody > tr:nth-child(5)")).click();
	}
	//Caminho da mesa virtual
	public void irParaAMesaVirtual() {
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		this.driver.findElement(By.cssSelector("#menu-usuario > ul > li.mesa-virtual")).click();
	}
	public void irDaMesaVirtualParaAPrimeiraPadinaDeAbrirProcessos() {
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		this.driver.findElement(By.cssSelector("#menuForm\\:processos_span")).click();
		this.driver.findElement(By.cssSelector("#menuForm\\:abrirProcesso")).click();
	}
	
//Primeira pagina de abrir processos
	//Botoes
		//Inserir interessado
		public void botaoInserirInteressado() { //interessado
			this.driver.findElement(By.xpath("//input[@value='Inserir']")).click();
		}
		//Remover interessado
		public void botaoRemoverInteressado() { //interessado
			this.driver.findElement(By.xpath("//*[@id=\"dadosGeraisForm:j_id_jsp_2064664619_182:0:j_id_jsp_2064664619_206\"]/a/img")).click();
		}
		//Botao cancelar
		public void botaoCancelar() {
			this.driver.findElement(By.xpath("//input[@value='Cancelar']")).click();
		}
		//Botao continuar
		public void botaoContinuar() {
				this.driver.findElement(By.xpath("//input[@value='Continuar']")).click();
		}
		//Remover Classificação CONARQ
		public void botaoRemoverClassificacao() throws InterruptedException {
			Thread.sleep(200);
			this.driver.findElement(By.id("dadosGeraisForm:removerConarq")).click();
			Thread.sleep(500);
		}
//Segundo pagina de abrir processos
	//Botoes
		//Botao voltar
		public void botaoVoltar() {
			this.driver.findElement(By.xpath("")).click();
		}
		//Botao cancelar
		public void segundoBotaoCancelar() {
			this.driver.findElement(By.xpath("//input[@value='Cancelar']")).click();
		}
				
//preencher formularios de adicionar interessado
	//Categoria de  interessado
	public void categoriaDeInteressado(Interessado interessado) throws InterruptedException {
		String cssSelectorNomeServidor = "#dadosGeraisForm\\:nome" + interessado.getCategoria();
		System.out.println(interessado.getCategoria());
		if(interessado.getCategoria().equals("Servidor")) {
			WebElement selectElement = driver.findElement(By.cssSelector("#dadosGeraisForm > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td > select"));
			Select selectObject = new Select(selectElement);
			//selectObject.selectByIndex(1);
			//selectObject.selectByValue("1");
			selectObject.selectByVisibleText("Servidor");
			}
		else if(interessado.getCategoria().equals("Aluno")) {
			WebElement selectElement = driver.findElement(By.cssSelector("#dadosGeraisForm > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td > select"));
			Select selectObject = new Select(selectElement);
			//selectObject.selectByIndex(2);
			//selectObject.selectByValue("2");
			selectObject.selectByVisibleText("Aluno");
			}
		else if(interessado.getCategoria().equals("Credor")) {
			WebElement selectElement = driver.findElement(By.cssSelector("#dadosGeraisForm > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td > select"));
			Select selectObject = new Select(selectElement);
			selectObject.selectByVisibleText("Credor");
		}
		else if(interessado.getCategoria().equals("Unidade")) {
			WebElement selectElement = driver.findElement(By.cssSelector("#dadosGeraisForm > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td > select"));
			Select selectObject = new Select(selectElement);
			selectObject.selectByVisibleText("Unidade");
		}
		else if(interessado.getCategoria().equals("Outros")) {
			WebElement selectElement = driver.findElement(By.cssSelector("#dadosGeraisForm > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td > select"));
			Select selectObject = new Select(selectElement);
			selectObject.selectByVisibleText("Outros");
			//this.driver.findElement(By.cssSelector("#dadosGeraisForm > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td > select")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
			System.out.println("teste 01");
			this.driver.findElement(By.cssSelector("#dadosGeraisForm\\:cpf_cnpj_outros")).click();
			this.driver.findElement(By.cssSelector("#dadosGeraisForm\\:cpf_cnpj_outros")).sendKeys(interessado.getCpf());
			this.driver.findElement(By.cssSelector("#dadosGeraisForm\\:cpf_cnpj_outros")).sendKeys(Keys.TAB);
		}
		System.out.println("teste 03");
	}
	//Nome do interessado
	public void nomeDoInteressado(Interessado interessado) throws InterruptedException {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		String idSelectorNomeInteressado = "dadosGeraisForm:";
		if(!interessado.getCategoria().equals("Unidade")) {//Gambiarra
			idSelectorNomeInteressado = idSelectorNomeInteressado + "nome";
		}
		if(!interessado.getCategoria().equals("Outros")) {//Gambiarra
			if(interessado.getCategoria().equals("Unidade")) {//Gambiarra
				idSelectorNomeInteressado = idSelectorNomeInteressado + (interessado.getCategoria()).toLowerCase();
			}
			else {
				idSelectorNomeInteressado = idSelectorNomeInteressado + interessado.getCategoria();
			}
		}
		if(interessado.getCategoria().equals("Outros") || interessado.getCategoria().equals("Servidor")) {
			idSelectorNomeInteressado = idSelectorNomeInteressado + "Interessado";
		}
		System.out.println(idSelectorNomeInteressado);
		System.out.println(idSelectorNomeInteressado == "dadosGeraisForm:nomeServidorInteressado");
		this.driver.findElement(By.id(idSelectorNomeInteressado)).click();
		//"dadosGeraisForm:nomeServidorInteressado" 	
		//"dadosGeraisForm:nomeAluno"
		//"dadosGeraisForm:nomeCredor"
		//"dadosGeraisForm:unidade" 
		//"dadosGeraisForm:nomeInteressado"
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		this.driver.findElement(By.id(idSelectorNomeInteressado)).sendKeys(interessado.getNomeInteressado());
		Thread.sleep(2000);
		this.driver.findElement(By.id(idSelectorNomeInteressado)).sendKeys(Keys.TAB);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		emailDoInteressado(interessado);
	}
	//email do interessado
		public void emailDoInteressado(Interessado interessado) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			if (!interessado.getCategoria().equals("Outros")) {
				wait.until(ExpectedConditions
						.textToBePresentInElementValue
						(By.id("dadosGeraisForm:email"), interessado.getEmail()));
			}
			else {
				this.driver.findElement(By.id("dadosGeraisForm:email"))
						.sendKeys(interessado.getEmail());
			}	
		}
	//Notificar interessado ?
	public void notificarInteressado(Interessado interessado) {
		if(interessado.isNotificarInteresado() == true) {
			this.driver.findElement(By.name("dadosGeraisForm:email")).click();
			emailDoInteressado(interessado);	
		}
		else {
			this.driver.findElement(By.cssSelector("#dadosGeraisForm\\:notificarInteressado\\:1")).click();
		}
	}
		
//preencher formularios de abrir processos
	//preencher assunto do processo CONARQ
	public void adicionarClassificacaoConarq() throws InterruptedException {
		this.driver.findElement(By.id("dadosGeraisForm:classificacaoConarq")).click();
		this.driver.findElement(By.id("dadosGeraisForm:classificacaoConarq")).sendKeys("MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS"); //001 - MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS
		Thread.sleep(700);
		this.driver.findElement(By.id("dadosGeraisForm:classificacaoConarq")).sendKeys(Keys.DOWN);
		this.driver.findElement(By.id("dadosGeraisForm:classificacaoConarq")).sendKeys(Keys.ENTER);
		Thread.sleep(700);
	}
	//O processo e eletronico ?
	public void processoEletronico(boolean processoEletronico) {
		this.driver.findElement(By.name("")).click();
		this.driver.findElement(By.name("")).sendKeys(Keys.DOWN, Keys.ENTER);
	}
	//Assunto detalhado do processo
	public void assuntoDetalhado(String assuntoDetalhado) {
		this.driver.findElement(By.name("dadosGeraisForm:assunto")).click();
		this.driver.findElement(By.name("dadosGeraisForm:assunto")).sendKeys(assuntoDetalhado, Keys.TAB);
	}
	//natureza do processo
	public void natureza (String natureza) {
		String hipoteseLegal = null;
		String grauSigilo = null;
		String observacao = null;
		switch (natureza) {
		case "OSTENSIVO":
			this.driver.findElement(By.id("dadosGeraisForm:natureza")).click();
			this.driver.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.DOWN);
			this.driver.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.ENTER);
		case "RESTRITO":
			this.driver.findElement(By.id("dadosGeraisForm:natureza")).click();
			this.driver.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.DOWN, Keys.DOWN);
			this.driver.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.ENTER);
			hipoteseLegalRestrito(hipoteseLegal);
		case "SIGILOSO":
			this.driver.findElement(By.id("dadosGeraisForm:natureza")).click();
			this.driver.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN);
			this.driver.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.ENTER);
			hipoteseLegalSigiloso(hipoteseLegal);	
			grauDeSigilo(grauSigilo);	
		}
	}
	//observacao do processo
	private void observacao(String observacao) {
		this.driver.findElement(By.name("dadosGeraisForm:observacao")).click();
		this.driver.findElement(By.name("dadosGeraisForm:observacao")).sendKeys(observacao, Keys.TAB);
	}
//Hipotese legal 
	//Hipotese legal de processo de natureza RESTRITO
	public void hipoteseLegalRestrito (String hipoteseLegal) {
		this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito")).click();
		switch (hipoteseLegal) {
			case "CONTROLE INTERNO": this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito")).sendKeys(Keys.DOWN, Keys.ENTER);
			case "DOCUMENTO REPARATORIO": this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito")).sendKeys(Keys.DOWN, Keys.ENTER);
			case "INFORMACAO PESSOAL": this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito")).sendKeys(Keys.DOWN, Keys.ENTER);
			case "INVESTIGACOA DE RESPONSABILIDADE DE SERVIDOR": this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito")).sendKeys(Keys.DOWN, Keys.ENTER);
			case "SIGILO CONTABIL": this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito")).sendKeys(Keys.DOWN, Keys.ENTER);
			case "SIGILO EMPRESARIAL": this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito")).sendKeys(Keys.DOWN, Keys.ENTER);
			case "SIGILO FISCAL":  this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalRestrito")).sendKeys(Keys.DOWN, Keys.ENTER);
		}
		this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalSigiloso")).click();
		switch (hipoteseLegal) {
			case "1": this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalSigiloso")).sendKeys(Keys.DOWN, Keys.ENTER);
		}
	}
	//Hipotese legal de processo de natureza SIGILOSO
	public void hipoteseLegalSigiloso (String hipoteseLegal) {
		this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalSigiloso")).click();
		switch (hipoteseLegal) {
			case "1": this.driver.findElement(By.name("dadosGeraisForm:hipoteseLegalSigiloso")).sendKeys(Keys.DOWN, Keys.ENTER);
		}
	}
	//Grau de sigilo de processo de natureza SIGILOSO
	private void grauDeSigilo(String grauSigilo) {
		this.driver.findElement(By.name("dadosGeraisForm:grauSigilo")).click();
		switch (grauSigilo) {
			case "CONFIDENCIAL":this.driver.findElement(By.name("dadosGeraisForm:grauSigilo")).sendKeys(Keys.DOWN, Keys.ENTER);
			case "RESERVADO":this.driver.findElement(By.name("dadosGeraisForm:grauSigilo")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
			case "SECRETO":this.driver.findElement(By.name("dadosGeraisForm:grauSigilo")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
			case "ULTRASSECRETO":this.driver.findElement(By.name("dadosGeraisForm:grauSigilo")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
		}
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

	public List<String> getInteressado() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	
		List <String> interessado = new ArrayList<String>();
		interessado.add(driver.findElement(By.xpath("//*[@id=\"dadosGeraisForm:j_id_jsp_2064664619_182:0:j_id_jsp_2064664619_195\"]")).getText());
		interessado.add(driver.findElement(By.xpath("//*[@id=\"dadosGeraisForm:j_id_jsp_2064664619_182:0:j_id_jsp_2064664619_198\"]")).getText());
		interessado.add(driver.findElement(By.xpath("//*[@id=\"dadosGeraisForm:j_id_jsp_2064664619_182:0:j_id_jsp_2064664619_200\"]")).getText());
		interessado.add(driver.findElement(By.xpath("//*[@id=\"dadosGeraisForm:j_id_jsp_2064664619_182:0:j_id_jsp_2064664619_203\"]")).getText());
		
		return interessado;
	}	
	
	public boolean verificarClassificacaoConarq() throws InterruptedException {
		boolean vazio = ((this.driver.findElement(By.id("dadosGeraisForm:classificacaoConarq")).getText()).equals(""));
		return vazio;
	}

	public boolean elementoExiste(String elemento) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		if (!interessado.getCategoria().equals("Outros")) {
//			wait.until(ExpectedConditions
//					.textToBePresentInElementValue
//					(By.id("dadosGeraisForm:email"), interessado.getEmail()));
//		}
//		else {
//			this.driver.findElement(By.id("dadosGeraisForm:email"))
//					.sendKeys(interessado.getEmail());
//		}
		try {
			driver.findElement(By.xpath(elemento)).getText();
			return true;
		} 
		catch (NoSuchElementException e) {
			return false;
		}
	}
}



































