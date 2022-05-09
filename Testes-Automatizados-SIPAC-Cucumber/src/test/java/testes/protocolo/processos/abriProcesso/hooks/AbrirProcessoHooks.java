package testes.protocolo.processos.abriProcesso.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AbrirProcessoHooks {
	
	@Before
	public void doSomethingBefore() {
	}
	
//	Before(() -> {
//	});
	
	@Before(order = 10)
	public void doSomething(){
	    // Do something before each scenario
	}
	
//	Before(10, () -> {
//	});
	
	@After
	public void doSomethingAfter(Scenario scenario){
	    // Do something after after scenario
	}
	
//	After((Scenario scenario) -> {
//	});
}
