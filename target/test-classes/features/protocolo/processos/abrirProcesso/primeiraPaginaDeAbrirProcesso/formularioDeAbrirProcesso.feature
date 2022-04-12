#language: pt

@abrirProcesso
Funcionalidade: Formulario de Abrir Processos

Contexto:
		Dado um usuario que possui as credenciais corretas logado
    	| login     | senha        |
			| tcoutinho | Coutinho.123 |
		E o usuario na primeira pagina de abrir processos
	
#-----formulario de Abrir Processos-----

	@formularioDeAbrirProcessos
	Esquema do Cenario: Abrir processo do tipo '<Tipo>' com interessado do tipo '<Categoria>'
		Dado o usuario na primeira pagina de abrir processos
		E um interessado do tipo '<Categoria>' adicionado
		Quando selecionar a opcao precesso '<Tipo>'
		E preencher o forrmilario de abrir processo
		E clicar em continuar 	
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