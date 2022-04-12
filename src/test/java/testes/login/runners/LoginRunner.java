package testes.login.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features = {"classpath:features/login/login.feature"}, 
		///testes/src/test/resources/features/login/login.feature
		
		tags = "",
		glue = "testes.login.steps",
		///testes/src/test/java/testes/login/steps/LoginSteps.java
				
		monochrome = true, 
		dryRun = false,
		
		stepNotifications = true)
public class LoginRunner {

}