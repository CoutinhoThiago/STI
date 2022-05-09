# language: pt

@interessado
@adicionarInteressado
Funcionalidade: Abrir um processo 

@ScenarioAdicionarInteressado
Cenario: Adicionar um interessado do tipo Servidor
 Dado um primeiro usuario logoado com as permissoes adequadas
 Quando acessa a primeira pagina de abrir processos 
 E preencher o formulario para adicionar um novo interessado do tipo Servidor 
 E clicar em salvar
 Entao o Servidor interessado deve ser adicionado com sucesso e a mensagem "" deve aparecer
 
@ScenarioAdicionarInteressado
Cenario: Adicionar um interessado do tipo Aluno
 Dado um segundo usuario logoado com as permissoes adequadas
 Quando acessa a primeira pagina de abrir processos
 E preencher o formulario para adicionar um novo interessado do tipo Aluno 
 E clicar em salva
 Entao o Aluno interessado deve ser adicionado com sucesso e a mensagem "" deve aparecer
 
@ScenarioAdicionarInteressado
Cenario: Adicionar um interessado do tipo Credor
 Dado um terceiro usuario logoado com as permissoes adequadas
 Quando acessa a primeira pagina de abrir processos
 E preenche o formulario para adicionar um novo interessado do tipo Credor
 E clicar em salva
 Entao o Credor interessado deve ser adicionado com sucesso e a mensagem "" deve aparecer
 
@ScenarioAdicionarInteressado
Cenario: Adicionar um interessado do tipo Unidade
 Dado um quarto usuario logoado com as permissoes adequadas
 Quando acessa a primeira pagina de abrir processos
 E preenche o formulario para adicionar um novo interessado do tipo Unidade
 E clicar em salva
 Entao o Unidade interessado deve ser adicionado com sucesso e a mensagem "" deve aparecer
 
@ScenarioAdicionarInteressado
Cenario: Adicionar um interessado do tipo Outros
 Dado um quinto usuario logoado com as permissoes adequadas
 Quando acessa a primeira pagina de abrir processos
 E preenche o formulario para adicionar um novo interessado do tipo Outros
 E clicar em salva
 Entao o Outros interessado deve ser adicionado com sucesso e a mensagem "" deve aparecer
