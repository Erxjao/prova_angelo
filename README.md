# prova_angelo

Repositório destinado a prova de Padrões de projeto

## Motor de pagamentos de motoristas

Projeto Java simples para simular o pagamento mensal de motoristas de uma
plataforma de mobilidade. A classe abstrata `Motorista` concentra os dados e o
registro de corridas; cada categoria sobrescreve o cálculo do pagamento líquido.

## Executar

Com o JDK instalado, compile e execute a partir da raiz do projeto:

```sh
javac -d out src/*.java
java -cp out Main
```

O extrato exibe nome, placa, quantidade de corridas, valor bruto e pagamento
líquido de um motorista iniciante, um premium e um parceiro frotista.
