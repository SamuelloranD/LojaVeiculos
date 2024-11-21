public class Carro extends Veiculo {
    private int portas;

    public Carro(String modelo, int tempo, int portas) {
        super(modelo, tempo);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public double calcularValorFinal() {
        return getTempo() * 100; // Valor por dia para carros: R$ 100
    }

    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() +
                "\nNúmero de portas: " + getPortas();
    }
}
