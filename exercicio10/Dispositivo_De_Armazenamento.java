public class Dispositivo_De_Armazenamento extends Classic {
    private String tipoDeConexao;


    public Dispositivo_De_Armazenamento(String marca, double capacidadeDeArmazenamento, String modelo, String tipoDeConexao) {
            super(marca, capacidadeDeArmazenamento, modelo);
            tipoDeConexao = this.tipoDeConexao;
        }

    public String toString() {
        return "Dispositivo_De_Armazenamento tipoDeConexao=" + tipoDeConexao + super.toStringMarcaModeloArmazenamento();
    }
}