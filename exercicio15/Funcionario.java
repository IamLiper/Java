public abstract class Funcionario {
    protected String nome;
    protected String dataNascimento;
    protected Sexo sexo;
    protected Setor setor;
    protected double salarioBase;
    
    public Funcionario() {
    }

    public Funcionario(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String toStringFuncionario() {
        return "Nome: " + nome + "\nData Nascimento: " + dataNascimento + "\nSexo: " + sexo + "\nSetor: " + setor + "\nSalarioBase: " + salarioBase;
    }

    public abstract double getSalarioFinal();
}