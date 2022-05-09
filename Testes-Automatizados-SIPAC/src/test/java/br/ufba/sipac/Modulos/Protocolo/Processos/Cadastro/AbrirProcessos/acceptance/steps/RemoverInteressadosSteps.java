package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos.acceptance.steps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import br.ufba.sipac.login.usuarios.UsuarioTestModuloDeProtocolo;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RemoverInteressadosSteps 
{
	protected static final String URL_LOGIN = "https://homologacaosipac.ufba.br/sipac/";
	private WebDriver driver;
	
	private String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	private String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@Before("@ScenarioRemoverInteressado")
	public void primeiro()
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		this.driver.navigate().to(URL_LOGIN);
		
		//this.driver.get(URL_LOGIN);
		//WebElement myDynamicElement = driver.findElement(By.name("login"));
		
        this.driver.findElement(By.name("login")).sendKeys(usuario);
        this.driver.findElement(By.name("senha")).sendKeys(senha);
        this.driver.findElement(By.xpath("//*[@id=\"conteudo\"]/div[3]/form/table/tfoot/tr/td/input")).click();
	}
	@After("@ScenarioRemoverInteressado")
	public void finalzar()
	{
		this.driver.quit();
	}
	
	@Order(1)
	@Dado("um interessado do tipo Servidor adicionado")
	public void um_interessado_do_tipo_servidor_adicionado() {
	}
		@Quando("clicar em remover interessado e confirmar a acao")
		public void clicar_em_remover_interessado_e_confirmar_a_acao() {
		}
			@Entao("o Servidor interessado deve ser excluido com sucesso e a mensagem {string} deve aparecer")
			public void o_servidor_interessado_deve_ser_excluido_com_sucesso_e_a_mensagem_deve_aparecer(String string) {
			}
	
	@Order(2)
	@Dado("um interessado do tipo Aluno adicionado")
	public void um_interessado_do_tipo_aluno_adicionado() {;
	}
		@Quando("clicar em remover interessado e confirmar a acao")
		public void clicar_em_remover_interessado_e_confirmar_a_acao() {
		}
			@Entao("o Aluno interessado deve ser excluido com sucesso e a mensagem {string} deve aparecer")
			public void o_aluno_interessado_deve_ser_excluido_com_sucesso_e_a_mensagem_deve_aparecer(String string) {
			}
	
	@Order(3)
	@Dado("um interessado do tipo Credor adicionado")
	public void um_interessado_do_tipo_credor_adicionado() {
	}
		@Quando("clicar em remover interessado e confirmar a acao")
		public void clicar_em_remover_interessado_e_confirmar_a_acao() {
		}
			@Entao("o Credor interessado deve ser excluido com sucesso e a mensagem {string} deve aparecer")
			public void o_credor_interessado_deve_ser_excluido_com_sucesso_e_a_mensagem_deve_aparecer(String string) {
			}
	
	@Order(4)
	@Dado("um interessado do tipo Unidade adicionado")
	public void um_interessado_do_tipo_unidade_adicionado() {
	}
		@Quando("clicar em remover interessado e confirmar a acao")
		public void clicar_em_remover_interessado_e_confirmar_a_acao() {
		}
			@Entao("o Unidade interessado deve ser excluido com sucesso e a mensagem {string} deve aparecer")
			public void o_unidade_interessado_deve_ser_excluido_com_sucesso_e_a_mensagem_deve_aparecer(String string) {
			}
	
	@Order(5)
	@Dado("um interessado do tipo Outros adicionado")
	public void um_interessado_do_tipo_outros_adicionado() {
	}
		@Quando("clicar em remover interessado e confirmar a acao")
		public void clicar_em_remover_interessado_e_confirmar_a_acao() {
		}
			@Entao("o Outros interessado deve ser excluido com sucesso e a mensagem {string} deve aparecer")
			public void o_outros_interessado_deve_ser_excluido_com_sucesso_e_a_mensagem_deve_aparecer(String string) {
			}
}
