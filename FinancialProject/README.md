# 💰 Projeto para gerar contratos e seus fluxos de caixa 💰

## Projeto feito em java, aplicando os conceitos de poo e interface para fazer a deleção de tarefas para cada entidade a qual a tarefa pertence, evitando também um alto acoplamento e deixando o código mais fácil de dar manutenção ou mudar algum requisito / regra de negocios
## Divisão do projeto feita entre os arquivos:

 - Application (Program é a classe para rodar e testar o programa)
 - Model ( Com subdivisões entre entities e services) :
    - entities: pacote destinado a conter todas as classes de entidades do negocio, sendo elas a classe Contract e Installment.
    - services: contando com uma interface de Onlinepayments, esse pacote conta com todas as taxas, juros e realização do processamento do contrato.
   



 #### Projeto desenvolvido com Java 21, IDE Eclipse e versionado via GIT. 
