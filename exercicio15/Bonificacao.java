package exercicio15;

public enum Bonificacao {
    GERENTE(1.3),
    DIRETOR(1.4);

    private double valor;

    Bonificacao(double bonificacao) {
        this.valor = bonificacao;
    }

    public double getValor() {
        return valor;
    }
}
