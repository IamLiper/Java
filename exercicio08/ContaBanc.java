package exercicio08;

public class ContaBanc {
    private String banco;
    private String agencia;
    private String nmrDaConta;
    private String tipoDaConta;
    private double saldoAtual;
    private double limiteDisponivel;
    
    // Construtor framework
    public ContaBanc() {
    }

    // Construtor
    public ContaBanc(String banco, String agencia, String nmrDaConta, String tipoDaConta, double saldoAtual,
            double limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.nmrDaConta = nmrDaConta;
        this.tipoDaConta = tipoDaConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    // Getters and Setters
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNmrDaConta() {
        return nmrDaConta;
    }
    public void setNmrDaConta(String nmrDaConta) {
        this.nmrDaConta = nmrDaConta;
    }
    public String getTipoDaConta() {
        return tipoDaConta;
    }
    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }
    public double getSaldoAtual() {
        return saldoAtual;
    }
    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }
    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    // toString
    @Override
    public String toString() {
        return "ContaBanc [banco: " + banco + ", agencia: " + agencia + ", nmrDaConta: " + nmrDaConta + ", tipoDaConta: "
                + tipoDaConta + ", saldoAtual: " + saldoAtual + ", limiteDisponivel: " + limiteDisponivel + "]";
    }
}