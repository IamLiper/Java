package atividade_1;

public class Memoria extends Exforce {
    private String cpcdDeArmazenamento;

    public Memoria(String marca, String modelo, String cpcdDeArmazenamento) {
        super(marca, modelo);
        this.cpcdDeArmazenamento = cpcdDeArmazenamento;
    }

    public String getCpcdDeArmazenamento() {
        return cpcdDeArmazenamento;
    }

    public void setCpcdDeArmazenamento(String cpcdDeArmazenamento) {
        this.cpcdDeArmazenamento = cpcdDeArmazenamento;
    }

    @Override
    public String toString() {
        return "=== Memoria === \n Marca: " + marca + "\n Capacidade De Armazenamento: " + cpcdDeArmazenamento + "\n Modelo: " + modelo;
    }
}