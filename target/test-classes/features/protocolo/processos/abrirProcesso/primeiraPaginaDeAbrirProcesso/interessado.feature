#language: pt

@abrirProcesso
Funcionalidade: Interessado

Contexto:
		Dado um usuario que possui as credenciais corretas logado
    	| login     | senha        |
			| tcoutinho | Coutinho.123 |
		Dado o usuario na primeira pagina de abrir processos
		
	@abrirProcesso
	@primeiraPaginaDeAbrirProcessos	
	@interessado
	@AdicionarInteressado
	Esquema do Cenario: Tentar adicionar interessado do tipo '<Categoria>' sem dados
		Quando deixar o formulario de Dados do Interessado em branco
		E clicar no botao inserir
		Entao a mensagem "" deve aparecer
	Exemplos:
		| Categoria |
		| Servidor  |
		| Aluno     | 
		| Unidade   |
		| Credor    |
		| Outros    | 
	
	@abrirProcesso
	@primeiraPaginaDeAbrirProcessos	
	@interessado
	@AdicionarInteressado
	Esquema do Cenario: Tentar adicionar interessado do tipo '<Categoria>' com os dados incorretos
		Quando preencher o formulario de Dados do Interessado com dados incorretos
		E clicar no botao inserir
		Entao a mensagem "" deve aparecer
	Exemplos:
		| Categoria |
		| Servidor  |
		| Aluno     | 
		| Unidade   |
		| Credor    |
		| Outros    | 
		
	@abrirProcesso
	@primeiraPaginaDeAbrirProcessos	
	@interessado
	@AdicionarInteressado
	Esquema do Cenario: Adicionar interessado do tipo '<Categoria>' com os dados corretos
		Quando preencher o formulario de Dados do Interessado
		E clicar no botao inserir
		Entao a mensagem "Interessado adicionado com sucesso." deve aparecer
		E o interessado deve ser inserido
	Exemplos:
		| Categoria |
		| Servidor  |
		| Aluno     | 
		| Unidade   |
		| Credor    |
		| Outros    | 
		
	@abrirProcesso
	@primeiraPaginaDeAbrirProcessos	
	@interessado
	@removerInteressado
	Esquema do Cenario: Remover interessado do tipo '<Categoria>'
		Quando inserir um interessado do tipo '<Categoria>'
		E clicar no botao Remover Interessado
		Entao a mensagem "Interessado removido com sucesso." deve aparecer
		E o interessado deve ser removido
	Exemplos:
		| Categoria |
		| Servidor  |
		| Aluno     | 
		| Unidade   |
		| Credor    |
		| Outros    | 