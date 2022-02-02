# language: pt

@abrirProcessos
Funcionalidade: Caminhos ate a tela de primeira tela de abrir processos

	Contexto:
		Dado um usuario valido logado
  		| login     | senha        |
			| tcoutinho | Coutinho.123 |
			
	Cenario: Caminho do modulo de protocolo funcionando corretamente
		Quando seguir pelo caminho do modulo de protocolo
		Entao devera chegar na primeira pagina de abrir processos
	Cenario: Caminho do portal adiministrativo funcionando corretamente
		Quando seguir pelo caminho do portal adiministrativo
		Entao devera chegar na primeira pagina de abrir processos
	Cenario: Caminho da mesa virtual funcionando corretamente
		Quando seguir pelo caminho da mesa virtual
		Entao devera chegar na primeira pagina de abrir processos