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
                Veiculo carro = null;
                if (escolhaCarro == 1) {
                    carro = new Carro("Kwid", tempoCarro, 4, 80);
                } else if (escolhaCarro == 2) {
                    carro = new Carro("Chronos", tempoCarro, 4, 100);
                } else if (escolhaCarro == 3) {
                    carro = new Carro("Corolla", tempoCarro, 4, 150);
                } else {
                    System.out.println("[INVÁLIDO]");
                    break;
                }
                System.out.println(carro.exibirInformacoes());
                break;

            case 2:
                System.out.println("Por quanto tempo você deseja alugar o veículo? (DIAS) ");
                int tempoMoto = sc.nextInt();
                System.out.println("ESCOLHA UM MODELO: " +
                        "\n1: Fan" +
                        "\n2: Lander" +
                        "\n3: CB 500x");
                int escolhaMoto = sc.nextInt();
                Veiculo moto = null;
                if (escolhaMoto == 1) {
                    moto = new Moto("Fan", tempoMoto, "125c", 80);
                } else if (escolhaMoto == 2) {
                    moto = new Moto("Lander", tempoMoto, "250cc", 100);
                } else if (escolhaMoto == 3) {
                    moto = new Moto("CB 500x", tempoMoto, "500cc", 140);
                } else {
                    System.out.println("[INVÁLIDO]");
                    break;
                }
                System.out.println(moto.exibirInformacoes());
                break;

            default:
                System.out.println("[OPÇÃO INVÁLIDA]");
                break;
        }
    }
}
