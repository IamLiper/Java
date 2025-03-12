package exercicio15;

public class Gerente extends CargoDeConfianca{

    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
            super(nome, cpf, dataNascimento, salarioBase, bonificacao);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public double obterSalarioFinal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obterSalarioFinal'");
    }  
}
