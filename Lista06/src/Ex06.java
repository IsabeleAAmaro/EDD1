public class Ex06 {
    /*
    6) Implemente o método do Exercício 2 de maneira recursiva
     */

    public static void main(String[] args) {
        ConjGenerico<Integer> c1 = new ConjGenerico<>();
        ConjGenerico<Integer> c2 = new ConjGenerico<>();

        c1.insere(1);
        c1.insere(2);
        c1.insere(7);

        c2.insere(3);
        c2.insere(2);
        c2.insere(7);

        if(c1.eIgualRecursiva(c2)) {
            System.out.println("Os conjuntos são iguais");
        } else {
            System.out.println("Os conjuntos não são iguais");
        }
    }
}
