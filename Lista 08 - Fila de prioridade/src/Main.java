public class Main
{
    public static void main(String args[])
    {
        int tamanho = 6;
        int vetor[] = {1, 5, 6, 3, 7, 2};

        HeapBinariaMinima heap = new HeapBinariaMinima(tamanho, vetor);

        heap.imprime();

        heap.fazVazia();

        heap.insere(4);

        heap.insere(6);

        heap.insere(1);

        heap.imprime();

        System.out.println(heap.min());

        heap.removeMin();

        System.out.println(heap.min());

        heap.imprime();

        vetor = new int[]{22, 4, 35, 12, 3, 18, 12, 55};

        HeapBinariaMaxima heapMaxima = new HeapBinariaMaxima(tamanho, vetor);

        System.out.print("Vetor original: ");

        heapMaxima.imprimeTamanho();

        /* Chamada ao método que implementa o algoritmo de ordenação Heapsort. */
        heapMaxima.heapsort();

        System.out.print("Vetor ordenado: ");

        heapMaxima.imprimeTamanho();
    }
}