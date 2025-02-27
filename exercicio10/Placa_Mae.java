public class Placa_Mae extends Classic {
    private String soquete;

    public Placa_Mae(String marca, String modelo, String soquete) {
            super(marca, modelo);
            soquete = this.soquete;
    }

    public String toString() {
        return "Placa_Mae soquete=" + soquete + super.toStringMarcaModelo();
    }
}