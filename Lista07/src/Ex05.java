public class Ex05 {

    public static void main(String[] args) {
        Arvbin<Integer> no1 = new Arvbin<>(5);
        Arvbin<Integer> no2 = new Arvbin<>(10);
        Arvbin<Integer> no3 = new Arvbin<>(3);
        Arvbin<Integer> no4 = new Arvbin<>(11);
        Arvbin<Integer> no5 = new Arvbin<>(32);

        no2.defineEsq(no4);
        no2.defineDir(no5);
        no1.defineEsq(no2);
        no1.defineDir(no3);

        System.out.println("\nÁrvore Original");
        no1.imprimeEmOrdem();

        System.out.println("\n\nCom nova raiz:");
        no1 = no1.tornaRaiz(3);
        no1.imprimeEmOrdem();

    }
}
