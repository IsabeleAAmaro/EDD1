public class Ex03 {

    /*
    3) Implemente agora um construtor que faça uma operação análoga para a classe
    HeapBinariaMaxima. Esse construtor deve seguir o seguinte protótipo:
    public HeapBinariaMaxima(HeapBinariaMinima heapMinima);
     */

    //Complexidade: O(n)

    public static void main(String[] args) {

        int[] vetor = {1, 5, 6, 3, 7, 2};
        HeapBinariaMinima heap = new HeapBinariaMinima(vetor.length, vetor);
        System.out.println("Heap original");
        heap.imprime();

        HeapBinariaMaxima novaHeap = new HeapBinariaMaxima(heap);
        System.out.println("Heap máxima:");
        novaHeap.imprime();

    }
}
