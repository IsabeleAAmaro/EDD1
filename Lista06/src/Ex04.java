public class Ex04 {
    public static void main(String[] args) {
        ConjGenerico<Integer> c1 = new ConjGenerico<>();
        ConjGenerico<Integer> c2 = new ConjGenerico<>();

        //tá certo isso? é basicamente checando se existe interseção??

        c1.insere(4);
        c1.insere(6);
        c1.insere(9);
        c1.insere(10);
        c1.insere(11);

        c2.insere(3);
        c2.insere(4);
        c2.insere(5);
        c2.insere(6);
        c2.insere(9);
        c2.insere(10);
        c2.insere(11);

        if(c1.eSubconjunto(c2)) {
            System.out.println("eh subconjunto");
        }else{
            System.out.println("Não é");
        }
    }
}
