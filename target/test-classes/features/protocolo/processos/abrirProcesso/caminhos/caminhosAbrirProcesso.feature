#language: pt

@abrirProcesso
Funcionalidade: Abrir Processos

Contexto:
		Dado um usuario que possui as credenciais corretas logado
    	| login     | senha        |
			| tcoutinho | Coutinho.123 |
  
#-----Caminhos-----
	@caminhos
	Cenario: Caminho do modulo de protocolo
		Quando seguir o caminho: modulos > protocolo > menu > processos > cadastro > abrir processo
		Entao o usuario devera ser redirecionado para a primeira pagina de abrir pocesso pelo modulo de protocolo
	@caminhos
	Cenario: Caminho do portal adiministrativo
		Quando seguir o caminho: portal adiministrativo > protocolo > processos > abrir processo
		Entao o usuario devera ser redirecionado para a primeira pagina de abrir pocesso pelo portal adiministrativo 
	@caminhos
	Cenario: Caminho da mesa virtual
		Quando seguir o caminho: mesa virtual > processos > abrir processos
		Entao o usuario devera ser redirecionado para a primeira pagina de abrir pocesso pela mesa virtual 
