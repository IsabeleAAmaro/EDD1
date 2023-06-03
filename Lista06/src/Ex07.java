public class Ex07 {
    public static void main(String[] args) {

        ConjGenerico<Integer> conj1 = new ConjGenerico<>();
        ConjGenerico<Integer> conj2 = new ConjGenerico<>();
        ConjGenerico<Integer> conjUniverso = new ConjGenerico<>();
        ConjGenerico<Integer> deMorganIntersec = new ConjGenerico<>();

        conj1.insere(1);
        conj1.insere(2);
        conj1.insere(4);
        conj1.insere(5);
        conj1.insere(8);

        conj2.insere(1);
        conj2.insere(3);
        conj2.insere(4);
        conj2.insere(6);
        conj2.insere(7);

        conjUniverso.insere(1);
        conjUniverso.insere(2);
        conjUniverso.insere(3);
        conjUniverso.insere(4);
        conjUniverso.insere(5);
        conjUniverso.insere(6);
        conjUniverso.insere(7);
        conjUniverso.insere(8);
        conjUniverso.insere(9);

        deMorganIntersec = deMorganIntersec.calculaDeMorgan(conj1, conj2, conjUniverso);

        System.out.println("Interseção dos complementos de A e B:");
        deMorganIntersec.imprime();

    }
}
