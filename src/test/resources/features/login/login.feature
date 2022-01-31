
#Autor: Thiago Coutinho

#language: pt
#encoding: utf-8

@login
Funcionalidade: Login

	Contexto:
		Dado um usuario valido na pagina de login
  
 Esquema do Cenario: Logar com sucesso
  Quando  usuario preenche os campos com os dados corretos
		| login     | senha        |
		| tcoutinho | Coutinho.123 |
  E clicar no botao entrar
  Entao o usuario deveria ser redirecionado para a pagina inicial do sipac
    