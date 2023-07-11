public class Ex02 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 7, 0, 11, 18};

        ArvBinBusca<Integer, Integer> arv = new ArvBinBusca<>();
        arv.constroiArvore(vetor);
        arv.mostra();

    }
}
