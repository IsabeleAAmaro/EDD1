public class Ex05 {

    /*
    5) Suponha agora uma derivação do exercício anterior, em que se deseje reverter uma
    frase usando listas encadeadas. Além de inverter a ordem da frase em si, também se
    deseja inverter a ordem das letras de cada palavra individualmente. Implemente então um
    método para realizar essa tarefa. Note que cada letra de cada palavra deve estar
    armazenada em um objeto Elo da lista. Tem-se liberdade para pensar na melhor forma de
    modelar tal problema.
     */

    /*
    Complexidade:
    inverteLetras(): O(n * m), executa dois loops
    invertePalavra(): O(n)
     */

    public static void main(String[] args) {

        ListaGenerica<String> frase = new ListaGenerica<>();

        frase.insere("Who");
        frase.insere(" ");
        frase.insere("is");
        frase.insere(" ");
        frase.insere("Justice");
        frase.insere(" ");
        frase.insere("Beaver");
        frase.insere("?");

        System.out.println("Frase invertida:");
        frase.imprime();

        frase.inverteLetras();
        System.out.println("Letras Invertidas:");
        frase.imprime();


    }
}
