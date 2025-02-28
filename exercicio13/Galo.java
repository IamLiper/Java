package exercicio13;

public class Galo implements Animal{

    @Override
    public String emitirSom() {
        return "Cocoricó!";
    }

    @Override
    public String comer() {
        return "Milho";
    }
}