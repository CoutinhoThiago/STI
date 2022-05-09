#language: pt

@abrirProcesso
Funcionalidade: Abrir Processos

Contexto:
		Dado um usuario que possui as credenciais corretas logado
    	| login     | senha        |
			| tcoutinho | Coutinho.123 |
	@abrirProcesso
	@segundaPaginaDeAbrirProcessos
	@botaoCancelar
	Esquema do Cenario: botoao '<Botao>' funcionando corretamente para processo do '<Tipo>' com interessado do tipo '<Categoria>'
				#Dado o usuario na primeira pagina de abrir processos
		Quando preencher o formulario de Dados do Interessado '<Categoria>' '<NOME>' '<EMAIL>'
		E clicar no botao inserir
		Entao a mensagem interessado adicionado com sucesso deve aparecer
		E o interessado deve ser inserido
	Exemplos:
		| Categoria | NOME                                                | EMAIL                       |  
		| Servidor  | ELEILDES SILVA DE SOUZA                             | eleildessouza12!!@gmail.com |
		| Aluno     | THIAGO COUTINHO SOUSA SILVA                         | thiago.coutinho!!@ufba.br   |
		| Credor    | UFBA - UNIVERSIDADE FEDERAL DA BAHIA                | ufba!!@ufba.br              |
		| Unidade   | SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA  | sti!!@ufba.br               |
		| Outros    | | |
		
	@abrirProcesso
	@segundaPaginaDeAbrirProcessos
	@botaoVoltar
	Esquema do Cenario: botoao '<Botao>' funcionando corretamente para processo do '<Tipo>' com interessado do tipo '<Categoria>'
		Dado um processodo tipo '<Tipo>' com interessado do tipo '<Categoria>' adicionado
		E o usuario na segunda pagina de abrir processos
		Quando clicar no botao '<Botao>'
		Entao o usuario devera ser redirecionado para a primeira pagina de abrir processos
	Exemplos:
		| Tipo 					 | Categoria | Botao     |
		
		| Eletronico 		 | Servidor  | Voltar    |
		| Eletronico		 | Aluno     | Voltar    | 
		| Eletronico		 | Unidade   | Voltar    |
		| Eletronico		 | Credor    | Voltar    |
		| Eletronico		 | Outros    | Voltar    |
		| Nao Eletronico | Servidor  | Voltar    |
		| Nao Eletronico | Aluno     | Voltar    |
		| Nao Eletronico | Unidade   | Voltar    |
		| Nao Eletronico | Credor    | Voltar    |
		| Nao Eletronico | Outros    | Voltar    |
		
	@abrirProcesso
	@segundaPaginaDeAbrirProcessos
	@botaoConfirmar
	Esquema do Cenario: botoao '<Botao>' funcionando corretamente para processo do '<Tipo>' com interessado do tipo '<Categoria>'
		Dado um processodo tipo '<Tipo>' com interessado do tipo '<Categoria>' adicionado
		E o usuario na segunda pagina de abrir processos
		Quando clicar no botao '<Botao>'
		Entao o usuario devera ser redirecionado para a pagina de comprovante
		E os dados cadastrados no formulario Dados Gerais do Processo estao corretos
		E os dados cadastrados no formulario Dados do Interessado estao corretos
		E a mensagem de processo cadastrado com sucesso deve aparecer
	Exemplos:
		| Tipo 					 | Categoria | Botao     |
		
		| Eletronico 		 | Servidor  | Confirmar |
		| Eletronico		 | Aluno     | Confirmar | 
		| Eletronico		 | Unidade   | Confirmar |
		| Eletronico		 | Credor    | Confirmar |
		| Eletronico		 | Outros    | Confirmar |
		| Nao Eletronico | Servidor  | Confirmar |
		| Nao Eletronico | Aluno     | Confirmar |
		| Nao Eletronico | Unidade   | Confirmar |
		| Nao Eletronico | Credor    | Confirmar |
		| Nao Eletronico | Outros    | Confirmar |
		
		
		
		
		
		