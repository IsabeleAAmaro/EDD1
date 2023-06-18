public class Ex03 {

    /*
    3) Duas árvores binárias são similares se: as duas são vazias ou as duas não são vazias, e
    se suas subárvores da esquerda são similares e se suas subárvores da direita são também
    similares. Dessa forma, implemente um método de seguinte protótipo para determinar se uma
    árvore passada como parâmetro é similar à árvore corrente:
    public boolean eSimilar(Arvbin<T> arvore);

     */

    //Complexidade do eSimilar: O(log n)
    //Complexidade do imprimeEmOrdem: O(n)

    public static void main(String[] args) {

        Arvbin<Integer> no1 = new Arvbin<>(5);
        Arvbin<Integer> no2 = new Arvbin<>(10);
        Arvbin<Integer> no3 = new Arvbin<>(3);
        Arvbin<Integer> no4 = new Arvbin<>(11);
        Arvbin<Integer> no5 = new Arvbin<>(32);

        no2.defineEsq(no4);
        no2.defineDir(no5);
        no3.defineEsq(no4);
        no3.defineDir(no5);
        no1.defineEsq(no2);
        no1.defineDir(no3);

        System.out.println("Árvore:");  // Imprime a árvore
        no1.imprimeEmOrdem();

        System.out.println("\n\nNo da esquerda é igual o nó da raiz?");
        System.out.println(no2.eSimilar(no1));
        System.out.println("\nNo da esquerda é igual o nó da direita?");
        System.out.println(no2.eSimilar(no3));
    }
}
