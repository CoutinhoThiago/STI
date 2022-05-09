package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos.acceptance.steps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ufba.sipac.login.usuarios.UsuarioTestModuloDeProtocolo;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdicionarInteressadoSteps 
{
	protected static final String URL_LOGIN = "https://homologacaosipac.ufba.br/sipac/";
	private WebDriver driver;

	private String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	private String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@Before("@ScenarioAdicionarInteressado")
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
	@After("@ScenarioAdicionarInteressado")
	public void finalzar()
	{
		this.driver.quit();
	}
	
	@Order(1)
	@Dado("um primeiro usuario logoado com as permissoes adequadas")
	public void um_primeiro_usuario_logoado_com_as_permissoes_adequadas() {
			  
	}
		@Quando("acessa a primeira pagina de abrir processos")
		public void acessa_a_primeira_pagina_de_abrir_processos() {
		}
			@Quando("preencher o formulario para adicionar um novo interessado do tipo Servidor")
			public void preencher_o_formulario_para_adicionar_um_novo_interessado_do_tipo_servidor() {
			}
				@Quando("clicar em salvar")
				public void clicar_em_salvar() {
				}
					@Entao("o Servidor interessado deve ser adicionado com sucesso e a mensagem {string} deve aparecer")
					public void o_servidor_interessado_deve_ser_adicionado_com_sucesso_e_a_mensagem_deve_aparecer(String string) {
					}
	
	@Order(2)
	@Dado("um segundo usuario logoado com as permissoes adequadas")
	public void um_segundo_usuario_logoado_com_as_permissoes_adequadas() {
	}
		@Quando("preencher o formulario para adicionar um novo interessado do tipo Aluno")
		public void preencher_o_formulario_para_adicionar_um_novo_interessado_do_tipo_aluno() {
		}
			@Quando("acessa a primeira pagina de abrir processos e preenche o formulario para adicionar um novo interessado do tipo Aluno e salva")
			public void acessa_a_primeira_pagina_de_abrir_processos_e_preenche_o_formulario_para_adicionar_um_novo_interessado_do_tipo_aluno_e_salva() {
			}
				@Quando("clicar em salva")
				public void clicar_em_salva() {
				}
					@Entao("o Aluno interessado deve ser adicionado com sucesso e a mensagem {string} deve aparecer")
					public void o_aluno_interessado_deve_ser_adicionado_com_sucesso_e_a_mensagem_deve_aparecer(String string) {
					}
	
	@Order(3)
	@Dado("um terceiro usuario logoado com as permissoes adequadas")
	public void um_terceiro_usuario_logoado_com_as_permissoes_adequadas() {
	}
		@Quando("acessa a primeira pagina de abrir processos")
		public void acessa_a_primeira_pagina_de_abrir_processos() {
		}
			@Quando("preenche o formulario para adicionar um novo interessado do tipo Credor")
			public void preenche_o_formulario_para_adicionar_um_novo_interessado_do_tipo_credor() {
			}
				@Quando("clicar em salvar")
				public void clicar_em_salvar() {
				}
					@Entao("o Credor interessado deve ser adicionado com sucesso e a mensagem {string} deve aparecer")
					public void o_credor_interessado_deve_ser_adicionado_com_sucesso_e_a_mensagem_deve_aparecer(String string) {
					}
	
	@Order(4)
	@Dado("um quarto usuario logoado com as permissoes adequadas")
	public void um_quarto_usuario_logoado_com_as_permissoes_adequadas() {
	}
		@Quando("acessa a primeira pagina de abrir processos")
		public void acessa_a_primeira_pagina_de_abrir_processos() {
		}
			@Quando("preenche o formulario para adicionar um novo interessado do tipo Unidade")
			public void preenche_o_formulario_para_adicionar_um_novo_interessado_do_tipo_unidade() {
			}
				@Quando("clicar em salvar")
				public void clicar_em_salvar() {
				}
					@Entao("o Unidade interessado deve ser adicionado com sucesso e a mensagem {string} deve aparecer")
					public void o_unidade_interessado_deve_ser_adicionado_com_sucesso_e_a_mensagem_deve_aparecer(String string) {
					}
	
	@Order(5)
	@Dado("um quinto usuario logoado com as permissoes adequadas")
	public void um_quinto_usuario_logoado_com_as_permissoes_adequadas() {
	}
		@Quando("acessa a primeira pagina de abrir processos")
		public void acessa_a_primeira_pagina_de_abrir_processos() {
		}
			@Quando("preenche o formulario para adicionar um novo interessado do tipo Outros")
			public void preenche_o_formulario_para_adicionar_um_novo_interessado_do_tipo_outros() {
			}
				@Quando("clicar em salvar")
				public void clicar_em_salvar() {
				}
					@Entao("o Outros interessado deve ser adicionado com sucesso e a mensagem {string} deve aparecer")
					public void o_outros_interessado_deve_ser_adicionado_com_sucesso_e_a_mensagem_deve_aparecer(String string) {
					}
}
