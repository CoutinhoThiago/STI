
#Autor: Thiago Coutinho

#language: pt
#encoding: utf-8

@abrirProcessos
Funcionalidade: Abrir Processos

	Contexto:
		Dado um usuario valido logado
  		| login     | senha        |
			| tcoutinho | Coutinho.123 |
		Quando o usuario estiver na primeira pagina de abrir processos
			
	Cenario: Botao cancelar funcionando corretamente
		Quando clicar em no botao cancelar
		E confirmar o pop-up
		Entao o usuario deve retornar para a pagina inicial do sipac
		
  Esquema do Cenario: Abrir um processo com um servidor do tipo '<tipo>' adicionado 
 		Quando Adicionar um usuario do tipo '<tipo>'
  	E preenche os campos com os dados corretos
  	E clicar no botao continuar
  Exemplos:
  	| tipo     |
 		| Servidor |
 		| Aluno    |
 		| Credor   |
 		| Unidade  |
 		| Outros   |
