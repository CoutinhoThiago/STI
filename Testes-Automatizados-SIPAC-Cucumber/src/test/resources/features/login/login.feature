#language: pt

@login
Funcionalidade: Login

	Contexto:
		Dado um usuario na pagina de login
    
	@login
  Cenario: Tentar logar sem credenciais
    Dado um usuario que nao possui credenciais 
    Quando deixar os campos em branco
    E clica em entrar
    Entao o usuario deve permanecer na paina de login
    E a mensagem de erro "Informe o login do usuário" deve aparecer
    #Informe a senha do usuário

	@login
  Cenario: Tentar logar com as credenciais incorretas
    Dado um usuario que possui as credenciais incorretas
    Quando preenche os campos com as credenciais incorretas
			| login     | senha        |
			| invalido  |  |
			| tcoutinho | invalido     |
    E clica em entrar
    Entao o usuario deve permanecer na paina de login
    E a mensagem de erro "Usuário e/ou senha inválidos" deve aparecer
    
  @login
  Cenario: Logar com as credenciais corretas
    Dado um usuario que possui as credenciais corretas
    Quando preenche os campos com as credenciais corretas
    	| login     | senha        |
			| tcoutinho |  |
    E clica em entrar
    Entao o usuario deve ser redirecionado para a pagina inicial do sipac
    E deve ser mostrado como usuario logado
    
  

