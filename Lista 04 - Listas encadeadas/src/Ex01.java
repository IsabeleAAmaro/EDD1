public class Ex01 {

    /*
    1) Qual a complexidade do método tamanho() presente na classe Lista disponibilizada?
    É possível melhorá-lo? Caso seja possível, faça as alterações necessárias para tal e diga a
    complexidade do novo método. Você tem liberdade para criar novos métodos e atributos,
    assim como modificar métodos e atributos já existentes na classe.
     */

    public static void main(String[] args) {

        //Complexidade da tamanho antes O(n)
        //Complexidade agora O(1)

       Lista l1 = new Lista();

       l1.insere(3);
       l1.insere(4);
       l1.insere(5);
       l1.insere(8);

       int tamanho = l1.tamanho();
       System.out.println("Tamanho: " + tamanho);
    }
}
