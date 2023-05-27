public class Ex05 {

    /*
    5) Para a classe ListaDuplamente, crie um método que use recursão para verificar se a
    lista corrente, isto é, para a qual o método é chamado, é igual a uma lista lista2 passada
    como parâmetro. Note que você pode criar um ou mais métodos auxiliares. O método deve
    obedecer ao seguinte protótipo:
    public boolean verificaIgualdade(ListaDuplamente lista2);
     */

    //Complexidade: O(n) porque as listas são percorridas paralelamente.

    public static void main(String[] args) {
        ListaDuplamente l1 = new ListaDuplamente();
        ListaDuplamente l2 = new ListaDuplamente();
        ListaDuplamente l3 = new ListaDuplamente();

        l1.insere(1);
        l1.insere(2);
        l1.insere(3);
        l1.insere(4);

        l2.insere(3);
        l2.insere(6);
        l2.insere(5);
        l2.insere(7);

        l3.insere(1);
        l3.insere(2);
        l3.insere(3);
        l3.insere(4);

        l1.verificaIgualdade(l2);
        l1.verificaIgualdade(l3);
    }
}
