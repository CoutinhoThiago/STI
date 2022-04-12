package testes.protocolo.processos.abriProcesso.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features = {
				//"classpath:features/protocolo/processos/abrirProcesso/abrirProcesso.feature", 
				
				"classpath:features/protocolo/processos/abrirProcesso/caminhos/caminhosAbrirProcesso.feature",
				"classpath:features/protocolo/processos/abrirProcesso/primeiraPaginaDeAbrirProcesso/botoes.feature",
				"classpath:features/protocolo/processos/abrirProcesso/primeiraPaginaDeAbrirProcesso/interessado.feature",
				}, 
		//testes/src/test/resources/features/protocolo/processos/abrirProcesso/abrirProcesso.feature
		
		tags = "",
		glue = "testes.protocolo.processos.abriProcesso.steps",	
		//testes/src/test/java/testes/protocolo/processos/abriProcesso/steps/AbrirProcessoSteps.java
				
		monochrome = true, 
		dryRun = false,
		
		stepNotifications = true)
public class AbrirProcessoRunner {

}