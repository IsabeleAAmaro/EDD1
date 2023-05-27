public class Ex03 {

    /*
    3) Implemente um método que inverta a ordem de uma lista circular e retorne a lista invertida.
    O protótipo do método é o seguinte:
    public ListaCircular inverteLista();

    //Complexidade: O(n), a lista é percorrida completamente.
     */

    public static void main(String[] args) {
        ListaCircular l1 = new ListaCircular();

        l1.insere(10);
        l1.insere(20);
        l1.insere(30);
        l1.insere(40);
        l1.insere(50);
        l1.insere(60);

        System.out.println("Lista:");
        l1.imprime();

        l1 = l1.inverteLista();

        System.out.println("Lista invertida:");
        l1.imprime();

    }
}
