
#language: pt

@abrirProcesso
Funcionalidade: Cadastrar Processos

Contexto:
		Dado um usuario que possui as credenciais corretas logado
    	| login     | senha        |
			| tcoutinho | Coutinho.123 |

#Caminhos----------------------------------------------------------------------------------------------------
    
	@abrirProcesso
	@caminhos
	Cenario: Caminho do modulo de protocolo
		Quando 
		Entao 