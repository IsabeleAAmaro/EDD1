public class Ex04 {

    /*
    4) Para a classe ListaDuplamente, crie um método que troque a posição de dois elos cujas
    posições na lista são passadas como parâmetros. O protótipo do método é o seguinte:
    public void trocaElos(int indiceElo1, int indiceElo2);
     */

    // Complexidade: O(n)
    public static void main(String[] args) {
        ListaDuplamente l1 = new ListaDuplamente();

        l1.insere(22);
        l1.insere(33);
        l1.insere(44);
        l1.insere(55);

        System.out.println("Lista com elos nao trocados:");
        l1.imprime();

        l1.trocarElos(1,3);

        System.out.println("Lista com elos trocados:");
        l1.imprime();
    }
}
