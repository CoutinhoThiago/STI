package br.ufba.sipac.login.acceptance.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import br.ufba.sipac.login.usuarios.UsuarioTestModuloDeProtocolo;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginSteps {
	
	protected static final String URL_LOGIN = "https://homologacaosipac.ufba.br/sipac/";
	private WebDriver driver;
	
	private String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	private String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@Before
	public void primeiro()
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS).pageLoadTimeout(30, TimeUnit.SECONDS);
        this.driver.navigate().to(URL_LOGIN);
	}
	
	@Test
	@Order(1)
	@Dado("o usuario valido")
	public void o_usuario_valido() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS).pageLoadTimeout(30, TimeUnit.SECONDS);
        this.driver.navigate().to(URL_LOGIN);
        this.driver.findElement(By.name("login")).sendKeys(usuario);
        this.driver.findElement(By.name("senha")).sendKeys(senha);
	}
		@Quando("realiza login")
		public void realiza_login() {
			this.driver.findElement(By.xpath("//*[@id=\"conteudo\"]/div[3]/form/table/tfoot/tr/td/input")).click();	    
		}
			@Entao("redirecionado para a pagina inicial do SIPAC")
			public void redirecionado_para_a_pagina_inicial_do_sipac() {
				Assert.assertFalse(driver.getCurrentUrl().equals(URL_LOGIN));
				
				String url = driver.findElement(By.xpath("//*[@id=\"info-usuario\"]/p[2]")).getText();
				Assert.assertEquals(url, "THIAGO COUTINHO SOUSA SILVA");
				this.driver.quit();
			}

	@Test
	@Order(2)
	@Dado("um usuario valido e uma senha invalida")
	public void um_usuario_valido_e_uma_senha_invalida() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS).pageLoadTimeout(30, TimeUnit.SECONDS);
        this.driver.navigate().to(URL_LOGIN);
		this.driver.findElement(By.name("login")).sendKeys(usuario);
        this.driver.findElement(By.name("senha")).sendKeys("Invalido");
	}
		@Quando("tenta se logar")
		public void tenta_se_logar() {
			this.driver.findElement(By.xpath("//*[@id=\"conteudo\"]/div[3]/form/table/tfoot/tr/td/input")).click();	    
		}
			@Entao("continua na pagina de login")
			public void continua_na_pagina_de_login() {
				//Assert.assertTrue(driver.getCurrentUrl().equals("URL_LOGIN"));
				String mensagem = driver.findElement(By.xpath("//*[@id=\"conteudo\"]/center[1]/font/b")).getText();
				Assert.assertEquals(mensagem, "Usuário e/ou senha inválidos");
				this.driver.quit();
			}
}
