# language: pt

@abrirProcessos
@botoes
Funcionalidade: Botoes

  Contexto:
		Dado um usuario valido logado
  		| login     | senha        |
			| tcoutinho | Coutinho.123 |
		Quando o usuario estiver na primeira pagina de abrir processos
		
	@botaoCancelar	
	Cenario: Botao cancelar funcionando corretamente
		Quando clicar em no botao cancelar
		E confirmar o pop-up
		Entao o usuario deve retornar para a pagina inicial do sipac
		
	@removerClassificacaoConarq
	Cenario: Botao Remover Classificacao CONARQ funcionando corretamente
		Quando adicionar uma classificacao CONARQ 
		E clicar em no botao Remover Classificacao CONARQ
		E confirmar o pop-up
		Entao a Classificacao CONARQ deve ser removida
		E a mensagem de classificacao CONARQ removida deve aparecer