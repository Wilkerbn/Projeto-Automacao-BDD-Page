#language:pt
Funcionalidade: Preenchimento e envio de formulário microsoft forms
  
  Como um usuário gostaria de preencher um formulario para enviar minhas informações profissionais

Contexto: 
		Dado que estou na aplicação
    Quando informo o login "XXXXXXXX"
    E seleciono em avançar
    E a senha "XXXXXXX"
    E seleciono em entrar
    E seleciono na opção sim para continuar conectado

Esquema do Cenário: Deve enviar o formulario com campos preenchidos
    E preencho o primeiro nome "<nome>"
    E preencho o sobrenome "<sobrenome>"
    E seleciono a empresa que trabalho 
    E avalio o meu ambiente de trabalho
    E insiro a data de nascimento
    E seleciono as linguagens de programação que conheço 
    E seleciono o botão enviar
    Então devo receber a mensagem "<mensagem>"

Exemplos:
   | nome      | sobrenome | mensagem  																																					|
   | Wilker    | Bruno     | Obrigado! 																																					|
   |           |           | 2 pergunta(s) precisa(m) ser respondida(s) antes do envio: Pergunta 1, Pergunta 2.	|
   