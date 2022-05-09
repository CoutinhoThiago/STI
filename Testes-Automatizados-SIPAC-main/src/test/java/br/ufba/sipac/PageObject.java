package br.ufba.sipac;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject 
{
	protected static final String URL_LOGIN = "https://homologacaosipac.ufba.br/sipac/";

	protected WebDriver browser;
	//protected Duration time = Duration.ofSeconds(30);
	
	public PageObject(WebDriver browser)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		if (browser == null) 
		{
            this.browser = new ChromeDriver();
            //WebDriverWait wait = new WebDriverWait(browser,time);
            this.browser.navigate().to(URL_LOGIN);
        } 
		else 
		{
            this.browser = browser;
            //WebDriverWait wait = new WebDriverWait(browser,time);
            this.browser.navigate().to(URL_LOGIN);
        }
	}
	
	public void fechar() 
	{
		this.browser.quit();
	}
	
	public void preencherFormularioDeLogin(String username, String password)
	{
		this.browser.findElement(By.name("login")).sendKeys(username);
        this.browser.findElement(By.name("senha")).sendKeys(password);
	}
	public void efetuarLogin() 
	{
		this.browser.findElement(By.xpath("//*[@id=\"conteudo\"]/div[3]/form/table/tbody/tr[1]/td/input")).submit();
	}
	
	public String getNomeInteressadoLogado() throws NoSuchElementException
	{

		return browser.findElement(By.id("dadosGeraisForm:j_id_jsp_2064664619_182:0:j_id_jsp_2064664619_198")).getText(); //ELIEIDE SANTOS ORRICO
	}
	
	public String getEmailInteressadoLogado() throws NoSuchElementException
	{
		return browser.findElement(By.id("dadosGeraisForm:j_id_jsp_2064664619_182:0:j_id_jsp_2064664619_200")).getText(); //elieide.orrico!!@ufba.br
	}
	public String getTipoInteressadoLogado() throws NoSuchElementException
	{
		return browser.findElement(By.id("dadosGeraisForm:j_id_jsp_2064664619_182:0:j_id_jsp_2064664619_203")).getText(); //Servidor
	}
	public String getIdentificadorInteressadoLogado() throws NoSuchElementException
	{
		//id="dadosGeraisForm:j_id_jsp_2064664619_182:0:j_id_jsp_2064664619_195"
		return browser.findElement(By.id("dadosGeraisForm:j_id_jsp_2064664619_182:0:j_id_jsp_2064664619_195")).getText(); //1574037 
	}

	
	public String getMensagem() throws NoSuchElementException
	{
		return browser.findElement(By.id("painel-erros")).getText();
	}
	
	/*public String getMensagem() 
	{
		return browser.getPageSource();
	}*/
}
