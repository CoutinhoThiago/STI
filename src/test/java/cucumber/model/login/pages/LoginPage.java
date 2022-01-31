package cucumber.model.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.pages.PageObject;

public class LoginPage extends PageObject{
	private static String URL_LOGIN = "https://homologacaosipac.ufba.br/sipac/";

    public LoginPage(WebDriver driver) {
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
	
	
	
	public void fechar() {
		this.driver.quit();
	}
}
