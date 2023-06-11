public class Ex01 {

    /*
    1) Crie métodos que retornem o menor e o maior elementos de um conjunto em tempo
    constante, isto é, cujas complexidades correspondam a O(1).
     */
    //Complexidades: getMaior O(1) e getMenor O(1)

    public static void main(String[] args) {
        ConjGenerico<Integer> c1 = new ConjGenerico<>();

        c1.insere(4);
        c1.insere(6);
        c1.insere(9);
        c1.insere(10);
        c1.insere(11);

        int maior = c1.getMaior();
        System.out.println("Maior elemento: "+ maior);

        int menor = c1.getMenor();
        System.out.println("Menor elemento: " + menor);

    }
}
