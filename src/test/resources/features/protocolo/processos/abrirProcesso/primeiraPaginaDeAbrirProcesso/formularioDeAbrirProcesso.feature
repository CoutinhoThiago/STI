#language: pt

@abrirProcesso
Funcionalidade: Formulario de Abrir Processos

Contexto:
		Dado um usuario que possui as credenciais corretas logado
    	| login     | senha        |
			| tcoutinho | Coutinho.123 |
		E o usuario na primeira pagina de abrir processos
	
	@abrirProcesso
	@primeiraPaginaDeAbrirProcessos
	@formulariodeAbrirProcessos
	Esquema do Cenario: Abrir processo do '<Tipo>' com interessado do tipo '<Categoria>'
		Quando selecionar a opcao precesso '<Tipo>'
		E preencher o forrmilario de abrir processo
		E preencher o forrmilario de adicionar interessado 
		E clicar em inserir
		Entao o interessado deve ser adicionado 
		E o interessado deve aparecer corretamente com os dados corretos
		E a mensagem de usuario adicinado com sucesso deve aparecer	
		Quando clicar em continuar 	
		Entao o usuario deve ser redirecionado para segunda pagina de abrir processos
		E os dados cadastrados no formulario Dados Gerais do Processo estao corretos
		E os dados cadastrados no formulario Dados do Interessado estao corretos
	Exemplos:
		| Tipo 					 | Categoria |
		
		| Eletronico 		 | Servidor  |
		| Eletronico		 | Aluno     | 
		| Eletronico		 | Unidade   |
		| Eletronico		 | Credor    |
		| Eletronico		 | Outros    |
		
		| Nao Eletronico | Servidor  |
		| Nao Eletronico | Aluno     | 
		| Nao Eletronico | Unidade   |
		| Nao Eletronico | Credor    |
		| Nao Eletronico | Outros    |