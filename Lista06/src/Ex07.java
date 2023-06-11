public class Ex07 {
    /*
    7) Dados dois conjuntos “A” e “B” sobre um determinado universo, a Segunda Lei De
    Morgan diz que (A U B)c → Ac B⋂ C. Dessa maneira, pede-se que seja feito um método
    estático que, dado o conjunto universo universo e dados dois conjuntos conj1 e conj2
    sobre esse universo, aplique a Segunda Lei De Morgan a esses, retornando a interseção do
    complemento de conj1 e do complemento de conj2. O método possui a seguinte
    assinatura:
     */

    //Complexidade do calculaDeMorgan: O(n)
    //Complexidade do intersecao: O(N +M)
    //Complexidade do complementar: O(n)
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
