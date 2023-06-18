public class Ex06 {

    public static void main(String[] args) {

        Arvbin<Integer> n1 = new Arvbin<>(2),
                n2 = new Arvbin<>(1),
                n3 = new Arvbin<>(6),
                n4 = new Arvbin<>(4),
                n5 = new Arvbin<>(3),
                n6 = new Arvbin<>(7),
                n7 = new Arvbin<>(5);

        n2.defineEsq(n1);
        n2.defineDir(n5);
        n5.defineEsq(n4);
        n5.defineDir(n7);
        n4.defineEsq(n3);
        n4.defineDir(n6);

        if(n2.eBalanceada()) {
            System.out.println("É balanceada");
        }else{
            System.out.println("Não é balanceado");
        }
    }
}
