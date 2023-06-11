public class Ex05 {
    /*
    5) Implemente um método que receba um conjunto conj2 e obtenha o conjunto diferença
    entre o conjunto corrente e conj2. O método deve retornar o conjunto resultante e deve
    seguir o protótipo abaixo:
     */

    //Complexidade do diferença: O(n + m)

    public static void main(String[] args) {

        ConjGenerico<Integer> c1 = new ConjGenerico<>();
        ConjGenerico<Integer> c2 = new ConjGenerico<>();
        ConjGenerico<Integer> dif;

        c1.insere(1);
        c1.insere(2);
        c1.insere(3);
        c1.insere(4);
        c1.insere(5);
        c1.insere(6);
        c1.insere(7);

        c2.insere(3);
        c2.insere(4);
        c2.insere(5);
        c2.insere(6);
        c2.insere(9);

        dif = c1.diferenca(c2);
        dif.imprime();
    }
}
