public class Ex02 {

    /* 2) Para a classe Lista Circular, crie um método para concatenar alternadamente
    elementos da lista corrente, para a qual o método é chamado, com a lista lista2 recebida
    como parâmetro. O resultado da operação deve ser colocado em uma terceira lista que será
    retornada. O protótipo do método é o seguinte:
    public ListaCircular merge(ListaCircular lista2); */

    //Complexidade: O(m * n), as duas listas são percorridas.

    public static void main(String[] args) {
        ListaCircular l1 = new ListaCircular();
        ListaCircular l2 = new ListaCircular();
        ListaCircular listaMerge = new ListaCircular();

       l1.insere(1);
       l1.insere(2);
       l1.insere(3);
       l1.insere(4);

       l2.insere(22);
       l2.insere(33);
       l2.insere(44);
       l2.insere(55);

       l1.imprime();
       l2.imprime();

       listaMerge = l1.merge(l2);
       listaMerge.imprime();
    }
}
