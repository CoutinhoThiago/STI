package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos.acceptance;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features = "classpath:features/abrirProcessos", 
		tags = "@interessado")

public class AbrirProcessosRunner {

}
