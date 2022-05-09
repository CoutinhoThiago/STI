package br.ufba.sipac.login.acceptance;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features = "classpath:features/login.feature", tags = "@login")
public class LoginCucumberRunner {

}
