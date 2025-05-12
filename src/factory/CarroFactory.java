package factory;

import model.Carro;
import model.Veiculo;
import util.NomesVeiculos;

public class CarroFactory implements VeiculoFactory {
    public Veiculo criarVeiculo(int modelo, int dias) {
        return switch (modelo) {
            case 1 -> new Carro(NomesVeiculos.KWID, dias, 4, 80);
            case 2 -> new Carro(NomesVeiculos.CHRONOS, dias, 4, 100);
            case 3 -> new Carro(NomesVeiculos.COROLLA, dias, 4, 150);
            default -> null;
        };
    }
}
