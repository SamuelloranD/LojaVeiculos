package app;

import model.Carro;
import model.Moto;
import model.Veiculo;
import util.NomesVeiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class LojaVeiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> modelosCarros = new ArrayList<>();
        modelosCarros.add("Kwid");
        modelosCarros.add("Chronos");
        modelosCarros.add("Corolla");

        ArrayList<String> modelosMotos = new ArrayList<>();
        modelosMotos.add("Fan");
        modelosMotos.add("Lander");
        modelosMotos.add("CB 500x");

        System.out.println("BEM VINDO A LOJA *ALUGA DEVS*");
        System.out.println("Escolha uma opção para alugar:" +
                "\n1: CARROS" +
                "\n2: MOTOS");
        int resp = sc.nextInt();

        Veiculo veiculo;

        switch (resp) {
            case 1:
                System.out.println("Por quanto tempo você deseja alugar o veículo? (DIAS) ");
                int tempoCarro = sc.nextInt();
                System.out.println("ESCOLHA UM MODELO: ");
                for (int i = 0; i < modelosCarros.size(); i++) {
                    System.out.println((i + 1) + ": " + modelosCarros.get(i));
                }
                int escolhaCarro = sc.nextInt();


                switch (escolhaCarro) {
                    case 1:
                        veiculo = new Carro(NomesVeiculos.KWID, tempoCarro, 4, 80);
                        break;
                    case 2:
                        veiculo = new Carro(NomesVeiculos.CHRONOS, tempoCarro, 4, 100);
                        break;
                    case 3:
                        veiculo = new Carro(NomesVeiculos.COROLLA, tempoCarro, 4, 150);
                        break;
                    default:
                        System.out.println("[INVÁLIDO]");
                        return;
                }
                System.out.println(veiculo.exibirInformacoes());
                break;

            case 2:
                System.out.println("Por quanto tempo você deseja alugar o veículo? (DIAS)");
                int tempoMoto = sc.nextInt();
                System.out.println("ESCOLHA UM MODELO: ");
                for (int i = 0; i < modelosMotos.size(); i++) {
                    System.out.println((i + 1) + ": " + modelosMotos.get(i));
                }
                int escolhaMoto = sc.nextInt();

                Veiculo veiculo1;
                switch (escolhaMoto) {
                    case 1:
                        veiculo = new Moto(NomesVeiculos.FAN, tempoMoto, "125cc", 80);
                        break;
                    case 2:
                        veiculo = new Moto(NomesVeiculos.LANDER, tempoMoto, "250cc", 100);
                        break;
                    case 3:
                        veiculo = new Moto(NomesVeiculos.CB500X, tempoMoto, "500cc", 140);
                        break;
                    default:
                        System.out.println("[INVÁLIDO]");
                        return;
                }
                System.out.println(veiculo.exibirInformacoes());
                break;

            default:
                System.out.println("[OPÇÃO INVÁLIDA]");
                break;
        }

        sc.close();
    }
}