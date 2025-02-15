package exercicio04.models;

public class Veiculo {
    // Atributos
    private String placa;
    private String cor;
    private int numeroDePassageiros;
    private double capacidadeDeTanque;
    private int velocidadeMaxima;
    private double consumoMedio;

    // Contrutor
    public Veiculo(String placa, String cor, int numeroDePaginas, double capacidadeDeTanque, int velocidadeMaxima,
            double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeDeTanque = capacidadeDeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    // Getters and Setters
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }
    public void setNumeroDePassageiros(int numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }
    public double getCapacidadeDeTanque() {
        return capacidadeDeTanque;
    }
    public void setCapacidadeDeTanque(double capacidadeDeTanque) {
        this.capacidadeDeTanque = capacidadeDeTanque;
    }
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public double getConsumoMedio() {
        return consumoMedio;
    }
    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
}