package cucumber.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	public void confirmarAlert() {
		driver.switchTo().alert().accept();
	}
	//Fechar as abas no final
    public void fechar() {
		this.driver.quit();
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
}
