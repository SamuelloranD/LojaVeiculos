O projeto consiste em um sistema para uma loja fictícia chamada "Aluga Devs", que gerencia o aluguel de veículos, permitindo ao usuário escolher entre carros e motos, selecionar o modelo desejado, informar o período de locação em dias e obter o valor final a ser pago. O código foi desenvolvido com foco na organização e reutilização, utilizando pacotes para separar a aplicação em camadas: a classe principal no pacote app, as classes que modelam os veículos no pacote model, e o enum com os nomes dos modelos no pacote util. O sistema utiliza conceitos como polimorfismo, com Carro e Moto herdando de Veículo, e enumerações para padronizar os modelos disponíveis. O programa apresenta uma interface simples via terminal, garantindo que o valor total seja calculado dinamicamente com base nos dados fornecidos pelo usuário. A estrutura organizada facilita a escalabilidade e a manutenção do código.
