package Atividade;

public abstract class CargoDeConfianca extends Funcionario{
        protected Bonificacao bonificacao;

        public CargoDeConfianca(String nome, String cpf, String dataNascimento, double salarioBase,
                Bonificacao bonificacao) {
            super(nome, cpf, dataNascimento, salarioBase);
            this.bonificacao = bonificacao;
        }

        public Bonificacao getBonificacao() {
            return bonificacao;
        }

        public void setBonificacao(Bonificacao bonificacao) {
            this.bonificacao = bonificacao;
        }
}
