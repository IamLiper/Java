package exercicio09;

public class Funcionario {
    // Atributos
    private String id;
    private String nome;
    private double salario;
    private Setor setor;
    private Sexo sexo;
    private String idade;

    // Construtor framework
    public Funcionario() {
    }

    // Construtor
    public Funcionario(String id, String nome, double salario, Setor setor, Sexo sexo, String idade) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
        this.idade = idade;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Setor getSetor() {
        return setor;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }

    // toString
    @Override
    public String toString() {
        return "Funcionario: \nid: " + id + "\nNome: " + nome + "\nSalario: " + salario + "\nSetor: " + setor + "\nSexo: " + sexo + "\nIdade: " + idade;
    }
}