package factory;

import model.Veiculo;

public interface VeiculoFactory {
    Veiculo criarVeiculo(int modelo, int dias);
}
