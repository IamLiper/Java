package exercicio05;


public class Endereco {
    // Atributos
    private String logradouro;
    private String numero;
    private String cidade;

    // Construtor vazio para não ter erro de informações referente a codigos framework
    public Endereco() {
    }

    // Contrutor
    public Endereco(String logradouro, String numero, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    // Getters and Setters
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // toString
    @Override
    public String toString() {
        return "Endereco [logradouro = " + logradouro + ", numero = " + numero + ", cidade = " + cidade + "]";
    }
}