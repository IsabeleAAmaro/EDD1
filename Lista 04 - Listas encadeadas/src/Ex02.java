public class Ex02 {

    /*
    2) Elabore um algoritmo que, dadas duas listas encadeadas ordenadas, intercale as duas
    listas de forma que a lista resultante seja também ordenada

    Complexidade:
    IntercalaOrdenada(): O(M+N), Duas listas distintas percorridas por um while
     */

    public static void main(String[] args) {
        ListaOrdenada lista1 = new ListaOrdenada();
        ListaOrdenada lista2 = new ListaOrdenada();

        ListaOrdenada listaIntercalada = new ListaOrdenada();

        lista1.insere(1);
        lista1.insere(28);
        lista1.insere(7);

        lista2.insere(4);
        lista2.insere(67);
        lista2.insere(90);

        lista1.imprime();
        lista2.imprime();

        listaIntercalada.prim = listaIntercalada.intercalaOrdenada(lista1.prim, lista2.prim);
        listaIntercalada.imprime();
    }
}

