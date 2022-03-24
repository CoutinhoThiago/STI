package testes;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features = {
				//Login
				"classpath:features/login/login.feature",
				//Abrir Processos
				"classpath:features/protocolo/processos/abrirProcesso/abrirProcesso.feature",
				}, 
		
		tags = "",
				
		monochrome = true, 
		dryRun = false,
		plugin = {"pretty"},
		//lexical, reverse, random or random:[seed] (CLI only). default: lexical
		
		//e você estiver usando o Cucumber com uma estrutura de 
		//DI e quiser usar uma fábrica de objetos personalizada
		//objectFactory = FooFactory.class
		
		stepNotifications = true)

public class TestRunner{
}
