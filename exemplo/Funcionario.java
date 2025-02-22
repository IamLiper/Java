package exemplo;

public class Funcionario extends Pessoa {
    private String matricula;
    private String cargo;
    private String salario;

    public Funcionario(String nome, int idade, String matricula, String cargo, String salario) {
        super(nome, idade);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "=== Funcionario ===\n Nome: " + nome + "\n Matricula: " + matricula + "\n Idade: " + idade + "\n Cargo: " + cargo
                + "\n Salario: " + salario;
    }
}