public class Ex05 {

    /*
    5) Desenvolva um método que, dado um parâmetro T valor, torne o nó que contém esse
    valor a nova raiz da árvore. O método deve possuir o protótipo abaixo:
    public Arvbin<T> tornaRaiz(T valor);
     */

    //Complexidade do tornaRaiz: O(n)
    //Complexidade do imprimeEmOrdem: O(n)

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

        System.out.println("\nÁrvore Original");
        no1.imprimeEmOrdem();

        System.out.println("\nCom nova raiz:");
        no1 = no1.tornaRaiz(3);
        no1.imprimeEmOrdem();

    }
}
