# PoC Clientes com TDD e Git

## Integrantes
- Nome completo do integrante 1
- Nome completo do integrante 2
- Nome completo do integrante 3 (se houver)
- Nome completo do integrante 4 (se houver)

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
