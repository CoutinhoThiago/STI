package cucumber.model.modulos.protocolo.processos.cadastro.abrirProcessos.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.pages.PageObject;

public class AbrirProcessosPage extends PageObject{
	private static String URL_LOGIN = "https://homologacaosipac.ufba.br/sipac/";

    public AbrirProcessosPage(WebDriver driver) {
    	super(driver);
    }
    public void caminhoAteAPaginaDeLogin() {
    	this.driver.navigate().to(URL_LOGIN);
    }
	public void preencherFormularioDeLogin(String login, String senha) {
		this.driver.findElement(By.name("login")).sendKeys(login);
		this.driver.findElement(By.name("senha")).sendKeys(senha);
	}
	public void efetuarLogin() {
		this.driver.findElement(By.cssSelector("input[type=submit]")).click();
		// element = <input type="submit" value="Entrar">
		// selector = #conteudo > div.logon > form > table > tfoot > tr > td > input[type=submit]
		// full xpath = /html/body/div[1]/div[2]/div[3]/form/table/tfoot/tr/td/input
		// xpath =  //*[@id="conteudo"]/div[3]/form/table/tfoot/tr/td/input
	}
	
	// caminhos
	public void irParaOModuloDeProtocolo() throws InterruptedException {
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		this.driver.findElement(By.cssSelector("#show-modulos-sipac")).click();
		Thread.sleep(300);//gambiarra
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
	
	//Fechar as abas no final
	public void fechar() {
		this.driver.quit();
	}
}
