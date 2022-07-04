
#language: pt

@abrirProcesso
Funcionalidade: Cadastrar Processos

Contexto:
		Dado um usuario que possui as credenciais corretas logado
    	| login     | senha        |
			| tcoutinho |  |

#Caminhos----------------------------------------------------------------------------------------------------
    
	@abrirProcesso
	@caminhos
	Cenario: Caminho do modulo de protocolo
		Quando 
		Entao 
