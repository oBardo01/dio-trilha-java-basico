# 💳 Projeto Conta Bancária no Terminal

Este é um projeto simples feito em Java com o objetivo de simular a criação de uma conta bancária diretamente pelo terminal. O programa solicita ao usuário as informações básicas da conta e exibe um resumo formatado após a conclusão.

## 🧠 Objetivo

Este projeto tem como finalidade treinar os conceitos básicos de entrada de dados, manipulação de strings e uso da classe `Scanner` em Java.

## 📌 Funcionalidades

- Coleta de dados do usuário via terminal:
  - Número da conta
  - Número da agência
  - Nome do cliente
  - Saldo inicial
- Exibição formatada dos dados da conta criada

## 🛠️ Tecnologias Utilizadas

- Java (JDK 17 ou superior)
- IDE de sua preferência (IntelliJ, Eclipse, VS Code, etc.)
- Terminal/Prompt de Comando

## 🚀 Como Executar

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git

   ```

2. Compile o arquivo:

   ```bash
   javac ContaTerminal.java

   ```

3. Execute no terminal (Certifique-se de estar no diretório com a classe ContaTerminal.class):

   ```bash
   java ContaTerminal

   ```

4. Siga as instruções que aparecerem na tela.
   ```bash
   Seja bem vindo, comece a criação de conta!
   Insira o número da conta (Formato: XXXX):
   1234
   Insira o número da agência (Formato: XXX-X):
   123-4
   Insira o nome do cliente:
   Pedro Abreu
   Insira o saldo:
   500.75
    
    CONTA CRIADA COM SUCESSO!
    --------------------
    CONTA: 1234
    AGÊNCIA: 123-4
    NOME CLIENTE: PEDRO ABREU
    SALDO: R$500.75
