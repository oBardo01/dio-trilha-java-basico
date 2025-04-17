# Desafio Controle de Fluxo - Contador

Este é um desafio que simula um contador entre dois números fornecidos pelo usuário. O foco principal é praticar a manipulação de entrada de dados, tratamento de exceções e estruturas de repetição.

## Como funciona

O programa solicita dois números inteiros positivos ao usuário:

- O **primeiro parâmetro** (início)
- O **segundo parâmetro** (fim)

Se o segundo número for maior que o primeiro, o programa imprime a contagem de `1` até a diferença entre eles.

**Exemplo:**

```bash
  Digite o primeiro parâmetro:
  3
  Digite o segundo parâmetro:
  7

  Contador
  1
  2
  3
  4
```

Se os parâmetros forem inválidos (números negativos ou o segundo menor/igual ao primeiro), o programa lança uma exceção personalizada.

## Estrutura do Projeto

- `Contador.java`: Classe principal que executa o programa.
- `ParametrosInvalidosException.java`: Classe de exceção personalizada (deve ser criada separadamente).

## Requisitos

- Java JDK 8 ou superior

## Execução

Compile e execute no terminal:

```bash
javac Contador.java ParametrosInvalidosException.java
java Contador
