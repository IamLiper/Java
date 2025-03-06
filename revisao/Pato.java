public class Pato implements Animal{

    @Override
    public String emitirSom() {
        return "Quack";
    }

    @Override
    public String comer() {
        return "Migalhas de pão";
    }

    @Override
    public String acao() { 
        return "Nadar no lago";
    }

}
