#language: pt

@abrirProcesso
Funcionalidade: Abrir Processo

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
		
#-----Botoes-----
	@botoes
	@botaoCancelar
	Cenario: Botao cancelar funcionando corretamente
		Dado o usuario na primeira pagina de abrir processos
		Quando clicar no botao cancelar
		E confirmar o pop-up
		Entao o usuario devera ser redirecionado para a pagina inicial da mesa virtual
	@botoes
	@botaoListarClassificacoesCONARQ
	Cenario: Botao listar classificacoes conarq funcionando corretamente
		Dado 
		Quando 
		Entao 
	@botoes	
	@removerClassificacaoConarq
	Cenario: Botao Remover Classificacao CONARQ funcionando corretamente
		Dado o usuario na primeira pagina de abrir processos
		Quando adicionar uma classificacao CONARQ 
		E clicar em no botao Remover Classificacao CONARQ
		E confirmar o pop-up
		Entao a Classificacao CONARQ deve ser removida
		E a mensagem de classificacao CONARQ removida deve aparecer
	@botoes
	@botaoContinuar 
	Cenario: Botao continuar funcionando corretamente
		Dado 
		Quando 
		Entao 
	@botoes
	@botaoInserir
	Cenario: Botao inserir funcionando corretamente
		Dado 
		Quando 
		Entao 
	
#-----Interessado-----	
	@interessado
	@AdicionarInteressado
	Esquema do Cenario: Tentar adicionar interessado do tipo '<Categoria>' sem dados
		Dado o usuario na primeira pagina de abrir processos
		Quando deixar o formulario de Dados do Interessado em branco
		E clicar no botao inserir
		Entao a mensagem interessado campo obrigatorio nao informado deve aparecer
		E a mensagem email obrigatorio nao informado deve aparecer
	Exemplos:
		| Categoria |
		| Servidor  |
#		| Aluno     | 
#		| Unidade   |
#		| Credor    |
#		| Outros    | 	 
	@interessado
	@AdicionarInteressado
	Esquema do Cenario: Adicionar interessado do tipo '<Categoria>' com os dados corretos
		Dado o usuario na primeira pagina de abrir processos
		Quando preencher o formulario de Dados do Interessado
		E clicar no botao inserir
		Entao a mensagem interessado adicionado com sucesso deve aparecer
		E o interessado deve ser inserido
	Exemplos:
		| Categoria |
		| Servidor  |
		| Aluno     | 
		| Unidade   |
		| Credor    |
		| Outros    | 
	@interessado
	@removerInteressado
	Esquema do Cenario: Remover interessado do tipo '<Categoria>'
		Dado o usuario na primeira pagina de abrir processos
		Quando inserir um interessado do tipo '<Categoria>'
		E clicar no botao Remover Interessado
		Entao a mensagem interessado removido com sucesso deve aparecer
		E o interessado deve ser removido
	Exemplos:
		| Categoria |
		| Servidor  |
#		| Aluno     | 
#		| Unidade   |
#		| Credor    |
#		| Outros    | 

#-----formulario de Abrir Processos-----

	@formularioDeAbrirProcessos
	Esquema do Cenario: Abrir processo do tipo '<Tipo>' com interessado do tipo '<Categoria>'
		Dado o usuario na primeira pagina de abrir processos
		E um interessado do tipo '<Categoria>' adicionado
		Quando selecionar a opcao precesso '<Tipo>'
		E preencher o forrmilario de abrir processo
		E clicar em continuar 	
		Entao o usuario deve ser redirecionado para segunda pagina de abrir processos
		E os dados cadastrados no formulario Dados Gerais do Processo estao corretos
		E os dados cadastrados no formulario Dados do Interessado estao corretos
	Exemplos:
		| Tipo 					 | Categoria |
		
		| Eletronico 		 | Servidor  |
		| Eletronico		 | Aluno     | 
		| Eletronico		 | Unidade   |
		| Eletronico		 | Credor    |
		| Eletronico		 | Outros    |
		
		| Nao Eletronico | Servidor  |
		| Nao Eletronico | Aluno     | 
		| Nao Eletronico | Unidade   |
		| Nao Eletronico | Credor    |
		| Nao Eletronico | Outros    |	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		