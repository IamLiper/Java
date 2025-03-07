public class MainFuncionario {
    public static void main(String[] args) {
        Motoboy motoboy1 = new Motoboy("Lipe", "26/02/2006", Sexo.MASCULINO, Setor.FINANCEIRO , 2500, "A");
        Diretor diretor1 = new Diretor("Joana", "28/04/2000", Sexo.FEMININO, Setor.OPERACOES, 5000, 10);

        System.out.println(motoboy1.toStringMotoboy());
        System.out.println(diretor1.toStringDiretor());
    }
}