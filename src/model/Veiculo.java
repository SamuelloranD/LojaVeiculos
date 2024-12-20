package model;

public abstract class Veiculo {
    private String modelo;
    private int tempo;
    private int taxa;

    public Veiculo(String modelo, int tempo, int taxa) {
        this.modelo = modelo;
        this.tempo = tempo;
        this.taxa = taxa;
    }

    public int getTaxa() {
        return taxa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getTempo() {
        return tempo;
    }

    public abstract double calcularValorFinal();

    public String exibirInformacoes() {
        return "Modelo: " + getModelo() +
                "\nValor a ser pago: R$ " + String.format("%.2f", calcularValorFinal());
    }
}