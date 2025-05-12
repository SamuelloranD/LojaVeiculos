package app;

import factory.CarroFactory;
import factory.MotoFactory;
import factory.VeiculoFactory;
import model.Veiculo;

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
        System.out.println("Escolha uma opção para alugar:\n1: CARROS\n2: MOTOS");
        int resp = sc.nextInt();

        VeiculoFactory factory;
        Veiculo veiculo;

        switch (resp) {
            case 1:
                factory = new CarroFactory();
                System.out.println("Por quantos dias deseja alugar?");
                int diasCarro = sc.nextInt();
                System.out.println("Escolha o modelo:");
                for (int i = 0; i < modelosCarros.size(); i++) {
                    System.out.println((i + 1) + ": " + modelosCarros.get(i));
                }
                int modeloCarro = sc.nextInt();
                veiculo = factory.criarVeiculo(modeloCarro, diasCarro);
                break;

            case 2:
                factory = new MotoFactory();
                System.out.println("Por quantos dias deseja alugar?");
                int diasMoto = sc.nextInt();
                System.out.println("Escolha o modelo:");
                for (int i = 0; i < modelosMotos.size(); i++) {
                    System.out.println((i + 1) + ": " + modelosMotos.get(i));
                }
                int modeloMoto = sc.nextInt();
                veiculo = factory.criarVeiculo(modeloMoto, diasMoto);
                break;

            default:
                System.out.println("[OPÇÃO INVÁLIDA]");
                sc.close();
                return;
        }

        if (veiculo != null) {
            System.out.println(veiculo.exibirInformacoes());
        } else {
            System.out.println("[MODELO INVÁLIDO]");
        }

        sc.close();
    }
}
