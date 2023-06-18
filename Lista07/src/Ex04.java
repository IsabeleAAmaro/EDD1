public class Ex04 {

    /*
    4) Implemente um método que recebe um parâmetro T valor e apaga o nó em que esse
    valor está armazenado. Esse método deve realizar um tratamento para que os demais nós
    da árvore se mantenham (isto é, não sejam perdidos) e deve possuir o seguinte protótipo:
    public Arvbin<T> delete(T valor);
     */

    //Complexidade de delete: O(n)
    //Complexidade do auxDelete: O(n)

    public static void main(String[] args) {
        Arvbin<Integer> no1 = new Arvbin<>(5),
        no2 = new Arvbin<>(10),
        no3 = new Arvbin<>(3),
        no4 = new Arvbin<>(11),
        no5 = new Arvbin<>(32);

        no2.defineEsq(no4);
        no2.defineDir(no5);
        no1.defineEsq(no2);
        no1.defineDir(no3);

        System.out.println("Árvore Originalmente:");
        no1.mostra();

        no1.delete(11);
        System.out.println("\nArvore depois de deletar valor");
        no1.mostra();

        no1.delete(3);
        System.out.println("\nArvore depois de deletar valor");
        no1.mostra();
    }
}
