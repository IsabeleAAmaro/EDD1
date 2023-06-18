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

        Arvbin<Integer> no1 = new Arvbin<>(9);
        Arvbin<Integer> no2 = new Arvbin<>(1);
        Arvbin<Integer> no3 = new Arvbin<>(55);

        no1.defineEsq(no2);
        no1.defineDir(no3);

        System.out.println("Pré ordem");
        no1.imprimePreOrdem();
        System.out.println();

        System.out.println("Pós ordem");
        no1.imprimePosOrdem();
        System.out.println();

        System.out.println("Em ordem");
        no1.imprimeEmOrdem();
        
    }
    
}
