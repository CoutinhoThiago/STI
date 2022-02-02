# language: pt

@abrirProcessos
@interessado
Funcionalidade: Adicionar Interessado

  Contexto:
		Dado um usuario valido logado
  		| login     | senha        |
			| tcoutinho | Coutinho.123 |
		Quando o usuario estiver na primeira pagina de abrir processos
		
	@adicionarInteressado
	Esquema do Cenario: Adicionar interessado do tipo '<interessado>'
		Quando preencher o formulario de Dados do Interessado
		E clicar no botao inserir
		Entao a mensagem "Interessado adicionado com sucesso." deve aparecer
		E o interessado deve ser inserido
	Exemplos:
		| interessado |
  	| Servidor    | 	 	
	 	| Aluno       |
	 	| Credor      |
	 	| Unidade     |
	 	| Outros      |
	 	
	@adicionarInteressado
	Esquema do Cenario: Adicionar interessado do tipo '<interessado>' e nao notificar o interessado
		Quando preencher o formulario de Dados do Interessado
		E clicar no botao inserir
		Entao a mensagem "Interessado adicionado com sucesso." deve aparecer
		E o interessado deve ser inserido
	Exemplos:
		| interessado |
  	| Servidor    | 	 	
	 	| Aluno       |
	 	| Credor      |
	 	| Unidade     |
	 	| Outros      |
	 	
	 	
	 	