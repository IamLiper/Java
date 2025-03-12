package exercicio15;

public enum Bonificacao {
    GERENTE(1.3),
    DIRETOR(1.4);

    private double bonificacao;

    Bonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getBonificacao() {
        return bonificacao;
    }
}
