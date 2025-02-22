package exemplo;

public class Cliente extends Pessoa {
     private String dataDeCompra;
     private String formadePagamento;
     
    public Cliente(String nome, int idade, String dataDeCompra, String formadePagamento) {
        super(nome, idade);
        this.dataDeCompra = dataDeCompra;
        this.formadePagamento = formadePagamento;
    }

    public String getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(String dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    public String getFormadePagamento() {
        return formadePagamento;
    }

    public void setFormadePagamento(String formadePagamento) {
        this.formadePagamento = formadePagamento;
    }

    @Override
    public String toString() {
        return "=== Cliente ===\n Nome: " + nome + "\n Data De Compra: " + dataDeCompra + "\n Idade: " + idade + "\n FormadePagamento: "
                + formadePagamento;
    }
}