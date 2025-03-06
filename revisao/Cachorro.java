public class Cachorro implements Animal{

    @Override
    public String emitirSom() {
        return "Auau";
    }

    @Override
    public String comer() {
        return"Ração";
    }

    @Override
    public String acao() {
        return "Correr";
    }

    
}