public class Ex04 {

    /*
    4) Suponha que uma frase é representada por uma lista encadeada, sendo que cada elo
    contém uma string representando um token, isto é, um caracter de pontuação ou uma palavra.
    Escreva um algoritmo para retornar a frase inteira.

    Complexidade:
    insere():
    retornaFrase(): O(n), a lista é percorrida pelo while

     */

    public static void main(String[] args) {

            ListaGenerica<String> lista = new ListaGenerica<>();
            lista.insere("Who");
            lista.insere(" ");
            lista.insere("is");
            lista.insere(" ");
            lista.insere("Justice");
            lista.insere(" ");
            lista.insere("Beaver");
            lista.insere("?");

            System.out.println(lista.retornaFrase());
    }
}
