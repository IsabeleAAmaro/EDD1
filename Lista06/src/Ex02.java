public class Ex02 {

    /*
    2) Implemente um método que receba um conjunto conj2 e verifique se o conjunto
    corrente, para o qual o método é chamado, é igual ao conjunto conj2. O método deve
    retornar true caso os dois conjuntos sejam iguais e false, caso contrário. O protótipo do
    método é o seguinte:
     */

    public static void main(String[] args) {
        ConjGenerico<Integer> c1 = new ConjGenerico<>();
        ConjGenerico<Integer> c2 = new ConjGenerico<>();

        c1.insere(4);
        c1.insere(6);
        c1.insere(9);
        c1.insere(10);
        c1.insere(11);

        c2.insere(4);
        c2.insere(6);
        c2.insere(9);
        c2.insere(10);
        c2.insere(11);

        if(c1.eIgual(c2)) {
            System.out.println("Os conjuntos são iguais");
        } else {
            System.out.println("Não são iguais");
        }

    }
}
