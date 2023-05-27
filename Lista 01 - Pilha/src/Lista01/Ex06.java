package Oficiais;
import java.util.Scanner;

public class Ex06 {

    /*
    6) Elabore um método que retorne as letras invertidas das palavras de uma frase recebida
    por parâmetro, preservando a ordem das palavras na frase. Por exemplo “a maçã está
    podre”, deve ter como saída: “a ãçam átse erdop”. As operações básicas de uma pilha,
    push e pop, devem ser usadas.
     */

    public static String invertePalavras(String frase) {
        Pilha2 pilha = new Pilha2();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == ' ' || i == frase.length() - 1) {
                if (i == frase.length() - 1) {
                    pilha.empilha(c);
                }

                while (!pilha.vazia()) {
                    res.append(pilha.desempilha());
                }

                if (c == ' ') {
                    res.append(c);
                    //corrige erro de adicionar espaço extra no final
                }
            } else {
                pilha.empilha(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String f;

        System.out.println("Digite a frase a ser invertida: ");
        f = input.nextLine();

        System.out.println(invertePalavras(f));
    }

}
