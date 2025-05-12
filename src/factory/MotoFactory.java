package factory;

import model.Moto;
import model.Veiculo;
import util.NomesVeiculos;

public class MotoFactory implements VeiculoFactory {
    public Veiculo criarVeiculo(int modelo, int dias) {
        return switch (modelo) {
            case 1 -> new Moto(NomesVeiculos.FAN, dias, "125cc", 80);
            case 2 -> new Moto(NomesVeiculos.LANDER, dias, "250cc", 100);
            case 3 -> new Moto(NomesVeiculos.CB500X, dias, "500cc", 140);
            default -> null;
        };
    }
}
