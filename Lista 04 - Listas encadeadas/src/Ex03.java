import java.util.Scanner;

public class Ex03 {
    /*
    3) Implemente uma lista ordenada genérica (usando Generics de Java) que armazene nomes
    em ordem alfabética. Lembre-se de manter a prioridade de ordenação da lista nos métodos
    implementados. Para cada método, diga a sua complexidade.
     */

    /*
    Complexidade:
    Insere(): O(n)
    Remove(): O(n)
     */

    public static void main(String[] args) {
        ListaOrdenadaGenerica<String> lista = new ListaOrdenadaGenerica<>();
        String nome;
        int opcao;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1: Inserir nome");
            System.out.println("2: Imprimir nomes");
            System.out.println("0: Sair");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome desejado:");
                    nome = input.nextLine();
                    lista.insere(nome);
                }
                case 2 -> {
                    System.out.println("Nomes em ordem alfabetica:");
                    lista.imprime();
                }
                default -> {
                    if (opcao != 0) {
                        System.out.println("Entrada inválida, digite novamente");
                    }
                }
            }
        }while(opcao != 0);
    }
}
