public class Motoboy extends Funcionario{
    private String carteiraDeHabilitacao;
    
    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    
    public String toStringMotoboy() {
        return "Motoboy:\n" + toStringFuncionario() + "\nCarteira de Habilitacao: " + carteiraDeHabilitacao;}

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }
}