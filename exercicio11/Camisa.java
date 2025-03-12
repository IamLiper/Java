package exercicio11;

public class Camisa extends Produto{

    public Camisa(String marca, String cor, String tamanho, double preco) {
        super(marca, cor, tamanho, preco);
    }

    public String toString() {
        return "Camisa: " + super.toStringMarcaCor();
    }
}
