# language: pt
@login
Funcionalidade: Apenas usuarios cadastrados podem se logar
  
  Cenario: Um usuario valido consegue se logar
    Dado o usuario valido
    Quando realiza login
    Entao redirecionado para a pagina inicial do SIPAC
    
    
  Cenario: Um usuario valido porem com senha invalida naoconsegue se logar
    Dado um usuario valido e uma senha invalida
    Quando tenta se logar
    Entao continua na pagina de login