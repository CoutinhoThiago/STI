package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos.Interessado;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class RemoverInteressado 
{

	public void removerInteressado(WebDriver browser) throws InterruptedException
	{
		Thread.sleep(700);
			
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:j_id_jsp_2064664619_182:0:j_id_jsp_2064664619_206\"]/a/img")).click();
		//*[@id="dadosGeraisForm:j_id_jsp_1137659535_169:0:j_id_jsp_1137659535_193"]/a/img
			
		Thread.sleep(700);

		Alert alert = browser.switchTo().alert();
		alert.accept();
		
		Thread.sleep(700); //isso é uma gambiarra para a proxima gambiarra funcionar
		
		try // isso é uma grande gambiarra pq o sipac n funciona sem isso 
		{
			String telaDeCi = browser.findElement(By.id("mensagem-erro")).getText();
			
			if(telaDeCi == "Comportamento Inesperado!");
			{
				browser.navigate().refresh(); //gambiarra
			}
		}
		catch (NoSuchElementException e)
		{
			e.printStackTrace();
		}
	}
		
	
}
