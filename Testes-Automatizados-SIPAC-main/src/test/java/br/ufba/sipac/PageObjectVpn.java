package br.ufba.sipac;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectVpn
{
	protected static final String URL_LOGIN = "https://treinamentosipac.ufba.br/sipac/";

	protected WebDriver browser;
	protected Duration time = Duration.ofSeconds(20);
	
	public PageObjectVpn(WebDriver browser)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		if (browser == null) 
		{
            this.browser = new ChromeDriver();
            this.browser.get("https://acesso.ufba.br:65443/remote/login?lang=en");
            this.browser.manage().window().maximize();
            this.browser.navigate().to(URL_LOGIN);

        	WebDriverWait wait = new WebDriverWait(this.browser,time);
        	    
        	String abaInicial = this.browser.getWindowHandle();
        		
        	this.browser.findElement(By.id("username")).sendKeys("bruno.fortunato");       
        	this.browser.findElement(By.id("credential")).sendKeys("Bobesponja01");            
        	this.browser.findElement(By.id("login_button")).click();            
        	wait.until(ExpectedConditions.urlMatches("https://acesso.ufba.br:65443/sslvpn/portal.html#/"));          
        	this.browser.findElement(By.xpath("//*[@id=\"navbar-view-section\"]/div/div/div[4]/div[2]/button[1]")).click();                
        	this.browser.findElement(By.id("url")).sendKeys("https://teste2sipac.ufba.br/");
        	this.browser.findElement(By.xpath("//*[@id=\'navbar-view-section\']/div/div/div[2]/form/div[2]/button[1]")).click();    
        	Set<String>	abas = this.browser.getWindowHandles();        
        	for(String	aba:	abas)
        	{
        		if(!aba.equals(abaInicial))
        		{
        			this.browser.switchTo().window(aba);
        		}
            this.browser.findElement(By.className("acesso_centro_bg")).click();  
        	} 
		}
		else 
		{
            this.browser = browser;
            this.browser.get("https://acesso.ufba.br:65443/remote/login?lang=en");
            this.browser.manage().window().maximize();
            this.browser.navigate().to(URL_LOGIN);
            
            WebDriverWait wait = new WebDriverWait(this.browser,time);
        	String abaInicial = this.browser.getWindowHandle();
        	this.browser.findElement(By.id("username")).sendKeys("bruno.fortunato");
            this.browser.findElement(By.id("credential")).sendKeys("Bobesponja01");
            this.browser.findElement(By.id("login_button")).click();
            wait.until(ExpectedConditions.urlMatches("https://acesso.ufba.br:65443/sslvpn/portal.html#/"));
            this.browser.findElement(By.xpath("//*[@id=\"navbar-view-section\"]/div/div/div[4]/div[2]/button[1]")).click();
            this.browser.findElement(By.id("url")).sendKeys("https://teste2sipac.ufba.br/");
            this.browser.findElement(By.xpath("//*[@id=\'navbar-view-section\']/div/div/div[2]/form/div[2]/button[1]")).click();
            Set<String>	abas = this.browser.getWindowHandles();
            for(String	aba:	abas)
            {
        		if(!aba.equals(abaInicial))
        		{
        			this.browser.switchTo().window(aba);
        		}
            }
            this.browser.findElement(By.className("acesso_centro_bg")).click();
        }
	}
	
	public void preencherFormularioDeLoginVpn(String username, String password)
	{
		this.browser.findElement(By.name("login")).sendKeys(username);
        this.browser.findElement(By.name("senha")).sendKeys(password);
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
}