package exercicio09;

public class Pessoa {
    private String nome;
    private Sexo sexo;
    
    // Construtor framework
    public Pessoa() {
    }

    // Construtor
    public Pessoa(String nome, Sexo sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    // toString
    @Override
    public String toString() {
        return "Pessoa [nome: " + nome + ", sexo: " + sexo + "]";
    }

    
}
