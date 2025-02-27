public class Memoria extends Classic {

    public Memoria(String marca, String modelo, double frequencia, double capacidadeDeArmazenamento) {
        super(marca, modelo, frequencia, capacidadeDeArmazenamento);
    }

    public String toString() {
        return "Memoria: " + super.toStringTodos();
    }  
}