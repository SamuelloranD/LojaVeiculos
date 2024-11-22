package app;

import model.Carro;
import model.Moto;
import model.Veiculo;
import util.NomesVeiculos;

import java.util.Scanner;

public class LojaVeiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM VINDO A LOJA *ALUGA DEVS*");
        System.out.println("Escolha uma opção para alugar:" +
                "\n1: CARROS" +
                "\n2: MOTOS");
        int resp = sc.nextInt();

        switch (resp) {
            case 1:
                System.out.println("Por quanto tempo você deseja alugar o veículo? (DIAS) ");
                int tempoCarro = sc.nextInt();
                System.out.println("ESCOLHA UM MODELO: " +
                        "\n1: Kwid" +
                        "\n2: Chronos" +
                        "\n3: Corolla");
                int escolhaCarro = sc.nextInt();

                Veiculo carro;
                switch (escolhaCarro) {
                    case 1:
                        carro = new Carro(NomesVeiculos.KWID, tempoCarro, 4, 80);
                        break;
                    case 2:
                        carro = new Carro(NomesVeiculos.CHRONOS, tempoCarro, 4, 100);
                        break;
                    case 3:
                        carro = new Carro(NomesVeiculos.COROLLA, tempoCarro, 4, 150);
                        break;
                    default:
                        System.out.println("[INVÁLIDO]");
                        return;
                }
                System.out.println(carro.exibirInformacoes());
                break;

            case 2:
                System.out.println("Por quanto tempo você deseja alugar o veículo? (DIAS)");
                int tempoMoto = sc.nextInt();
                System.out.println("ESCOLHA UM MODELO: " +
                        "\n1: Fan" +
                        "\n2: Lander" +
                        "\n3: CB 500x");
                int escolhaMoto = sc.nextInt();

                Veiculo moto;
                switch (escolhaMoto) {
                    case 1:
                        moto = new Moto(NomesVeiculos.FAN, tempoMoto, "125cc", 80);
                        break;
                    case 2:
                        moto = new Moto(NomesVeiculos.LANDER, tempoMoto, "250cc", 100);
                        break;
                    case 3:
                        moto = new Moto(NomesVeiculos.CB500X, tempoMoto, "500cc", 140);
                        break;
                    default:
                        System.out.println("[INVÁLIDO]");
                        return;
                }
                System.out.println(moto.exibirInformacoes());
                break;

            default:
                System.out.println("[OPÇÃO INVÁLIDA]");
                break;
        }

        sc.close();
    }
}