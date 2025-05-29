# Aluga Devs – Sistema de Aluguel de Veículos

Este projeto simula uma loja fictícia chamada **Aluga Devs**, que gerencia o aluguel de veículos (carros e motos), permitindo ao usuário selecionar o modelo desejado, informar o período de locação e obter o valor final da reserva.

## Tecnologias e Conceitos Aplicados

- Java  
- Programação Orientada a Objetos (POO)  
- Herança, Polimorfismo e Enumerações  
- Arquitetura em camadas (app, model, util)  
- **Padrão de Projeto: Factory Method**

## Funcionalidades

- Escolha entre carros e motos para locação  
- Seleção de modelos padronizados via `enum`  
- Cálculo dinâmico do valor total com base no tempo de locação  
- Separação do código em pacotes organizados:
  - `app`: classe principal e ponto de entrada
  - `model`: classes de domínio como `Veiculo`, `Carro` e `Moto`
  - `util`: enum `Modelo` com os modelos disponíveis
  - `factory`: implementação do padrão Factory Method

## Padrão de Projeto: Factory Method

A lógica de criação dos objetos foi refatorada utilizando o padrão **Factory Method**, encapsulando a instância de veículos em fábricas especializadas. Isso melhora a **manutenibilidade, legibilidade e escalabilidade** da aplicação.

## Interface

A aplicação é executada no terminal, com prompts para entrada de dados pelo usuário. Após a escolha do tipo e modelo do veículo, e o número de dias, o sistema exibe o valor total da locação.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/SamuelloranD/loja-veiculos.git
