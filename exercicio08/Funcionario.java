package exercicio08;

public class Funcionario {
    private String codDoFunc;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ContaBanc contaBanc;
    
    // Contrutor framework
    public Funcionario() {
    }

    // Construtor
    public Funcionario(String codDoFunc, String nome, String endereco, String telefone, String email,
            ContaBanc contaBanc) {
        this.codDoFunc = codDoFunc;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBanc = contaBanc;
    }

    // Getters and Setters
    public String getCodDoFunc() {
        return codDoFunc;
    }
    public void setCodDoFunc(String codDoFunc) {
        this.codDoFunc = codDoFunc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ContaBanc getContaBanc() {
        return contaBanc;
    }
    public void setContaBanc(ContaBanc contaBanc) {
        this.contaBanc = contaBanc;
    }

    // toString
    @Override
    public String toString() {
        return "Funcionario [codDoFunc: " + codDoFunc + ", nome: " + nome + ", endereco: " + endereco + ", telefone: "
                + telefone + ", email: " + email + ", contaBanc: " + contaBanc + "]";
    }
}