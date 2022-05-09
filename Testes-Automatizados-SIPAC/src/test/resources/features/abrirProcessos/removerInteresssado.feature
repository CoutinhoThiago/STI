# language: pt

@interessado
@removerInteressado
Funcionalidade: Abrir um processo 
 
@ScenarioRemoverInteressado
Cenario: Remover um interessado do tipo Servidor
 Dado um interessado do tipo Servidor adicionado
 Quando clicar em remover interessado e confirmar a acao
 Entao o Servidor interessado deve ser excluido com sucesso e a mensagem "" deve aparecer

@ScenarioRemoverInteressado
Cenario: Remover um interessado do tipo Aluno
 Dado um interessado do tipo Aluno adicionado
 Quando clicar em remover interessado e confirmar a acao
 Entao o Aluno interessado deve ser excluido com sucesso e a mensagem "" deve aparecer

@ScenarioRemoverInteressado 
Cenario: Remover um interessado do tipo Credor
 Dado um interessado do tipo Credor adicionado
 Quando clicar em remover interessado e confirmar a acao
 Entao o Credor interessado deve ser excluido com sucesso e a mensagem "" deve aparecer

@ScenarioRemoverInteressado 
Cenario: Remover um interessado do tipo Unidade
 Dado um interessado do tipo Unidade adicionado
 Quando clicar em remover interessado e confirmar a acao
 Entao o Unidade interessado deve ser excluido com sucesso e a mensagem "" deve aparecer

@ScenarioRemoverInteressado 
Cenario: Remover um interessado do tipo Outros
 Dado um interessado do tipo Outros adicionado
 Quando clicar em remover interessado e confirmar a acao
 Entao o Outros interessado deve ser excluido com sucesso e a mensagem "" deve aparecer