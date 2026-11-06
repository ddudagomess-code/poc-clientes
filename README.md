# PoC Clientes com TDD e Git

## Integrantes
- Maria Eduarda Gonçalves Gomes

## Tecnologias
- Java 8
- Maven
- JUnit 5

## Executar os testes
No terminal, na pasta do projeto, execute:

```bash
mvn test
```

## Organização
- `Cliente`: dados e representação do cliente.
- `FaturaCliente`: dados da fatura e cálculo do valor com desconto.
- `ContaCliente`: saldo, depósito e retirada.

## Observações
O gênero inicia como `nd`, conforme as opções indicadas no diagrama (`m`, `f` ou `nd`). O diagrama não apresenta setter para gênero.
A retirada que excede o saldo não é realizada; uma mensagem é exibida e o saldo atual é retornado.
