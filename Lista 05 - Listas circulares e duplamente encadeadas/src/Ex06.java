public class Ex06 {

    /*
    6) Uma central de atendimento a clientes tem vários atendentes, mas um número muito maior
    de linhas telefônicas recebendo chamadas. Tais chamadas são colocadas em uma fila de
    espera segundo a ordem de chegada e são atendidas quando possível. Ocorre que algumas
    destas chamadas vêm de longe e, neste caso, se elas ficam esperando na linha, elas causam
    uma despesa muito maior do que as chamadas que vêm de perto. Dessa maneira, deseja-se
    implementar uma solução alternativa que coloque as chamadas em uma fila obedecendo à
    prioridade definida pelo custo (de modo que as mais caras sejam atendidas primeiro) e, em
    caso de empate no custo, deve ser respeitada a ordem de chegada. Efetue então uma
    modelagem Orientada a Objetos desta realidade e implemente a fila de prioridade usando
    Lista Duplamente Encadeada. Para esse propósito, você deve adaptar a classe
    ListaDuplamente vista em sala de aula.
     */

    //Complexidade: O(n), a lista é percorrida para qualquer quais chamadas tem mais custo e decidir onde inseri-las

    public static void main(String[] args) {
        ListaDeChamadas ch = new ListaDeChamadas();

        ch.insere("Pessoa 1 ",20);
        ch.insere("Pessoa 2 ",50);
        ch.insere("Pessoa 3 ",70);
        ch.insere("Pessoa 4 ",50);
        System.out.println("Lista de chamadas: ");
        ch.imprime();

        ch.insere("Pessoa 5 ",90);
        ch.insere("Pessoa 6 ",150);
        ch.insere("Pessoa 7 ",10);
        ch.insere("Pessoa 8 ",45);
        System.out.println("Adicionando mais chamadas: ");
        ch.imprime();


    }
}
