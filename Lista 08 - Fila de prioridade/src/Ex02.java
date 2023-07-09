public class Ex02 {

    /*
    2) Para a classe HeapBinariaMinima, crie um construtor que receba uma Heap Máxima
    como parâmetro e a converta em Heap Mínima. Esse construtor deve possuir o protótipo
    abaixo:
    public HeapBinariaMinima(HeapBinariaMaxima heapMaxima);
     */

    //Complexidade: O(n + n log n)

    public static void main(String[] args) {
       int[] vetor = new int[]{10, 6, 3, 1, 5, 7};
       HeapBinariaMaxima heapMaxima = new HeapBinariaMaxima(vetor.length, vetor);
       System.out.println("Heap original: ");
       heapMaxima.imprime();

       HeapBinariaMinima heapTransformada = new HeapBinariaMinima(heapMaxima);
       System.out.println("Heap mínima: ");
       heapTransformada.imprime();
    }
}
