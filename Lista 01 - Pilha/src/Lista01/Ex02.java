package Oficiais;

import java.util.Scanner;

public class Ex02 {

    /*
    Escreva uma função para determinar se uma cadeia de caracteres (string) é da forma: a
    D b D c D ... D z onde cada cadeia de caracteres, a, b, ..., z, é da forma do exercício
    descrito acima. Portanto, uma cadeia de caracteres estará no formato correto se consistir
    em qualquer número de cadeias deste tipo ( x C y ), separadas pelo caractere ‘D’. Em cada
    ponto, você só poderá ler o próximo caractere da cadeia (é mandatório o uso de pilha).
    Escreva uma função para determinar se uma cadeia de caracteres (string) é da forma: a
    D b D c D ... D z onde cada cadeia de caracteres, a, b, ..., z, é da forma do exercício
    descrito acima. Portanto, uma cadeia de caracteres estará no formato correto se consistir
    em qualquer número de cadeias deste tipo ( x C y ), separadas pelo caractere ‘D’. Em cada
    ponto, você só poderá ler o próximo caractere da cadeia (é mandatório o uso de pilha).
     */

    public static boolean formatoXCY(String xcy) {
        Pilha2 pilha = new Pilha2(xcy.length());
        boolean formatoXCY = true;
        int posC = 0;
        int j = 0;

        for (int i = 0; xcy.charAt(i) != 'C'; i++) {
            pilha.empilha(xcy.charAt(i));
        }

        while (j < xcy.length()) {
            if (xcy.charAt(j) == 'C') {
                posC = j;
                break;
            }
            j++;
        }

        for (int k = posC + 1; k <= xcy.length() - 1; k++)
            if (pilha.retornaTopo() == xcy.charAt(k)) {
                pilha.desempilha();
            } else {
                formatoXCY = false;
                break;
            }

        return formatoXCY;
    }

    public static boolean formatoD(String D) {
        Pilha2 aux = new Pilha2(D.length());

        char[] ch;
        int c;
        boolean formato = true;

        for (int i = 0; i < D.length(); i++) {

            if (D.charAt(0) == 'D') {
                formato = false;
                break;
            }

            if (D.charAt(i) != 'D') {
                aux.empilha(D.charAt(i));

            } else {
                c = 0;
                ch = new char[aux.tamanho()];
                while (!aux.vazia()) {
                    ch[c] = aux.retornaTopo();
                    aux.desempilha();
                    c++;
                }

                String stringAux = String.valueOf(ch);
                if (!formatoXCY(stringAux)) {
                    formato = false;
                    break;
                }

            }
        }
        return formato;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma string no formato a D b D c D z:");
        String s = scan.nextLine();

        if (formatoD(s)) System.out.println("A string está no formato correto.");
        else System.out.println("A string não está no formato correto.");
    }
}
