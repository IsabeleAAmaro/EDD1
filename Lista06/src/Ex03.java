public class Ex03 {

    /*
    3) Desenvolva um método que receba um conjunto universo como parâmetro e calcule o
    complementar do conjunto corrente em relação a tal universo. Se o conjunto corrente
    possuir elementos de fora do conjunto universo informado, o método deve lançar uma
    exceção.
     */

    public static void main(String[] args) {
        ConjGenerico<Integer> conj1 = new ConjGenerico<>();
        ConjGenerico<Integer> conj2;
        ConjGenerico<Integer> conjUniverso = new ConjGenerico<>();

        //conj1.insere(1);
        conj1.insere(3);
        conj1.insere(4);
        conj1.insere(5);
        conj1.insere(6);
        conj1.insere(8);
        conj1.insere(9);

        System.out.println("Conjunto 1: ");
        conj1.imprime();

        conjUniverso.insere(1);
        conjUniverso.insere(2);
        conjUniverso.insere(3);
        conjUniverso.insere(4);
        conjUniverso.insere(5);
        conjUniverso.insere(6);
        conjUniverso.insere(7);
        conjUniverso.insere(8);
        conjUniverso.insere(9);

        System.out.println("Conjunto universo:");
        conjUniverso.imprime();

        conj2 = conj1.complementar(conjUniverso);

        System.out.println("Complementar do Conjunto 1:");
        conj2.imprime();

    }
}
