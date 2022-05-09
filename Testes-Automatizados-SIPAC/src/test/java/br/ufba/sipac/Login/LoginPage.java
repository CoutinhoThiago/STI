package br.ufba.sipac.login;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import br.ufba.sipac.PageObject;

public class LoginPage extends PageObject
{
	public LoginPage() 
	{
		super(null);
	}

	public String getNomeUsuarioLogado() 
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"info-usuario\"]/p[2]")).getText(); //THIAGO COUTINHO SOUSA SILVA
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}

	public boolean isPaginaAtual() 
	{
		return browser.getCurrentUrl().contains(URL_LOGIN);
	}

	public boolean isMensagemDeLoginInvalidoVisivel() 
	{
		return browser.getPageSource().contains("Usuário e/ou senha inválidos");
	}
}