public class Ex01 {

    /*
     Adicione métodos na classe Arvbin<T> que imprimam os nós da árvore em Pré-ordem,
    Pós-ordem e em Ordem. Use as seguintes assinaturas para os métodos: public void
    imprimePreOrdem(), public void imprimePosOrdem() e public void
    imprimeEmOrdem(), respectivamente
     */

    //Complexidade do imprimePreOrdem: O(n)
    //Complexidade do imprimePosOrdem: O(n)
    //Complexidade do imprimeEmOrdem: O(n)

    public static void main(String[] args) {

        Arvbin<Integer> no1 = new Arvbin<>(9),
        no2 = new Arvbin<>(1),
        no3 = new Arvbin<>(55);

        no1.defineEsq(no2);
        no1.defineDir(no3);

        System.out.println("\nPré ordem: ");
        no1.imprimePreOrdem();

        System.out.println("\nPós ordem: ");
        no1.imprimePosOrdem();

        System.out.println("\nEm ordem: ");
        no1.imprimeEmOrdem();
    }
    
}
