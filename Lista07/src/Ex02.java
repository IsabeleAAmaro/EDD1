public class Ex02 {

    /*
    2) Implemente um método que busque por um parâmetro Arvbin<Integer> no e, a partir
    desse no, retorne a soma dos valores armazenados nos nós da subárvore enraizada em no.
    O método deve possuir o protótipo abaixo:
    public static Integer retornaSomaSubArvore(Arvbin<Integer> no);
     */

    //Complexidade do retornaSomaSubArvore: O(n)
    //Complexidade do imprimeEmOrdem: O(n)

    public static void main(String[] args) {

        Arvbin<Integer> no1 = new Arvbin<>(5);
        Arvbin<Integer> no2 = new Arvbin<>(10);
        Arvbin<Integer> no3 = new Arvbin<>(3);
        Arvbin<Integer> no4 = new Arvbin<>(11);
        Arvbin<Integer> no5 = new Arvbin<>(45);

        no2.defineEsq(no4);
        no2.defineDir(no5);
        no1.defineEsq(no2);
        no1.defineDir(no3);

        System.out.println("Arvore:");  // Mostra árvore
        no1.imprimeEmOrdem();

        System.out.println("\n\nSoma das subs arvores:"); // Mostra a soma
        Integer soma = Arvbin.retornaSomaSubArvore(no1);
        System.out.println(soma);

        System.out.println("Soma das subs arvores esquerda:");
        soma = Arvbin.retornaSomaSubArvore(no2);
        System.out.println(soma);

        System.out.println("Soma das subs arvores direita:");
        soma = Arvbin.retornaSomaSubArvore(no3);
        System.out.println(soma);



    }
}
