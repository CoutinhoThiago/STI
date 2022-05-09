package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import br.ufba.sipac.PageObject;
import br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos.Interessado.AdicionarInteressado;
import br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos.Interessado.Interessado;
import br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos.Interessado.RemoverInteressado;

public class AbrirProcessoPage extends PageObject
{
	public AbrirProcessoPage() 
	{
		super(null);
	}
	
	public void caminho()
	{
		this.browser.navigate().to("https://homologacaosipac.ufba.br/sipac/protocolo/index.jsf");
		this.browser.navigate().to("https://homologacaosipac.ufba.br/sipac/protocolo/menu.jsf");
		browser.findElement(By.id("menuForm:processo-movimentacao-abrirProc")).click();
	}

	public boolean isPaginaAtual() 
	{
		return browser.getCurrentUrl().contains(URL_LOGIN);
	}
	public boolean mensagemDeInteressadoAdicionadoComSucesso() 
	{
		return browser.getPageSource().contains("Interessado adicionado com sucesso.");
	}
	public boolean mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoServidor() 
	{
		return browser.getPageSource().contains("Servidor: Campo obrigatório não informado.");
	}
	public boolean mensagemDeInteressadoAdicionadoComEroPorFaltaDeDadosDoEmail() 
	{
		return browser.getPageSource().contains("E-mail: Campo obrigatório não informado.");
	}
	
	public void preencherFormularioAbrirProcessosComTodosOsDadosCorretos() throws InterruptedException 
	{	
		browser.findElement(By.id("dadosGeraisForm:classificacaoConarq")).click();
		browser.findElement(By.id("dadosGeraisForm:classificacaoConarq")).sendKeys("MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS"); //001 - MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS

        Thread.sleep(700);
        
		browser.findElement(By.id("dadosGeraisForm:classificacaoConarq")).sendKeys(Keys.DOWN);
		browser.findElement(By.id("dadosGeraisForm:classificacaoConarq")).sendKeys(Keys.ENTER);
		
        Thread.sleep(700);

		
		browser.findElement(By.id("dadosGeraisForm:assunto")).click();
		browser.findElement(By.id("dadosGeraisForm:assunto")).sendKeys("test");
		
		browser.findElement(By.id("dadosGeraisForm:natureza")).click();
		browser.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.DOWN);
		browser.findElement(By.id("dadosGeraisForm:natureza")).sendKeys(Keys.ENTER);
		
        Thread.sleep(700);
            
		browser.findElement(By.id("dadosGeraisForm:hipoteseLegalRestrito")).click();
		browser.findElement(By.id("dadosGeraisForm:hipoteseLegalRestrito")).sendKeys(Keys.DOWN);
		browser.findElement(By.id("dadosGeraisForm:hipoteseLegalRestrito")).sendKeys(Keys.ENTER);
		
		browser.findElement(By.id("dadosGeraisForm:observacao")).click();
		browser.findElement(By.id("dadosGeraisForm:observacao")).sendKeys("test");
		
		Thread.sleep(1500);
	}

	public void submeterFormularioAbrirProcessos() throws InterruptedException  
	{
		browser.findElement(By.name("dadosGeraisForm:j_id_jsp_2064664619_387")).submit();
	}
	
	public void confirmarSubmicaoDeFormularioAbrirProcessos() 
	{
		browser.findElement(By.name("interessadosForm:j_id_jsp_1187460267_249")).click();
	}
	
	public String getNumeroDeProtocolo()
	{
		try 
		{
			return browser.findElement(By.name("processoForm:j_id_jsp_1677317172_18")).getText(); 
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}
	public String getOrigemdoProcesso()
	{
		try 
		{
			return browser.findElement(By.id("processoForm:j_id_jsp_1677317172_20")).getText(); 
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}
	public String getUsuarioDeAtuacao()
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"processoForm\"]/table[1]/tbody/tr[4]/td")).getText();
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}
	public String getDataDeCdastro()
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"processoForm\"]/table[1]/tbody/tr[5]/td")).getText(); 
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}
	public String getAssuntoDoProcesso()
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"processoForm:linhaClassificacaoConarq\"]/td")).getText(); 
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}
	public String getAssuntoDetalhado()
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"processoForm\"]/table[1]/tbody/tr[7]/td")).getText(); 
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}
	public String getNaturezaDoProcesso()
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"processoForm:j_id_jsp_1677317172_49\"]/td")).getText();
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}
	public String getHipoteseLegal()
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"processoForm:linhaHipoteseLegal\"]/td")).getText(); 
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}
	public String getUnidadeDeOrigem()
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"processoForm\"]/table[1]/tbody/tr[10]/td")).getText(); 
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}
	public String getObservacao()
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"processoForm\"]/table[1]/tbody/tr[11]/td")).getText();
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}
	public String getSituacao()
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"processoForm\"]/table[1]/tbody/tr[12]/td")).getText();
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}

	public String getTipoInteressadoLogadoNoProcessoberto() 
	{
		try 
		{
			return browser.findElement(By.id("processoForm:j_id_jsp_1677317172_186:0:j_id_jsp_1677317172_205")).getText();
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}

	public String getEmailInteressadoLogadoNoProcessoberto()
	{
		try 
		{
			return browser.findElement(By.id("processoForm:j_id_jsp_1677317172_186:0:j_id_jsp_1677317172_202")).getText();
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}

	public String getNomeInteressadoLogadoNoProcessoberto() 
	{
		try 
		{
			return browser.findElement(By.id("processoForm:j_id_jsp_1677317172_186:0:j_id_jsp_1677317172_200")).getText();
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}

	public String getIdentificadorInteressadoLogadoNoProcessoberto()
	{
		try 
		{
			return browser.findElement(By.id("processoForm:j_id_jsp_1677317172_186:0:j_id_jsp_1677317172_197")).getText();
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}

	public void imprimir() 
	{
		browser.findElement(By.xpath("//*[@id=\"processoForm:j_id_jsp_1677317172_278\"]/tbody/tr/td[2]/a")).click();
	}

	public void adicionarInteressado(Interessado interessado) throws InterruptedException 
	{	
		AdicionarInteressado addInteressado = new AdicionarInteressado();
		addInteressado.adicionarInteressado(browser, interessado);
	}

	public void removerInteressado() throws InterruptedException
	{
		RemoverInteressado interessado = new RemoverInteressado();
		interessado.removerInteressado(browser);
	}
	
	/*public String get()
	{
		try 
		{
			return browser.findElement(By.xpath("")).getText();
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}*/
}















