package exercicio11;

public class Calca extends Produto{

    public Calca(String marca, String cor, String tamanho, double preco) {
        super(marca, cor, tamanho, preco);
    }

    public String toString() {
        return "Calca: " + super.toStringMarcaCor();
    }
}