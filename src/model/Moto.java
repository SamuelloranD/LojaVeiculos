package model;
import util.NomesVeiculos;

public class Moto extends Veiculo {
    private String cilindrada;

    public Moto(NomesVeiculos modelo, int tempo, String cilindrada, int taxa) {
        super(modelo.name(), tempo, taxa);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    @Override
    public double calcularValorFinal() {
        return getTempo() * getTaxa();
    }

    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() +
               "\nCilindrada: " + getCilindrada();
    }
}