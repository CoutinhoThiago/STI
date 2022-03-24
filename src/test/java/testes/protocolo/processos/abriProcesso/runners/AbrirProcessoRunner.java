

package testes.protocolo.processos.abriProcesso.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features = {"classpath:features/protocolo/processos/abrirProcesso/abrirProcesso.feature"}, 
		
		tags = "",
		glue = "classpath:testes.protocolo.processos.abriProcesso.steps",
				
		monochrome = true, 
		dryRun = false,
		
		stepNotifications = true)
public class AbrirProcessoRunner {

}