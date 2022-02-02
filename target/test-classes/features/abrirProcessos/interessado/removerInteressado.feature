#language: pt

@interessado
Funcionalidade: Remover Interessado

  Contexto:
		Dado um usuario valido logado
  		| login     | senha        |
			| tcoutinho | Coutinho.123 |
		Quando o usuario estiver na primeira pagina de abrir processos
		E adicionar um interessado do tipo '<interessado>'
		
	@adicionarInteressado
	Esquema do Cenario: Remover um interessado do tipo '<interessado>'
		Quando clicar no botao excluir
		E confirmar o Alert
		Entao a mensagem de erro "" deve aparecer
		E o interessado deve ser excluido
	Exemplos:
		| interessado |
  	| Servidor    | 	 	
	 	| Aluno       |
	 	| Credor      |
	 	| Unidade     |
	 	| Outros      |
	 	