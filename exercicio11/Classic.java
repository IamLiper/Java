public abstract class Classic {
    protected String marca;
    protected String modelo;
    protected double frequencia;
    protected double capacidadeDeArmazenamento;

    public Classic(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Classic(String marca, String modelo, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public Classic(String marca, double capacidadeDeArmazenamento, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public Classic(String marca, String modelo, double frequencia, double capacidadeDeArmazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Double frequencia) {
        this.frequencia = frequencia;
    }

    public Double getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapcidadeDeArmazenamento(Double capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    
    public String toStringMarcaModelo() {
        return "Classic [marca=" + marca + ", modelo=" + modelo + "]";
    }
    public String toStringMarcaModeloFrequencia() {
        return "Classic [marca=" + marca + ", modelo=" + modelo + ", frequencia=" + frequencia + "]";
    }
    public String toStringMarcaModeloArmazenamento() {
        return "Classic [marca=" + marca + ", modelo=" + modelo + ", capacidadeDeArmazenamento="
                + capacidadeDeArmazenamento + "]";
    }
    public String toStringTodos() {
        return "Classic [marca=" + marca + ", modelo=" + modelo + ", frequencia=" + frequencia
                + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + "]";
    }
    
}