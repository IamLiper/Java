public class Processador extends Classic {

    public Processador(String marca, String modelo, double frequencia) {
        super(marca, modelo, frequencia);
    }

    public String toString() {
        return "Processador " + super.toStringMarcaModeloFrequencia();
    }
}