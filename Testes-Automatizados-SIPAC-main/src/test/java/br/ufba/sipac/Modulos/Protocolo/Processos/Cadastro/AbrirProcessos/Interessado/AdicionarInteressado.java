package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos.Interessado;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AdicionarInteressado 
{
	public void adicionarInteressado(WebDriver browser, Interessado interessado) throws InterruptedException
	{
		Thread.sleep(1000);
	
		if (interessado.getCategoria() == "Servidor")
		{
			//browser.findElement(By.name("dadosGeraisForm:j_id_jsp_1137659535_119")).click();
			//browser.findElement(By.name("dadosGeraisForm:j_id_jsp_1137659535_119")).sendKeys(Keys.TAB);

			browser.findElement(By.name("dadosGeraisForm:nomeServidorInteressado")).click();
			browser.findElement(By.name("dadosGeraisForm:nomeServidorInteressado")).sendKeys(interessado.getNome()); //ELIEIDE SANTOS ORRICO (1574037)
	        
			Thread.sleep(2000);

			browser.findElement(By.name("dadosGeraisForm:nomeServidorInteressado")).sendKeys(Keys.TAB);
			
			Thread.sleep(700);

		}
		else if (interessado.getCategoria() == "Aluno")
		{
			//*[@id="dadosGeraisForm"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select
			browser.findElement(By.name("dadosGeraisForm:j_id_jsp_2064664619_130")).click();
			browser.findElement(By.name("dadosGeraisForm:j_id_jsp_2064664619_130")).sendKeys(Keys.DOWN, Keys.TAB);

			Thread.sleep(700);
	
			browser.findElement(By.name("dadosGeraisForm:nomeAluno")).click();
			browser.findElement(By.name("dadosGeraisForm:nomeAluno")).sendKeys(interessado.getNome()); //ELIEIDE SANTOS ORRICO (1574037)
			
			Thread.sleep(2000);

			browser.findElement(By.name("dadosGeraisForm:nomeAluno")).sendKeys(Keys.TAB);

	        Thread.sleep(700);
	        
		}
		else if (interessado.getCategoria() == "Credor")
		{
			browser.findElement(By.name("dadosGeraisForm:j_id_jsp_2064664619_130")).click();
			browser.findElement(By.name("dadosGeraisForm:j_id_jsp_2064664619_130")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.TAB);

			Thread.sleep(700);
			
			browser.findElement(By.name("dadosGeraisForm:nomeCredor")).click();
			browser.findElement(By.name("dadosGeraisForm:nomeCredor")).sendKeys(interessado.getNome()); //ELIEIDE SANTOS ORRICO (1574037)
			
			Thread.sleep(2000);

			browser.findElement(By.name("dadosGeraisForm:nomeCredor")).sendKeys(Keys.TAB);
			
			Thread.sleep(700);

		}
		else if (interessado.getCategoria() == "Unidade")
		{
			browser.findElement(By.name("dadosGeraisForm:j_id_jsp_2064664619_130")).click();
			browser.findElement(By.name("dadosGeraisForm:j_id_jsp_2064664619_130")).sendKeys(Keys.DOWN, Keys.DOWN,Keys.DOWN,Keys.TAB);

			Thread.sleep(700);
			
			browser.findElement(By.name("dadosGeraisForm:unidade")).click();
			browser.findElement(By.name("dadosGeraisForm:unidade")).sendKeys(interessado.getNome()); //ELIEIDE SANTOS ORRICO (1574037)
			
			Thread.sleep(2000);
			
			browser.findElement(By.name("dadosGeraisForm:unidade")).sendKeys(Keys.TAB);

	        Thread.sleep(700);
		}
		else
		{
			
		}
		if(interessado.getNotificar() == true)	
		{
			browser.findElement(By.id("dadosGeraisForm:notificarInteressado:0")).click();

			Thread.sleep(700);
			
			browser.findElement(By.name("dadosGeraisForm:email")).clear();
			browser.findElement(By.name("dadosGeraisForm:email")).sendKeys(interessado.getEmail());
			
			Thread.sleep(1500);
			
			browser.findElement(By.name("dadosGeraisForm:email")).sendKeys(Keys.TAB);

		}
		else
		{
			browser.findElement(By.id("dadosGeraisForm:notificarInteressado:1")).click();
			/*try
	        {
	            Thread.sleep(700);
				browser.findElement(By.name("dadosGeraisForm:email")).clear();
				browser.findElement(By.name("dadosGeraisForm:email")).sendKeys(email);
				Thread.sleep(1500);
				browser.findElement(By.name("dadosGeraisForm:email")).sendKeys(Keys.TAB);
	        }
			catch (InterruptedException e)
	        {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }*/		
		}
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tfoot/tr/td/input")).click();
		
	}
}
