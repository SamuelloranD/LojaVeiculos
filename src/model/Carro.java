package model;
import util.NomesVeiculos;

public class Carro extends Veiculo {
    private int portas;

    public Carro(NomesVeiculos modelo, int tempo, int portas, int taxa) {
        super(modelo.name(), tempo, taxa);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public double calcularValorFinal() {
        return getTempo() * getTaxa();
    }

    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() +
                "\nNúmero de portas: " + getPortas();
    }
}