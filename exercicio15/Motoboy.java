package exercicio15;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String dataNascimento, double salarioBase) {
            super(nome, cpf, dataNascimento, salarioBase);
            //TODO Auto-generated constructor stub
        }
    
        public String getPlacaDaMoto() {
            return placaDaMoto;
        }

        public void setPlacaDaMoto(String placaDaMoto) {
            this.placaDaMoto = placaDaMoto;
        }

    @Override
    public double obterSalarioFinal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obterSalarioFinal'");
    }
}