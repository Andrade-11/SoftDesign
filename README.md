Dado que sou um usuário logado como cliente 
Quando estou na parte de realização de depósito e completo os campos e clico no botão "Deposit"
Então deve aparecer um mensagem de texto escrito:"Deposito efetuado com sucesso"
	
Dado que sou um usuário logado como cliente 
Quando clico no botão Transações 
Então deve aparecer o histórico de transações

Dado que sou um usuário logado como cliente 
Quando estou na parte de realização de saque e coloco a quantia que desejo ser retirado
Então deve aparecer um mensagem de texto escrito:"Saque realizado com sucesso"

Dado que sou um usuário logado como Manager
Quando estou na parte de adicionar um cliente e completo os campos e clico no botão "Add Costumer"
Então deve aparecer um mensagem de texto escrito:"Cliente adicionado com sucesso"
 
Dado que sou um usuário logado como Manager
Quando estou na parte de abertura de conta e completo os campos e clico em "Process
Então deve aparecer um mensagem de texto escrito:"Conta aberta com sucesso"

Dado que sou um usuário logado como Manager
Quando estou na parte de  clientes 
Então deve aparecer os seguintes campos com as informações de cada cliente:Primeiro Nome,Último Nome,CEP,Número da Conta,Cliente Deletado.
