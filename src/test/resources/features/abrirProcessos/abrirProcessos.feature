  # language: pt

@abrirProcessos
Funcionalidade: Abrir Processos

  Contexto:
		Dado um usuario valido logado
  		| login     | senha        |
			| tcoutinho | Coutinho.123 |
		Quando o usuario estiver na primeira pagina de abrir processos
		
	@primeiraPaginaDeAbrirProcessos
	Cenario: Abrir um processo de natureza OSTENSIVO
 		Quando Adicionar um interessado do tipo '<tipo>' '<nome>' '<notificar>' '<email>' '<cpf>'
  	E preenche os campos com os dados corretos '<natureza>' '<hipoteseLegal>' '<grauDeSigilo>'
  	E clicar no botao continuar
 	
  Esquema do Cenario: Abrir um processo de natureza '<natureza>' e com um ineressado do tipo '<tipo>' adicionado 
 		Quando Adicionar um interessado do tipo '<tipo>' '<nome>' '<notificar>' '<email>' '<cpf>'
  	E preenche os campos com os dados corretos '<natureza>' '<hipoteseLegal>' '<grauDeSigilo>'
  	E clicar no botao continuar
  Exemplos:
  	| natureza  | hipoteseLegal                                | grauDeSigilo  |  tipo     | nome                    							| notificar | email                        | cpf |
	 	| OSTENSIVO |                                              |               | Servidor | ELEILDES SILVA DE SOUZA 							|true       | eleildes.souza!!@hotmail.com | |
	 	
	 #	| RESTRITO  | CONTROLE INTERNO                             |               | Servidor | ELEILDES SILVA DE SOUZA 							|true       | eleildes.souza!!@hotmail.com | |
	 	#| RESTRITO  | CONTROLE INTERNO                             |               | Servidor | ELEILDES SILVA DE SOUZA 							|true       | eleildes.souza!!@hotmail.com | |
	 	#| RESTRITO  | INFORMACAO PESSOAL                           |               | Servidor | ELEILDES SILVA DE SOUZA 							|true       | eleildes.souza!!@hotmail.com | |
	 	#| RESTRITO  | INVESTIGACOA DE RESPONSABILIDADE DE SERVIDOR |               | Servidor | ELEILDES SILVA DE SOUZA 							|true       | eleildes.souza!!@hotmail.com | |
	 	#| RESTRITO  | SIGILO CONTABIL                              |               | Servidor | ELEILDES SILVA DE SOUZA 							|true       | eleildes.souza!!@hotmail.com | |
	 	#| RESTRITO  | SIGILO EMPRESARIAL                           |               | Servidor | ELEILDES SILVA DE SOUZA 							|true       | eleildes.souza!!@hotmail.com | |
	 	#| RESTRITO  | SIGILO FISCAL                                |               | Servidor | ELEILDES SILVA DE SOUZA 							|true       | eleildes.souza!!@hotmail.com | |
	 	
	 #	| SIGILOSO  | 1                                            | CONFIDENCIAL  | Servidor | ELEILDES SILVA DE SOUZA 							|true       | eleildes.souza!!@hotmail.com | |
	 	#| SIGILOSO  | 1                                            | RESERVADO     | Servidor | ELEILDES SILVA DE SOUZA 							|true       | eleildes.souza!!@hotmail.com | |
	 	#| SIGILOSO  | 1                                            | SECRETO       | Servidor | ELEILDES SILVA DE SOUZA 							|true       | eleildes.souza!!@hotmail.com | |
	 	#| SIGILOSO  | 1                                            | ULTRASSECRETO | Servidor | ELEILDES SILVA DE SOUZA 							|true       | eleildes.souza!!@hotmail.com | |
	 	
	 	
	 #	| OSTENSIVO | Aluno    |  | true      |||
	 #	| OSTENSIVO | Credor   |  | true      |||
	 #	| OSTENSIVO | Unidade  |  | true      |||
	 #	| OSTENSIVO | Outros   |  | true      |||
  