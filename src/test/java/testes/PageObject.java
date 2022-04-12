package testes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject {
	private static String URL_LOGIN = "https://homologacaosipac.ufba.br/sipac/";
	protected WebDriver driver;

	public PageObject(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		if (driver == null) {
            this.driver = new ChromeDriver();
        } 
		else {
            this.driver = driver;
        }
		this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}
	//Confirmar alert
	public void confirmarAlert() throws NoSuchElementException {
		driver.switchTo().alert().accept();
		try { //gambiarra
			String CI = driver.findElement(By.xpath("//*[@id=\"mensagem-erro\"]/h3")).getText();//*[@id="mensagem-erro"]/h3
			if (CI.equals("Comportamento Inesperado!")) {
				this.driver.navigate().refresh();
			}
		} 
		catch (NoSuchElementException e) {}
	}
	//Fechar as abas no final
    public void fechar() {
		this.driver.quit();
	}
    //Resetar navegador
    public void reload() {
    	this.driver.navigate().refresh();
    }
	
	//contexto - efetuar login
	public void efetuarLogin(String login, String senha) {
		// ir para pagina de login
		this.driver.navigate().to(URL_LOGIN);
		//preencher formulario de login
		this.driver.findElement(By.name("login")).sendKeys(login);
		this.driver.findElement(By.name("senha")).sendKeys(senha);
		//efetuar login
		this.driver.findElement(By.cssSelector("input[type=submit]")).click();
	}
	
	//mensagens
	public String getMensagem() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"painel-erros\"]/ul/li")).getText());
		//*[@id="painel-erros"]/ul/li
		
		return driver.findElement(By.xpath("//*[@id=\"painel-erros\"]/ul/li")).getText();
	}
	//public String getMensagem() throws NoSuchElementException{
	//	return browser.findElement(By.id("painel-erros")).getText();
	//}
	
	//url
	public String isPaginaAtual() {
		return driver.getCurrentUrl();
	}
}

