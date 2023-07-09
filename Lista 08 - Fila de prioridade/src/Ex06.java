public class Ex06 {

    /*
    6) Implemente um método que remova e retorne o elemento na i-ésima posição do vetor
    representativo de uma Heap Máxima. O protótipo a ser seguido está abaixo:
    public boolean remove(int i);
     */

    //Complexidade do remove(): O(log n)

    public static void main(String[] args) {
        int[] vetor = new int[]{10, 6, 3, 1, 5, 7};
        HeapBinariaMaxima heapMaxima = new HeapBinariaMaxima(vetor.length, vetor);

        System.out.println("Heap original: ");
        heapMaxima.imprime();

        if(heapMaxima.remove(1)) {
            System.out.println("Elemento removido com sucesso");
            System.out.println("Heap depois da remoção");
            heapMaxima.imprime();
        } else {
            System.out.println("Não foi possível remover o elemento");
        }
    }
}
