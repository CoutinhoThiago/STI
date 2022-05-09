package testadorDeRequisicoes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestaRequisicoesDeAuxilioPage {
	protected static final String URL_LOGIN = "https://treinamentosipac.ufba.br/sipac/";

	protected WebDriver browser;
	//protected Duration time = Duration.ofSeconds(30);
	
	public TestaRequisicoesDeAuxilioPage(WebDriver browser)
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
        this.browser.findElement(By.name("senha")).sendKeys(password, Keys.ENTER);
	}
	public void efetuarLogin() 
	{
		this.browser.findElement(By.xpath("//*[@id=\"conteudo\"]/div[3]/form/table/tbody/tr[1]/td/input")).submit();
	}

	public void logarComoCarina() throws InterruptedException {
		try {
			this.browser.findElement(By.xpath("//*[@id=\"info-usuario\"]/p[2]/text()"));
		} catch (Exception e) {
			this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/logarComo.do");
			this.browser.findElement(By.xpath("//*[@id=\"conteudo\"]/form/table/tbody/tr/td/input")).sendKeys("carina", Keys.ENTER);
			
			this.browser.findElement(By.xpath("//*[@id=\"conteudo\"]/table/tbody/tr/td/table/tfoot/tr/td/input[1]")).click();
			Thread.sleep(500);
		}
	}
	public void caminhoParaRequisicaoDeAuxilio() {
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/showViewAuxilio.do?cadastro=true");
	}

	public void selecionaTipoDeAuxilio() {
		this.browser.findElement(By.xpath("//*[@id=\"reqForm\"]/table/tbody/tr/td/select")).click();
		this.browser.findElement(By.xpath("//*[@id=\"reqForm\"]/table/tbody/tr/td/select")).sendKeys(Keys.DOWN, Keys.ENTER);
		this.browser.findElement(By.xpath("//*[@id=\"reqForm\"]/table/tfoot/tr/td/input[2]")).click();
	}

	public String tesatarNumeroDeMatriculas(String as2) {
		this.browser.findElement(By.xpath("//*[@id=\"mat_proponente\"]")).clear();
		this.browser.findElement(By.xpath("//*[@id=\"mat_proponente\"]")).click();
		this.browser.findElement(By.xpath("//*[@id=\"mat_proponente\"]")).sendKeys("as2", Keys.ENTER);
		//*[@id="mat_proponente"]
		
		return(this.browser.findElement(By.xpath("//*[@id=\"conteudo\"]/table/tbody/tr/td[2]/font/li/b")).getText());
	}

}
