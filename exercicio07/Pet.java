package exercicio07;

public class Pet {
    private String nome;
    private String idade;
    private String raca;

    // Contrutor framework
    public Pet() {
    }

    // Construtor
    public Pet(String nome, String idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
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
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    // toString
    @Override
    public String toString() {
        return "Pet [nome: " + nome + ", idade: " + idade + ", raca: " + raca + "]";
    }
}