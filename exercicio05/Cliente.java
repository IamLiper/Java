package exercicio05;

public class Cliente {
    // Atributos
    private String nome;
    private String idade;
    private Endereco endereco;

    // Contrutor framework
    public Cliente() {
    }

    // Contrutor
    public Cliente(String nome, String idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // toString
    @Override
    public String toString() {
        return "Cliente [nome = " + nome + ", idade = " + idade + ", endereco = " + endereco + "]";
    }
}