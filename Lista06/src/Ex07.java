public class Ex07 {
    public static void main(String[] args) {

        ConjGenerico<Integer> c1 = new ConjGenerico<>();
        ConjGenerico<Integer> c2 = new ConjGenerico<>();
        ConjGenerico<Integer> cUniverso = new ConjGenerico<>();
        ConjGenerico<Integer> deMorganIntersec = new ConjGenerico<>();

        c1.insere(3);
        c1.insere(4);
        c1.insere(5);
        c1.insere(6);
        c1.insere(8);
        c1.insere(10);

        c2.insere(3);
        c2.insere(4);
        c2.insere(6);
        c2.insere(8);
        c2.insere(9);

        cUniverso.insere(1);
        cUniverso.insere(2);
        cUniverso.insere(3);
        cUniverso.insere(4);
        cUniverso.insere(5);
        cUniverso.insere(6);
        cUniverso.insere(7);
        cUniverso.insere(8);
        cUniverso.insere(9);
        cUniverso.insere(10);

        deMorganIntersec = deMorganIntersec.calculaDeMorgan(c1, c2, cUniverso);

        System.out.println("Interseção dos complementos de A e B:");
        deMorganIntersec.imprime();

    }
}
