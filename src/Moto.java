public class Moto extends Veiculo {
    private String cilindrada;

    public Moto(String modelo, int tempo, String cilindrada) {
        super(modelo, tempo);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    @Override
    public double calcularValorFinal() {
        return getTempo() * 50; // Valor por dia para motos: R$ 50
    }

    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() +
               "\nCilindrada: " + getCilindrada();
    }
}