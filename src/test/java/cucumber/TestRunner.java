package cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features = {
				//"classpath:features/login/login.feature",
				//"classpath:features/abrirProcessos/caminhos.feature",
				//"classpath:features/abrirProcessos/abrirProcessos.feature",
				"classpath:features/abrirProcessos",
				}, 
		tags = "@abrirProcessos")
public class TestRunner {

}
