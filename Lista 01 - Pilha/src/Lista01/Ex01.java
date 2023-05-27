package Oficiais;

import java.util.Scanner;

public class Ex01 {

    /*
    1) Escreva uma função para determinar se uma cadeia de caracteres (string) é da forma: x
    C y onde x e y são cadeias de caracteres compostas por letras ‘A’ e/ou ‘B’, e y é o inverso
    de x. Isto é, se x = “ABABBA”, y deve equivaler a “ABBABA”. Em cada ponto, você só
    poderá ler o próximo caractere da cadeia.
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira uma string no formato xCy:");
        String xcy = input.nextLine();


        if (formatoXCY(xcy)) {
            System.out.println("Está na forma xCy.");
        } else System.out.println("Não está na forma correta.");
        }
    }