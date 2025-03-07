public class Diretor extends Funcionario{
    private final double PREMIO = 0.2;

    
    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, double pREMIO) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }
    
    public double getPREMIO() {
        return PREMIO;
    }
    
    public String toStringDiretor() {
        return "Diretor\n" + toStringFuncionario() + "\nPrêmio: " + PREMIO;
    }
    
    @Override
    public double getSalarioFinal() {
        double resultado = 0;
        resultado = super.salarioBase;
        resultado += super.salarioBase * this.PREMIO;
        return resultado;
    }
}