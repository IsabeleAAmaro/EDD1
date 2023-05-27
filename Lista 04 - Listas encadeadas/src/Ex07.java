public class Ex07 {
    /*
    7) No desenvolvimento de um jogo, é necessário armazenar os inimigos que seu personagem
    está enfrentando na fase. Um inimigo é definido como uma instância da classe “Inimigo”.
    Considere que o método efetuarDano(Inimigo inimigo, double dano)
    remove o inimigo da estrutura caso o dano sofrido reduza a vida do objeto inimigo a zero.
    Dessa maneira, implemente essa estrutura de dados para o jogo em questão.
     */

    //Complexidade do efetuarDano: O(n), porque usa o metodo de busca para percorrer a lista de inimigos

    public static void main(String[] args) {
        ListaInimigo lista = new ListaInimigo();

        Inimigo ini1 = new Inimigo(100);
        Inimigo ini2 = new Inimigo(85);
        Inimigo ini3 = new Inimigo(78);

        lista.insere(ini1);
        lista.insere(ini2);
        lista.insere(ini3);

        lista.efetuarDano(ini1,20);
        lista.efetuarDano(ini2,45);
        lista.efetuarDano(ini3,78);
        //ini3 morre

        lista.imprime();
    }
}