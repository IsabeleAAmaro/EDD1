public class Ex01 {

    /* Dadas duas listas duplamente encadeadas L1 e L2, sem elementos repetidos,
    implemente um método estático que realize a interseção das duas listas, criando uma
    terceira lista L3 contendo a interseção entre as duas listas. */

    //Complexidade: O(n * m), porque as duas listas estão sendo percorridas.

    public static void main(String[] args) {
        ListaDuplamente l1 = new ListaDuplamente();
        ListaDuplamente l2 = new ListaDuplamente();
        ListaDuplamente lIntersecao = new ListaDuplamente();

        l1.insere(1);
        l1.insere(22);
        l1.insere(45);
        l1.insere(67);

        l2.insere(45);
        l2.insere(34);
        l2.insere(4);
        l2.insere(1);

        System.out.println("Lista 1:");
        l1.imprime();

        System.out.println("Lista 2:");
        l2.imprime();

        lIntersecao.intersecao(l1.prim, l2.prim);

        System.out.println("Lista de interseções: ");
        lIntersecao.imprime();
    }
}
