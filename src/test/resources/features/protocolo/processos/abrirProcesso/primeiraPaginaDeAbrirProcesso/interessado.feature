#ISO-8859-1
#encoding: utf-8
#language: pt

@abrirProcesso
Funcionalidade: Interessado

Contexto:
		Dado um usuario que possui as credenciais corretas logado
    	| login     | senha        |
			| tcoutinho | Coutinho.123 |
		Dado o usuario na primeira pagina de abrir processos
		
#-----Interessado-----	
	@interessado
	@AdicionarInteressadoSemDados
	Esquema do Cenario: Tentar adicionar interessado do tipo '<categoria>' sem dados
		Dado o usuario na primeira pagina de abrir processos
		Quando deixar o formulario de Dados do Interessado em branco
		E clicar no botao inserir
		Entao a mensagem interessado campo obrigatorio nao informado deve aparecer
		E a mensagem email obrigatorio nao informado deve aparecer
	Exemplos:
		| categoria |
		| Servidor  |
#		| Aluno     |
#		| Credor    |
#		| Unidade   |
#		| Outros    | 	 
	@interessado
	@AdicionarInteressado
	Esquema do Cenario: Adicionar interessado do tipo '<categoria>' com os dados corretos
		#Dado o usuario na primeira pagina de abrir processos
		Quando preencher o formulario de Dados do Interessado '<categoria>' '<nome>' '<email>' '<identificador>'
		E clicar no botao inserir
		Entao a mensagem interessado adicionado com sucesso deve aparecer
		E o interessado deve ser inserido
	Exemplos:
		| categoria | nome                                               | email                       | identificador |
		| Servidor  | ELEILDES SILVA DE SOUZA                            | eleildessouza12!!@gmail.com |               |
		| Aluno     | THIAGO COUTINHO SOUSA SILVA                        | thiago.coutinho!!@ufba.br   |               |
		| Credor    | UFBA - UNIVERSIDADE FEDERAL DA BAHIA               | ufba!!@ufba.br              |               |
#		| Unidade   | SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA | sti!!@ufba.br               | 120142        |
		| Unidade   | SUPERINTENDENCIA DE TECNOLOGIA DA INFORMACAO /UFBA | sti!!@ufba.br               | 120142        |
		| Outros    | USUARIO DE TESTES ALEATORIO                        | aleatorio@aleatorio.com     | 99999999999   | 
		#DANYELLE TAURYCE BROWN-WILLIS -> MUDA P ESSA MULHER N SEI PQ
	@interessado
	@removerInteressado
	Esquema do Cenario: Remover interessado do tipo '<categoria>'
		Dado o usuario na primeira pagina de abrir processos
		Quando inserir um interessado do tipo '<categoria>' '<nome>' '<email>' '<identificador>'
		E clicar no botao Remover Interessado
		E confirmar o pop-up
		Entao a mensagem interessado removido com sucesso deve aparecer
		E o interessado deve ser removido
	Exemplos:
		| categoria | nome                                               | email                       | identificador |
		| Servidor  | ELEILDES SILVA DE SOUZA                            | eleildessouza12!!@gmail.com |               |
		| Aluno     | THIAGO COUTINHO SOUSA SILVA                        | thiago.coutinho!!@ufba.br   |               |
		| Credor    | UFBA - UNIVERSIDADE FEDERAL DA BAHIA               | ufba!!@ufba.br              |               |
		| Unidade   | SUPERINTENDENCIA DE TECNOLOGIA DA INFORMACAO /UFBA | sti!!@ufba.br               | 120142        |
		| Outros    | USUARIO DE TESTES ALEATORIO                        | aleatorio@aleatorio.com     | 99999999999   |