public class Ex05 {

    /*
    5) Implemente um método não recursivo que verifica se uma árvore armazenada em um vetor
    de inteiros corresponde a uma Heap Máxima, isto é, se todo nó possui uma chave maior ou
    igual às chaves dos seus filhos. O método deve possuir o seguinte protótipo:
    public boolean verificaPropriedadeHeap(int[] vetor);
     */

    //Complexidade:
    //armazenaArvbinVetor: O(n)
    //verificaPropriedade: O(n)

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

        HeapBinariaMaxima heap = new HeapBinariaMaxima(10);
        int[] vetor = no1.armazenaArvbinVetor(no1);

        System.out.println("O vetor1 é uma heap máxima? " + heap.verificaPropriedadeHeap(vetor));
    }

}