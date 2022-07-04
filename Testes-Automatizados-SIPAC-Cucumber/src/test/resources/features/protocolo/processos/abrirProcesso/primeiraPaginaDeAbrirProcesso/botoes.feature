#language: pt

@abrirProcesso
Funcionalidade: Botoes

Contexto:
		Dado um usuario que possui as credenciais corretas logado
    	| login     | senha        |
			| tcoutinho |  |
	Dado o usuario na primeira pagina de abrir processos
	
	@abrirProcesso
	@primeiraPaginaDeAbrirProcessos
	@botoes
	@botaoCancelar
	Cenario: Botao cancelar funcionando corretamente
		Quando clicar no botao cancelar
		E confirmar o pop-up
		Entao o usuario devera ser redirecionado para a pagina anterior
		
	@abrirProcesso
	@primeiraPaginaDeAbrirProcessos
	@botoes
	@botaoListarClassificacoesCONARQ
	Cenario: Botao listar classificacoes conarq funcionando corretamente
		Dado
		Quando 
		Entao 
		
	@removerClassificacaoConarq
	Cenario: Botao Remover Classificacao CONARQ funcionando corretamente
		Quando adicionar uma classificacao CONARQ 
		E clicar em no botao Remover Classificacao CONARQ
		E confirmar o pop-up
		Entao a Classificacao CONARQ deve ser removida
		E a mensagem de classificacao CONARQ removida deve aparecer
	
	@abrirProcesso
	@primeiraPaginaDeAbrirProcessos
	@botoes
	@botaoContinuar 
	Cenario: Botao continuar funcionando corretamente
		Dado 
		Quando 
		Entao 
		
		
		
		
		
		
		
		
		
		
		
		
		
