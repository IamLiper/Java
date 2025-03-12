package exercicio15;

public class Gerente extends CargoDeConfianca implements Contratacao{

    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, Bonificacao.GERENTE);
    }

    @Override
    public double obterSalarioFinal() {
        return salarioBase * super.getBonificacao().getValor();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Gerente contratando!" + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Gerente demitindo!" + funcionario.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Salario Final: " + obterSalarioFinal();
    }
}